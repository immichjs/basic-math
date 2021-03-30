package model;

public abstract class absPropriedades {
    protected Double number1;
    protected Double number2;
    protected String operation;
    protected String result;
    protected String num1;
    protected String num2;
    protected String message;
    
    public String getResult() {
        return result;
    }
    
    public String getMessage() {
        return message;
    }

    protected Double getNumber1() {
        return number1;
    }

    protected Double getNumber2() {
        return number2;
    }
}
