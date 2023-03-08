package cl.tchile.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;

/**
 * The Class ConsultaPSPrincipalesLineasConfig.
 */
@EnableWs
@Configuration
public class ConsultaPSPrincipalesLineasConfig {

	/**
	 * Consulta cliente rut linea C definition.
	 *
	 * @return the wsdl 11 definition
	 */
	@Bean(name="consultaPSPrincipalesLineas")
	public Wsdl11Definition consultaPSPrincipalesLineasDefinition() {
		SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
		wsdl11Definition.setWsdl(new ClassPathResource("/wsdl/consultaPSPrincipalesLineas.wsdl"));
		return wsdl11Definition;
	}
	
}
