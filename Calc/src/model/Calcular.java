/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 55159
 */
public class Calcular {
    public Double number1;
    public Double number2;
    public String operation;
    public String result;
    
    public void solve() {
        switch(operation) {
            case "+":
                result = String.valueOf(number1 + number2);
                break;
            case "-":
                result = String.valueOf(number1 - number2);
                break;
            case "*":
                result = String.valueOf(number1 * number2);
                break;
            case "/":
                result = String.valueOf(number1 / number2);
                break;
        }
    }
    
}
