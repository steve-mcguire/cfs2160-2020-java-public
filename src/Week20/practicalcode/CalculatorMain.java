package Week20.practicalcode;

public class CalculatorMain {
    public static void main(String[] args) {
        //create instance of the Calculator class
        Calculator calc = new Calculator();

        //test the addition method
        System.out.println(calc.addition(2.5, 7));

        //test the multiplication method
        System.out.println(calc.multiplication(3, 4));

        //test the subtraction method
        System.out.println(calc.subtraction(20, 6));

        //test the division method, will return an exception if a param is zero
        try{
            System.out.println(calc.division(100 , 0));
        }catch(ArithmeticException a){
            System.out.println(a.getLocalizedMessage());
        }
    }
}
