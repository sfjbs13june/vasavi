package com.vasavi.app;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
    public class MyClassCTest {
        @InjectMocks
        MyClassC myclassC;

        @Test
        public void TestgetMyAge()
        {
            int result = myclassC.getMyAge(22);
            assertEquals(22, result);
        }
}
