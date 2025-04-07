package com.bridgeLabz.BasicLevel;

import java.lang.reflect.Method;

class CalculatorMulti{
    int firstNumber;
    int secondNumber;
    CalculatorMulti(){}
    CalculatorMulti(int firstNumber,int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    private void multiply(int firstNumber,int secondNumber){
        System.out.println(firstNumber*secondNumber);
    }
}
public class Calculator {
    public static void main(String[] args) throws  Exception{
        Class<?> refelectionClass = CalculatorMulti.class;
        //obj creation
        CalculatorMulti obj = new CalculatorMulti();
        //access private multiply method
        Method[] methods = refelectionClass.getDeclaredMethods();
        for(Method method : methods){
            if(method.getName().equals("multiply")){
                method.setAccessible(true);
                method.invoke(obj,4,5);
            }
        }
    }
}
