package com.bridgeLabz.BasicLevel;
import java.lang.reflect.*;
class Example{
    private int rollNo;
    private String Name;
    private String University;
    public Example(){

    }
    private Example(int rollNo,String Name,String University){
        this.rollNo = rollNo;
        this.Name = Name;
        this.University = University;
    }
    private void displayData(String University){
        System.out.println(University);
    }


}
public class GetClassInfo {
    public static void main(String[] args)
    {
        Class<?> class1 = Example.class;
        //fields
        Field[] fields = class1.getDeclaredFields();
        for(Field field : fields){
            System.out.print(field.getName()+" ");
        }
        //methods
        Method[] methods = class1.getDeclaredMethods();
        for(Method method : methods){
            System.out.println(method.getName()+","+" ");
        }
        //constructors
        Constructor<?>[] constructors = class1.getDeclaredConstructors();
        for(Constructor<?> constructor : constructors){
            System.out.println(constructor.getName()+","+" ");
        }
    }
}
