package cl.tchile.app.config;

import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import com.zaxxer.hikari.HikariDataSource;


/**
 * The Class OracleConfiguration.
 */
@Configuration
@ConfigurationProperties("oracle")
public class OracleConfiguration {

    /** The dialect. */
    @Value("${bd.dialect}")
    private String dialect;

    /**
     * Entity manager factory.
     *
     * @param datSce the dat sce
     * @return the local container entity manager factory bean
     */
    @Bean
    LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource datSce) {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(datSce);
        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        entityManagerFactoryBean.setPackagesToScan("cl.tchile.app");
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", this.dialect);       
        entityManagerFactoryBean.setJpaProperties(properties);
        return entityManagerFactoryBean;
    }

    /**
     * Data source.
     *
     * @return the data source
     */
    @Bean
    @ConfigurationProperties(prefix="bd")
    public DataSource dataSource() {
    	HikariDataSource dataSource = DataSourceBuilder.create().type(HikariDataSource.class).build();
        return dataSource;
    }

    /**
     * Transaction manager.
     *
     * @return the platform transaction manager
     * @throws SQLException the SQL exception
     */
    @Bean
    public PlatformTransactionManager transactionManager() throws SQLException {
        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(entityManagerFactory(dataSource()).getObject());
        return txManager;
    }
}
