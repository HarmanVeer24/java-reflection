package com.bridgeLabz.AdvancedLevel;
import java.lang.reflect.Method;

class Testing{
    private void fastMetod(){
        System.out.println("fast Method");
    }
    private void slowMethod() throws Exception{
        //stimulation
        Thread.sleep(3000);
        System.out.println("slow Method");
    }
}
public class MethodExecution {
    public static void main(String[] args) throws Exception{

            Class<?> reflectionClass = Testing.class;
            Object instance = reflectionClass.getDeclaredConstructor().newInstance();
            for (Method method : reflectionClass.getDeclaredMethods()) {
                if (method.getParameterCount() == 0) {
                    System.out.println("\nExecuting method: " + method.getName());
                    method.setAccessible(true);
                    long start = System.nanoTime();
                    method.invoke(instance);
                    long end = System.nanoTime();

                    long durationMs = (end - start) / 1_000_000;
                    System.out.println("Execution Time: " + durationMs + " ms");
                }

        }
    }
}

