/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Melnikov
 */
public class Division {
    private String number1;
    private String number2;

    public Division() {
    }
    
    public String doDiv(){
        Double num1 = new Double(this.number1);
        Double num2 = new Double(this.number2);
        String result;
        if(num2 != 0){
           Double res = num1 / num2; 
           result = res.toString();
        }else{
            result = "infinity";
        }
        return result;
    }
    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    @Override
    public String toString() {
        return "Division{" + "number1=" + number1 + ", number2=" + number2 + '}';
    }
    
    
}
