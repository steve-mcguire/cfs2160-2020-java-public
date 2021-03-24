package PhoneShop;

import java.util.HashMap;
import java.util.Map;

public class PhoneStock {
    private HashMap<MobilePhone, Integer> phoneStock = new HashMap<>();

    public void addPhoneToStock(MobilePhone m, Integer q){
        phoneStock.put(m, q);
    }

    public void reduceStock(MobilePhone m){
        if(phoneStock.containsKey(m)){

            phoneStock.put(m, phoneStock.get(m) - 1);

            for(Map.Entry<MobilePhone, Integer> phone : phoneStock.entrySet())
            {
                if(phone.getKey() == m){
                    Integer newVal = phone.getValue() - 1;
                    //phone.setValue(newVal);
                }
                //System.out.println("Key : "+phone.getKey().getModel()+"   Value : "+phone.getValue());
            }
        }
    }

    public void printPhones(){
        for(Map.Entry<MobilePhone, Integer> phone : phoneStock.entrySet())
        {
            System.out.println("Product : "+phone.getKey().getModel()+"   Quantity : "+phone.getValue());
        }
    }
}
