/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class InputData {
    private String number1;
    private String number2;
    private String znak;

    public InputData() {
    }
    public void init(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        this.number1= scanner.nextLine();
        System.out.print("Введите знак: ");
        this.znak= scanner.nextLine();
        System.out.print("Введите второе число: ");
        this.number2= scanner.nextLine();
        Calkul calkul = new Calkul();
        System.out.println(calkul.getResult(number1, znak, number2));
        
    }
    public String getNumber1() {
        return number1;
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    @Override
    public String toString() {
        return "InputData{" + "number1=" + number1 + ", number2=" + number2 + '}';
    }
    
}
