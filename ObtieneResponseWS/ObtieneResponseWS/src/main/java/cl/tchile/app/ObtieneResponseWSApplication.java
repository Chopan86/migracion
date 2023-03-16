package cl.tchile.app;

import cl.tchile.app.helper.SaveFilesOracle;
import cl.tchile.app.main.delegate.*;

import java.io.IOException;
import java.sql.SQLException;

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

    /**
     * The Constant LOGGER.
     */
    private static final Logger LOGGER = LogManager.getLogger(ObtieneResponseWSApplication.class);

    /**
     * The consulta cliente rut linea C delegate.
     */
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

	@Autowired
	ConsultaApelAlturas consultaApelAlturas;
	
	@Autowired
	SaveFilesOracle saveFilesOracle;

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
        try {
        	
        	saveFilesOracle.getConnection();
        	LOGGER.info("Conecction OK");
//    	consultaClienteRutLineaCDelegate.consultaClienteRutLineaCImpl();
//		consultaClienteRutLineaCDelegate.consultaClienteRutlineaCxFono();
//		consultaClienteRutLineaBDelegate.consultaClienteRutLineaBImpl();
//		consultaClienteRutLineaBDelegate.consultaClienteRutlineaBxFono();
//		consultaPsPrincipalesLineasDelegate.consultaPsPrincipalesLineas();
//		consultaQueryProductDelegate.consultaQueryProduct();
//		consultaAFACDelegate.consultaAfac();
//        consultaListaPSFrontEndDelegate.consultaPsFrontEnd();
//        consultaPsPorLiena.consultaPsPorLinea();
        consultaListaPsLineaV.consultaListaPsLineaV8();

//		consultaApelAlturas.consultaApelAlturas();
//
			saveFilesOracle.closeConnection();
			LOGGER.info("Connection close");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}

        System.exit(codigoSalida);
    }

}
