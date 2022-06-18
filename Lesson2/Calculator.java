public class Calculator {
    
    private int num1;
    private int num2;
    private String sign;
    
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }

    public double calculate() {
        double result = 0;
        switch(sign) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "^":
                result = 1;
                for(int i = 0; i < num2; i++) {
                    result *= num1;
                }
                break;
        }
        return result;
    }
}
