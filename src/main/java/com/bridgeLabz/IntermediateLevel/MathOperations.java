package com.bridgeLabz.IntermediateLevel;

import java.lang.reflect.Method;
import java.util.Scanner;

class MathSubAddMulti{
    int firstNumber;
    int secondNumber;
    MathSubAddMulti(int firstNumber,int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    public void add(){
        System.out.println(firstNumber+secondNumber);
    }
    public void sub(){
        System.out.println(firstNumber-secondNumber);
    }
    public void multi(){
        System.out.println(firstNumber*secondNumber);
    }
}
public class MathOperations {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //user input
        MathSubAddMulti obj = new MathSubAddMulti(sc.nextInt(),sc.nextInt());
        Class<?> reflectionClass = MathSubAddMulti.class;
        Method[] methods = reflectionClass.getDeclaredMethods();
        for(Method method : methods){
            if(method.getName().equals("add")){
                method.setAccessible(true);
                method.invoke(obj);
            }
            if(method.getName().equals("sub")){
                method.setAccessible(true);
                method.invoke(obj);
            }
            if(method.getName().equals("multi")){
                method.setAccessible(true);
                method.invoke(obj);
            }
        }
    }
}
