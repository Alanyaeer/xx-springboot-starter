package org.example.config;

public class Demo {
    public static int tryCatchTest(){
        try{
            return 1;
        }finally {
            System.out.println("heelo");
            return 2;
        }
    }
    public static void main(String[] args) {
        int i = tryCatchTest();
        System.out.println(i);
    }
}
