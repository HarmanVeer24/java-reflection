package com.bridgeLabz.AdvancedLevel;
import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.*;
class ObjectMapperutil{
    public static <T> T toObject(Class<T> reflectionClass,Map<String,Object> map) throws  Exception{
        T obj = reflectionClass.getDeclaredConstructor().newInstance();
        for(Field field : reflectionClass.getDeclaredFields()){
            if(map.containsKey(field.getName())){
                field.setAccessible(true);
                field.set(obj,map.get(field.getName()));
            }
        }
        return obj;
    }
}
class Person {
    private String name;
    private int age;

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ObjectMapper {
    public static void main(String[] args) throws Exception{
        Map<String, Object> data = new HashMap<>();
        data.put("name", "Harman");
        data.put("age", 21);

        Person person = ObjectMapperutil.toObject(Person.class, data);
        person.display();
        }
}
