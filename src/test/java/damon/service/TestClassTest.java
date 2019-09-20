package damon.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestClassTest {
    TestClass testClass = new TestClass();

    @Test
    public void name() {
        Assert.assertEquals(3, testClass.plus(1, 2));
    }
}