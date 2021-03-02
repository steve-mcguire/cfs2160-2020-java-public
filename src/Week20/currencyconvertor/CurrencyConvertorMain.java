package Week20.currencyconvertor;



public class CurrencyConvertorMain {
    public static void main(String[] args) {
        CurrencyConvertor cc = new CurrencyConvertor();

        System.out.println("Please enter a euro value: ");
        String result = cc.captureStringInput();
        double euroDouble = Double.parseDouble(result);

        double gbp = cc.convertEuroToGBP(euroDouble);
        String s = cc.formatGBP(gbp);

        System.out.println(s);
    }
}