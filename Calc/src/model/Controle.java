package model;

public class Controle extends absPropriedades {
    
    public Controle(String num1, String num2, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
        this.execute();
    }
    
    public void execute() {
        this.message = "";
        Validacao validacao = new Validacao(this.num1, this.num2, this.operation);
        
        if (validacao.getMessage().equals("")) {
            Calcular calcular = new Calcular(validacao.getNumber1(), validacao.getNumber2(), this.operation);
            
            this.result = calcular.getResult();
        } else {
            
            this.message = validacao.getMessage();
        }
    }
    
}
