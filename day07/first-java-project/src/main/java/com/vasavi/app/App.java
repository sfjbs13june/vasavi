package com.vasavi.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Greeting greeting = new Greeting();
        String result= greeting.SayHi();
        System.out.println(result);
        double divResult=0l;
        try {
            //    divResult = greeting.getDiv(1, 0);
            divResult=greeting.getThrowException(7,0);
        }catch (Exception e){
            System.out.println("The exception is :" + e);
        }
        System.out.println(divResult);
    }
}
