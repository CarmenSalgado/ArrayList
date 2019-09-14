package edu.cecar.componentes.singletons;
/**
 *
 * Clase: ConectarMySQL
 * 
 * @version: 0.1
 *  
 * @since: 5/08/2019
 * 
 * Fecha de Modificaci�n:
 * 
 * @author: Jhon Jaime Mendez
 * 
 * Copyright: CECAR
 *//**
 *
 * Singleton que devuelve la conexion a una Base de datos
 */


import edu.cecar.componentes.basesDeDatos.ConectarMySQL;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SingletonConexionBD {
    
    private static Connection connection;
    
  /*  private static Connection connection1 = new 
                    ConectarMySQL(null, null, null, null)
                    .getConnection();*/
    
    public static Connection getInstance() {
        
        if (connection == null) {
            
            try {
                Properties properties = new Properties();

                properties.load(
                        new FileInputStream
                        ("recursos/Conexion.properties"));

                connection = new 
                    ConectarMySQL (properties.getProperty("host"),
                            properties.getProperty("baseDatos"),"3307",
                            properties.getProperty("usuario"),
                    properties.getProperty("password"))
                    .getConnection();

            } catch (Exception ex) {
                Logger.getLogger(SingletonConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        }
        
        return connection;
    }
    
     public Connection getInstance1() {
        
        return connection;
    }
    
}
