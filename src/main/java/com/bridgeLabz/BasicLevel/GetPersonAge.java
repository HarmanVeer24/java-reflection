package com.bridgeLabz.BasicLevel;
import java.lang.reflect.*;
 class PersonData{
    private int age;

    private PersonData(int age){
        this.age = age;
    }
    private int SetAge(int age){
        return age;
    }
}
public class GetPersonAge {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> reflectionClass = PersonData.class ;
        Constructor<?> personConstructor = reflectionClass.getDeclaredConstructor(int.class);
        personConstructor.setAccessible(true);
        PersonData person = (PersonData) personConstructor.newInstance(21);
        Field[] fields = reflectionClass.getDeclaredFields();
        for(Field field : fields){
            if(field.getName().equals("age")){
                field.setAccessible(true);
                System.out.println("Before Modification");
                System.out.println(field.get(person));
                field.set(person, 13);
                System.out.println("Before Modification");
                System.out.println(field.get(person));
            }
        }
    }
}
