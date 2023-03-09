package cl.tchile.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;

/**
 * The Class ListaPSFrontEndConfig.
 */
@EnableWs
@Configuration
public class ListaPSFrontEndConfig {

	/**
	 * Lista PS front end definition.
	 *
	 * @return the wsdl 11 definition
	 */
	@Bean(name="ListaPSFrontEnd")
	public Wsdl11Definition listaPSFrontEndDefinition() {
		SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
		wsdl11Definition.setWsdl(new ClassPathResource("/wsdl/ListaPSFrontEnd.wsdl"));
		return wsdl11Definition;
	}
}
