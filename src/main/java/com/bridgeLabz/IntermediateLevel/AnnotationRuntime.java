package com.bridgeLabz.IntermediateLevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//custom annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Author{
    String name();
}
@Author(name = "Harman")
class AnnotatedClass{
}
public class AnnotationRuntime {
    public static void main(String[] args) {
        Class<?> reflectionClass = AnnotatedClass.class;
        if(reflectionClass.isAnnotationPresent(Author.class)){
            Author authorAnnotation = reflectionClass.getAnnotation(Author.class);
            System.out.println(authorAnnotation.name());
        }
    }
}
