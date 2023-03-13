package cl.tchile.app.webservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;

/**
 * The Class ListaPsLineaV8Config.
 */
@EnableWs
@Configuration
public class ListaPsLineaV8Config {
	
	/**
	 * Lista ps linea V 8 definition.
	 *
	 * @return the wsdl 11 definition
	 */
	@Bean(name="listaPsLineaV8")
	public Wsdl11Definition listaPsLineaV8Definition() {
		SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
		wsdl11Definition.setWsdl(new ClassPathResource("/wsdlEspeciales/listaPsLineaV8.wsdl"));
		return wsdl11Definition;
	}
	
}
