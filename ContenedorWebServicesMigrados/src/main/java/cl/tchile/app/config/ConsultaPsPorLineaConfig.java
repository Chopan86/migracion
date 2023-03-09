package cl.tchile.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;

@EnableWs
@Configuration
public class ConsultaPsPorLineaConfig {

	
	/**
	 * Consulta cliente rut linea B definition.
	 *
	 * @return the wsdl 11 definition
	 */
	@Bean(name="consultaPsPorLinea")
	public Wsdl11Definition consultaPsPorLineaDefinition() {
		SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
		wsdl11Definition.setWsdl(new ClassPathResource("/wsdlEspeciales/consultaPSporLinea.wsdl"));
		return wsdl11Definition;
	}
	
	
}
