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

}