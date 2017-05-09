package util;

import java.util.Random;

public class OrderIdHelper {
    
    public static String getOrderId(String account, String date){
        String id =account +"@" + date + "@";
        int max = 99999;
        int min = 10000;
        int num = new Random().nextInt(max - min) + min; 
        id = id + num;
        return id;
    }
}
