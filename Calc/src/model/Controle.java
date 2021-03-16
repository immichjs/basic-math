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
    public String num1;
    public String num2;
    public String message;
    public String operation;
    public String result;
    
    public void execute() {
        this.message = "";
        Validacao validacao = new Validacao();
        
        validacao.num1 = this.num1;
        validacao.num2 = this.num2;
        validacao.operation = this.operation;
        
        validacao.validate();
        if (validacao.message.equals("")) {
            Calcular calcular = new Calcular();
            
            calcular.number1 = validacao.number1;
            calcular.number2 = validacao.number2;
            calcular.operation = this.operation;
            
            calcular.solve();
            this.result = calcular.result;
        } else {
            
            this.message = validacao.message;
        }
    }
    
}
