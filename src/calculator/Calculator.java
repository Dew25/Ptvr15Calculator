/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import classes.Division;
import classes.InputData;
import classes.Minus;
import classes.Multiple;
import classes.Pluss;

/**
 *
 * @author Melnikov
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputData inputData = new InputData();
        inputData.setNumber1("11");
        inputData.setNumber2("0");
        System.out.println(inputData.toString());
        Multiple multiple = new Multiple();
        multiple.setNumber1(inputData.getNumber1());
        multiple.setNumber2(inputData.getNumber2());
        System.out.println("Произведение: "+multiple.doMult());
        Pluss pluss = new Pluss();
        pluss.setNumber1(inputData.getNumber1());
        pluss.setNumber2(inputData.getNumber2());
        System.out.println("Сумма: "+pluss.doPluss());      
        Minus minus = new Minus();
        minus.setNumber1(inputData.getNumber1());
        minus.setNumber2(inputData.getNumber2());
        System.out.println("Разность: "+minus.doMinus()); 
        Division division = new Division();
        division.setNumber1(inputData.getNumber1());
        division.setNumber2(inputData.getNumber2());
        System.out.println("Деление: "+division.doDiv());
        
        
        
    }
    
}
