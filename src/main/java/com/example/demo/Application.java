package com.example.demo;

import com.example.kotlin.demo.KotlinService;

public class Application {

    static String JAVA = "java";
    static String KOTLIN = "kotlin";

    public static void main(String[] args) {
        String language = "kotlin";
        switch (language) {
            case "java":
                new JavaService().sayHello();
                break;
            case "kotlin":
                new KotlinService().sayHello();
                break;
            default:
                // Do nothing
                break;
        }
    }
}
