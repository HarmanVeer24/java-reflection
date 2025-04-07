package com.bridgeLabz.BasicLevel;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class StudentData{
    int Age;

    private StudentData(int Age){
        this.Age = Age;
    }
    private void GetAge(){
        System.out.println(Age);
    }
}
public class Student {
    public static void main(String[] args) throws Exception{
        Class<?> refelectionClass = StudentData.class;
        Constructor<?> constructor = refelectionClass.getDeclaredConstructor(int.class);
        constructor.setAccessible(true);
        StudentData studentData = (StudentData) constructor.newInstance(21);
        Method[] methods = refelectionClass.getDeclaredMethods();
        for(Method method : methods){
            if(method.getName().equals("GetAge")){
                method.setAccessible(true);
                method.invoke(studentData);
            }
        }
    }
}
