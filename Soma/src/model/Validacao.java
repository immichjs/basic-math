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
public class Validacao {
    public String num1;
    public String num2;
    public Double number1;
    public Double number2;
    public String message;
    public String operation;
    
    public void validate() {
        message = "";
        
        try {
            number1 = Double.parseDouble(num1);
            number2 = Double.parseDouble(num2);
            if (operation.equals("/") && number2.equals(0)) {
                message = "Não é possível dividir por 0";
            }
        } catch (Exception e) {
            message = "Erro de conversão";
        }
    }
}
