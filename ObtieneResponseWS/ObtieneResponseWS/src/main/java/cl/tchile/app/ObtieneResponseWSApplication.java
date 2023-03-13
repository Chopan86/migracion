package cl.tchile.app;

import cl.tchile.app.main.delegate.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * The Class ObtieneResponseWSApplication.
 */
@SpringBootApplication
@ComponentScan("cl.tchile")
public class ObtieneResponseWSApplication implements CommandLineRunner { 	

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LogManager.getLogger(ObtieneResponseWSApplication.class);

	/** The consulta cliente rut linea C delegate. */
	@Autowired
	ConsultaClienteRutLineaCDelegate consultaClienteRutLineaCDelegate;

	@Autowired
	ConsultaClienteRutLineaBDelegate consultaClienteRutLineaBDelegate;
	@Autowired
	ConsultaPsPrincipalesLineasDelegate consultaPsPrincipalesLineasDelegate;
	@Autowired
	ConsultaListaPSFrontEndDelegate consultaListaPSFrontEndDelegate;
	@Autowired
	ConsultaQueryProductDelegate consultaQueryProductDelegate;
	@Autowired
	ConsultaAFACDelegate consultaAFACDelegate;

	@Autowired
	ConsultaPsPorLiena consultaPsPorLiena;

	@Autowired
	ConsultaListaPsLineaV consultaListaPsLineaV;


	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(ObtieneResponseWSApplication.class, args);
	}
	
    /**
     * Run.
     *
     * @param args the args
     */
    @Override
    public void run(String... args) {
    	LOGGER.info("Inicia Ejecucion");
    	Integer codigoSalida = 0;
//    	consultaClienteRutLineaCDelegate.consultaClienteRutLineaCImpl();
//		consultaClienteRutLineaCDelegate.consultaClienteRutlineaCxFono();
//		consultaClienteRutLineaBDelegate.consultaClienteRutLineaBImpl();
//		consultaClienteRutLineaBDelegate.consultaClienteRutlineaBxFono();
// TODO: correr los meotdos de abajo

//		consultaPsPrincipalesLineasDelegate.consultaPsPrincipalesLineas();
//		consultaListaPSFrontEndDelegate.consultaPsFrontEnd();
//		consultaQueryProductDelegate.consultaQueryProduct();
//		consultaAFACDelegate.consultaAfac();
//		consultaPsPorLiena.consultaPsPorLinea();
		consultaListaPsLineaV.consultaListaPsLineaV8();


    	System.exit(codigoSalida);
    }

  
}
