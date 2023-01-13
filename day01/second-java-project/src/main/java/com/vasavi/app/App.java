package com.vasavi.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Greeting greeting = new Greeting();
        String result= greeting.SayHi();
        System.out.println(result);
        String result1= greeting.sayWelcome();
        System.out.println(result1);
        String result2= greeting.sayHello();
        System.out.println(result2);
        String result3= greeting.sayBye();
        System.out.println(result3);
    }
}
