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
public class Controle {
    private Double numero1;
    private Double numero2;
    public String resultado;
    public String num1;
    public String num2;
    public String mensagem;
    
    
    public void calcular(String op) {
        mensagem = "";
        if (op.equals("+")) {
            try {
                numero1 = Double.parseDouble(num1);
                numero2 = Double.parseDouble(num2);
                resultado = String.valueOf(numero1 + numero2);
            } catch(Exception e) {
              mensagem = "Erro de conversão";
            }
        } else if (op.equals("-")) {
            try {
                numero1 = Double.parseDouble(num1);
                numero2 = Double.parseDouble(num2);
                resultado = String.valueOf(numero1 - numero2);
            } catch(Exception e) {
              mensagem = "Erro de conversão";
            }
        } else if (op.equals("*")) {
            try {
                numero1 = Double.parseDouble(num1);
                numero2 = Double.parseDouble(num2);
                resultado = String.valueOf(numero1 * numero2);
            } catch(Exception e) {
              mensagem = "Erro de conversão";
            }
        } else if (op.equals("/")) {
            try {
                numero1 = Double.parseDouble(num1);
                numero2 = Double.parseDouble(num2);
                if (numero2 == 0) {
                    mensagem = "Não é possível dividir por 0";
                } else {
                    resultado = String.valueOf(numero1 / numero2);
                }
            } catch(Exception e) {
              mensagem = "Erro de conversão";
            }
        }
    }
    
}
