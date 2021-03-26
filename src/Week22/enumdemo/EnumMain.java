package Week22.enumdemo;

public class EnumMain {
    public static void main(String[] args) {
        ProductType productType = ProductType.DRINK;
        System.out.println(productType);


        for(ProductType type : ProductType.values()){
            System.out.println(type);
        }

        if(productType == ProductType.DRINK){
            System.out.println("Drink Found");
        }
    }
}
