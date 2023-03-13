package cl.tchile.app.webservice.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;

/**
 * The Class WebServiceConfig.
 */
@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

	/**
	 * Message dispatcher servlet.
	 *
	 * @param applicationContext the application context
	 * @return the servlet registration bean
	 */
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);

		return new ServletRegistrationBean(servlet, "/services/*");
	}

}
