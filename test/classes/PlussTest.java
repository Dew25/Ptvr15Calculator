/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jvm
 */
public class PlussTest {
    

    
    
    public PlussTest() {

    }
   
    
    /**
     * Test of doPluss method, of class Pluss.
     */
    @Test
    public void testDoPluss() {
        String num1 = "4";
        String num2 = "5";
        System.out.print("doPluss: ");
        Pluss instance = new Pluss();
        instance.setNumber1(num1);
        instance.setNumber2(num2);
        String expResult = "9.0";
        String result = instance.doPluss();
        System.out.printf("%s + %s = %s%n",num1,num2,result);
        assertEquals(expResult, result);
    }
    
}
