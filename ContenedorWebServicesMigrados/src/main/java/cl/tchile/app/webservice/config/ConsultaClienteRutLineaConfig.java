package cl.tchile.app.webservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;

/**
 * The Class ConsultaClienteRutLineaBConfig.
 */
@EnableWs
@Configuration
public class ConsultaClienteRutLineaConfig {
	
	/**
	 * Consulta cliente rut linea B definition.
	 *
	 * @return the wsdl 11 definition
	 */
	@Bean(name="consultaClienteRutLinea")
	public Wsdl11Definition consultaClienteRutLineaBDefinition() {
		SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
		wsdl11Definition.setWsdl(new ClassPathResource("/wsdl/consultaClienteRutLineaB.wsdl"));
		return wsdl11Definition;
	}
}
