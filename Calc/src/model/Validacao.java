package model;

public class Validacao extends absPropriedades {
    
    public Validacao(String num1, String num2, String operation) {
        this.num1 = num1.replaceAll(",", ".");
        this.num2 = num2.replaceAll(",", ".");
        this.operation = operation;
        this.validate();
    }
    
    private void validate() {
        message = "";
        
        try {
            number1 = Double.parseDouble(num1);
            number2 = Double.parseDouble(num2);
            if (number2.equals(0) && operation.equals("/")) {
                message = "Não é possível dividir por 0";
            }
        } catch (Exception e) {
            message = "Erro de conversão";
        }
    }
}
