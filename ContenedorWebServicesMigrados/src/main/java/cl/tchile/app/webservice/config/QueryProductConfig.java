package cl.tchile.app.webservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;

/**
 * The Class QueryProductConfig.
 */
@EnableWs
@Configuration
public class QueryProductConfig {
	
	/**
	 * Query product definition.
	 *
	 * @return the wsdl 11 definition
	 */
	@Bean(name="queryProduct")
	public Wsdl11Definition queryProductDefinition() {
		SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
		wsdl11Definition.setWsdl(new ClassPathResource("/wsdl/queryproduct.wsdl"));
		return wsdl11Definition;
	}
}
