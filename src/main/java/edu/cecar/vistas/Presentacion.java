package edu.cecar.vistas;
/**
*
* Clase: Expression class is undefined on line 3, column 12 in Templates/Classes/Class.java.
*
* versión:0.1
*
* fecha Creación: 13/09/2019
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
* ESTA CLASE PERMITE VISUALIZAR LAS CONSULTAS AL CLIENTE...
*
**/

import edu.cecar.controladores.ControladorExample;
import edu.cecar.modelos.Example;
import java.util.*;
import java.sql.*;

public class Presentacion {
    
 public static void main(String[] args) {
        
  Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        String entrada = "";

        int opc = 0;
        int n = 0;
        List<Example> array;

        array = ControladorExample.registros;
        System.out.println("Se subió tofa la informacion a memoria principal");
        do {
            System.out.println();

            System.out.println("Opciones a realizar en el ArrayList:");
            System.out.println("1. Buscar por Date_of_shop.");
            System.out.println("2. Buscar por Gender.");
            System.out.println("3. Buscar por Date_of_shop & Gender.");
            System.out.println("4. Ordenar por Gender.");
            System.out.println("5. Ordenar por Date.");
            System.out.println("6. Ordenar por Fatal.");
            System.out.println("0. Salir");


            opc =  sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("\n\nEscriba la fecha MM/DD/YYYY: ");
                    entrada = sc1.nextLine();
                    ControladorExample.consultarPorDate(entrada);
                    break;
                case 2:
                    entrada = "";
                    System.out.print("\n\nEscriba el genero F o M: ");
                    entrada = sc1.nextLine();
                    ControladorExample.consultarPorGender(entrada);
                    break;
                case 3:
                    String gender = "", date = "";
                    System.out.println("\n\nEscriba el genero F o M  y  la fecha MM/DD/YYYY: ");
                    System.out.print("gender: ");
                    gender = sc1.nextLine();
                    System.out.println("date_of_shop: ");
                    date = sc.nextLine();
                    ControladorExample.consultarPorGenderDate(gender, date);
                    break;
                case 4:
                    ControladorExample.ordenarPorGender();
                    break;
                case 5:
                    ControladorExample.ordenarPorDate();
                    break;
                case 6:
                    ControladorExample.ordenarPorFatal();
                    break;
            }
        } while (opc != 6);
 
 }

}
