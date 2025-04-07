package com.bridgeLabz.IntermediateLevel;

import java.lang.reflect.Field;

class Configration{
    private static String API_KEY = "HarmanAPI";
}
public class CustomConfigration {
    public static void main(String[] args) throws Exception{
        Configration configration = new Configration();
        Class<?> refelectionClass = Configration.class;
        Field[] fields = refelectionClass.getDeclaredFields();
        for(Field field : fields){
            if(field.getName().equals("API_KEY")){
                field.setAccessible(true);
                System.out.println("Before Modification");
                System.out.println(field.get(configration));
                field.set(configration,"HaramanVeerAPI");
                System.out.println("After Modification");
                System.out.println(field.get(configration));
            }
        }
    }
}
