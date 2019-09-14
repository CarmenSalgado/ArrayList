package edu.cecar.test;

/**
*
* Clase: Expression class is undefined on line 3, column 12 in Templates/Classes/Class.java.
*
* versión:0.1
*
* fecha Creación: 10/09/2019
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
* ESTA CLASE PERMITE...
*
**/

import edu.cecar.controladores.ControladorExample;
import org.junit.Test;


public class TestControladorExample {
    
 @Test
    public void prueba(){
        ControladorExample.consultarPorDate("03/21/2017");
    }

    @Test
    public void prueba2(){
        ControladorExample.consultarPorGender("M");
    }

    @Test
    public void prueba3(){
        ControladorExample.consultarPorGenderDate("M", "03/21/2017");
    }

    @Test
    public void prueba4(){
        ControladorExample.ordenarPorGender();
    }

    @Test
    public void prueba5(){
        ControladorExample.ordenarPorDate();
    }

    @Test
    public void prueba6(){
        ControladorExample.ordenarPorFatal();
    }

}
