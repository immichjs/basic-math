package model;

import java.text.DecimalFormat;

public class Calcular extends absPropriedades {
    
    public Calcular(Double number1, Double number2, String operation) {
        this.number1 = number1;
        this.number2 = number2;
        this.operation = operation;
        this.solve();
    }
    
    public void solve() {
        DecimalFormat df = new DecimalFormat("0.00");
        
        if (operation.equals("+"))
            result = df.format(number1 + number2);
        if (operation.equals("-"))
            result = df.format(number1 - number2);
        if (operation.equals("*"))
            result = df.format(number1 * number2);
        if (operation.equals("/"))
            result = df.format(number1 / number2);
        
    }
    
}
