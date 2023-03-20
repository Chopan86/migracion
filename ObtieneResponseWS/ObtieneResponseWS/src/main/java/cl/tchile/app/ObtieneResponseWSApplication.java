package cl.tchile.app;

import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import cl.tchile.app.helper.SaveFilesOracle;
import cl.tchile.app.main.delegate.ConsultaAFACDelegate;
import cl.tchile.app.main.delegate.ConsultaApelAlturas;
import cl.tchile.app.main.delegate.ConsultaClienteRutLineaBDelegate;
import cl.tchile.app.main.delegate.ConsultaClienteRutLineaCDelegate;
import cl.tchile.app.main.delegate.ConsultaDatosClienteCuentaDelegate;
import cl.tchile.app.main.delegate.ConsultaListaPSFrontEndDelegate;
import cl.tchile.app.main.delegate.ConsultaListaPsLineaV;
import cl.tchile.app.main.delegate.ConsultaPsPorLiena;
import cl.tchile.app.main.delegate.ConsultaPsPrincipalesLineasDelegate;
import cl.tchile.app.main.delegate.ConsultaQueryProductDelegate;

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
	
	@Autowired
    ConsultaDatosClienteCuentaDelegate consultaDatosClienteCuentaDelegate;

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
//		consultaClienteRutLineaCDelegate.consultaClienteRutlineaCxFono(); //--------------------------- OK
//		consultaClienteRutLineaBDelegate.consultaClienteRutLineaBImpl();
//		consultaClienteRutLineaBDelegate.consultaClienteRutlineaBxFono();// --------------------------- OK
//		consultaPsPrincipalesLineasDelegate.consultaPsPrincipalesLineas(); //-------------------------- OK
//		consultaQueryProductDelegate.consultaQueryProduct();//----------------------------------------- EN PROCESO
//		consultaAFACDelegate.consultaAfac(); //-------------------------------------------------------- OK
//        consultaListaPSFrontEndDelegate.consultaPsFrontEnd(); //------------------------------------- OK
//        consultaPsPorLiena.consultaPsPorLinea();
//        consultaListaPsLineaV.consultaListaPsLineaV8(); //------------------------------------------- EN PROCESO
		
		
		
		/********************
		 * 
		 *  NO EJECUTAR
		 *  
		 *   
		 ********************
		 *   */
//		consultaApelAlturas.consultaApelAlturas(); //-------------------------- OK
//		consultaDatosClienteCuentaDelegate.consultaDatosClienteCuenta(); //---------------------------- OK
//        	int cont = 0;
//        	while (cont < 600) {
//        		cont++;
//        		consultaQueryProductDelegate.validaRespuestaQueryProduct();
//        	    try {
//        	        Thread.sleep(30000); // 
//        	    } catch (InterruptedException e) {
//        	        System.out.println(e);
//        	    }
//        	}	
        	
		
        saveFilesOracle.closeConnection();
			LOGGER.info("Connection close");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}

        System.exit(codigoSalida);
    }

}
