package edu.cecar.controladores;

/**
*
* Clase: Expression class is undefined on line 3, column 12 in Templates/Classes/Class.java.
*
* versión:0.1
*
* fecha Creación: 06/09/2019
*
* fecha Modificación: 13/09/2019
*
* Autor: Carmen Salgado...
*
* @author Casalg
* @class Expression class is undefined on line 14, column 12 in Templates/Classes/Class.java.
*
* Copyright: CECAR
*
**//**
*
* ESTA CLASE PERMITE CONTROLAR LAS CONSULTAS EN EXAMPLE...
*
**/

import edu.cecar.componentes.singletons.SingletonConexionBD;
import edu.cecar.modelos.Example;
import java.sql.*;
import java.util.*;


public class ControladorExample {
    
 public static List<Example> registros;
  
  static {
   try {
     registros = consultarEmpleado();
   }catch (SQLException e) {
     e.printStackTrace();
    }
  }
  
  private static List<Example> consultarEmpleado() throws SQLException{
   
   List<Example> registros = new ArrayList<Example>();
    PreparedStatement ps = SingletonConexionBD.getInstance().
    prepareStatement(" " + "select * from manpower.examples");
        
     ResultSet resultSet = ps.executeQuery();
      while(resultSet.next()){
       Example example = new Example(resultSet.getString(1), 
                                          resultSet.getString(2), 
                                          resultSet.getString(3), 
                                          resultSet.getString(4));
        registros.add(example);
      }
   
   return registros;
  }
     
     public static void consultarPorDate(String dateBusq){
        long t1 = System.currentTimeMillis();
        registros.stream().filter(

                e -> e.getDate_of_stop().equals(dateBusq)

        ).forEach(ex-> System.out.println(
                ex.getDate_of_stop()+ " " +
                        ex.getFatal() + " " +
                        ex.getAlcohol() + " " +
                        ex.getGender()
        ));
        long t2 = System.currentTimeMillis();

        System.out.println("Tiempo de demora: " + (double)(t2-t1)/1000+" segundos");
     }
      
      public static void consultarPorGender(String genderBusq){
        long t1 = System.currentTimeMillis();
        registros.stream().filter(

                e -> e.getGender().equals(genderBusq)

        ).forEach(ex-> System.out.println(
                ex.getDate_of_stop() + " " +
                        ex.getFatal() + " " +
                        ex.getAlcohol() + " " +
                        ex.getGender()
        ));
        long t2 = System.currentTimeMillis();

        System.out.println("Tiempo de demora: " + (double)(t2-t1)/1000+" segundos");
    }
      
      public static void consultarPorGenderDate(String genderBusq, String dateBusq){
        long t1 = System.currentTimeMillis();
        registros.stream().filter(

                e -> e.getGender().equals(genderBusq) && e.getDate_of_stop().equals(dateBusq)

        ).forEach(ex-> System.out.println(
                ex.getDate_of_stop() + " " +
                        ex.getFatal() + " " +
                        ex.getAlcohol() + " " +
                        ex.getGender()
        ));
        long t2 = System.currentTimeMillis();

        System.out.println("Tiempo de demora: " + (double)(t2-t1)/1000+" segundos");
    }
      
      public static void ordenarPorGender(){
        long t1 = System.currentTimeMillis();
        registros.stream().sorted(

                Comparator.comparing(Example::getGender)

        ).forEach(ex-> System.out.println(
                ex.getDate_of_stop() + " " +
                        ex.getFatal() + " " +
                        ex.getAlcohol() + " " +
                        ex.getGender()
        ));
        long t2 = System.currentTimeMillis();

        System.out.println("Tiempo de demora: " + (double)(t2-t1)/1000+" segundos");
    }

    public static void ordenarPorDate(){
        long t1 = System.currentTimeMillis();
        registros.stream().sorted(

                Comparator.comparing(Example::getDate_of_stop)

        ).forEach(ex-> System.out.println(
                ex.getDate_of_stop() + " " +
                        ex.getFatal() + " " +
                        ex.getAlcohol() + " " +
                        ex.getGender()
        ));
        long t2 = System.currentTimeMillis();

        System.out.println("Tiempo de demora: " + (double)(t2-t1)/1000+" segundos");
    }

    public static void ordenarPorFatal(){
        long t1 = System.currentTimeMillis();
        registros.stream().sorted(

                Comparator.comparing(Example::getFatal)

        ).forEach(ex-> System.out.println(
                ex.getDate_of_stop() + " " +
                        ex.getFatal() + " " +
                        ex.getAlcohol() + " " +
                        ex.getGender()
        ));
        long t2 = System.currentTimeMillis();

        System.out.println("Tiempo de demora: " + (double)(t2-t1)/1000+" segundos");
    }
  
}
