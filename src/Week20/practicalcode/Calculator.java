package Week20.practicalcode;

public class Calculator {

    public Calculator(){}

    public double addition(double x, double y){
        double result = x + y;
        return result;
    }

    public double multiplication(double x, double y){
        double result = x * y;
        return result;
    }

    public double subtraction(double x, double y){
        double result = x + y;
        return result;
    }

    public double division(int x, int y) throws ArithmeticException  {
        try{
            int result = x / y;
            return result;
        }catch(ArithmeticException a){
            throw new ArithmeticException(a.getMessage());
        }
    }
}
