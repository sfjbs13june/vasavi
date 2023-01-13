package com.vasavi.app;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

    public class AppTest extends TestCase {

        public void testSayHi() {
            String expectedResult = "Hi from greeting";
            Greeting greeting = new Greeting();
            String result = greeting.SayHi();
            Assert.assertEquals(expectedResult, result);
        }
        public void testSayWelcome() {
            String expectedResult = "welcome from greeting";
            Greeting greeting = new Greeting();
            String result1 = greeting.sayWelcome();
            Assert.assertEquals(expectedResult, result1);
        }
        public void testSayHello() {
            String expectedResult = "hello from greeting";
            Greeting greeting = new Greeting();
            String result2 = greeting.sayHello();
            Assert.assertEquals(expectedResult, result2);
        }
        public void testSayBye() {
            String expectedResult = "bye from greeting";
            Greeting greeting = new Greeting();
            String result3 = greeting.sayBye();
            Assert.assertEquals(expectedResult, result3);
        }
}