package Week14.currencyconvertor;

public class CcTest {
    public static void main(String[] args) {
        CurrencyConvertor2 cc = new CurrencyConvertor2();
        UserCapture uc = new UserCapture();
        //System.out.println("Please enter your name: ");
        System.out.println("Please enter a euro value: ");
        double result = uc.captureDoubleInput();
        //System.out.println("Hello " + result + " it's nice to meet you!");
        //double d = Double.parseDouble(result);
        double gbp = cc.euroToGBP(result);
        String s = cc.formatGBP(gbp);
        System.out.println(s);
    }
}
