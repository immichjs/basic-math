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
    private String resultado;
    public String num1;
    public String num2;
    public String mensagem;

    public Controle(String num1, String num2, String op) {
        this.num1 = num1;
        this.num2 = num2;
        this.calcular(op);
    }
    
    
    
    
    public void calcular(String op) {
        mensagem = "";
        
        switch(op) {
            case "+":
                try {
                    numero1 = Double.parseDouble(num1);
                    numero2 = Double.parseDouble(num2);
                    resultado = String.valueOf(numero1 + numero2);
                } catch(Exception e) {
                  mensagem = "Erro de conversão";
                }
                break;
            case "-":
                try {
                    numero1 = Double.parseDouble(num1);
                    numero2 = Double.parseDouble(num2);
                    resultado = String.valueOf(numero1 - numero2);
                } catch(Exception e) {
                  mensagem = "Erro de conversão";
                }
                break;
            case "*":
                try {
                    numero1 = Double.parseDouble(num1);
                    numero2 = Double.parseDouble(num2);
                    resultado = String.valueOf(numero1 * numero2);
                } catch(Exception e) {
                  mensagem = "Erro de conversão";
                }
                break;
            case "/":
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
            break;
        }
    }

    public String getResultado() {
        return resultado;
    }
    
}
