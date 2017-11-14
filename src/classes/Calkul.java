/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author melnikov
 */
public class Calkul {
    private String num1;
    private String znak;
    private String num2;
    
    public Calkul() {
    }
    
    public String getResult(String num1,String znak, String num2){
        this.num1=num1;
        this.znak=znak;
        this.num2=num2;
        String result = null;
        switch (znak) {
            case "+":
                Pluss pluss = new Pluss();
                pluss.setNumber1(this.num1);
                pluss.setNumber2(this.num2);
                result = pluss.doPluss();
                break;
            case "-":
                Minus minus = new Minus();
                minus.setNumber1(this.num1);
                minus.setNumber2(this.num2);
                result = minus.doMinus();
                break;
            case "*":
                Multiple multiple = new Multiple();
                multiple.setNumber1(this.num1);
                multiple.setNumber2(this.num2);
                result = multiple.doMult();
                break;
            case "/":
                Division division = new Division();
                division.setNumber1(this.num1);
                division.setNumber2(this.num2);;
                result = division.doDiv();
                break;
            default:
                result = "Неправильно введен знак";
        }
        return result;
    }
}
