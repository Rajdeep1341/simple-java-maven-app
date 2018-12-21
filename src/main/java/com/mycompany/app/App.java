package com.mycompany.app;

/**
 * Hello world! simple java app
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println("hygieia collector");
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
