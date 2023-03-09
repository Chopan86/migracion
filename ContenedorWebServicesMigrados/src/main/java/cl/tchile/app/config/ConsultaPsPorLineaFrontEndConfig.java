package cl.tchile.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;

@EnableWs
@Configuration
public class ConsultaPsPorLineaFrontEndConfig {

	
	/**
	 * Consulta cliente rut linea B definition.
	 *
	 * @return the wsdl 11 definition
	 */
	@Bean(name="consultaPsPorLineaFrontEnd")
	public Wsdl11Definition consultaPsPorLineaFrontEndDefinition() {
		SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
		wsdl11Definition.setWsdl(new ClassPathResource("/wsdlEspeciales/consultaPSporLineaFrontEnd.wsdl"));
		return wsdl11Definition;
	}
	
	
}
