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
            String result = greeting.sayWelcome();
            Assert.assertEquals(expectedResult, result);
        }
        public void testSayHello() {
            String expectedResult = "hello from greeting";
            Greeting greeting = new Greeting();
            String result = greeting.sayHello();
            Assert.assertEquals(expectedResult, result);
        }
        public void testSayBye() {
            String expectedResult = "bye from greeting";
            Greeting greeting = new Greeting();
            String result = greeting.sayBye();
            Assert.assertEquals(expectedResult, result);
        }
}