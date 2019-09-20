package damon.service;

import org.springframework.stereotype.Service;

@Service
public class TestClass {
    public int plus(int one, int two) {
        System.out.println(one + two);
        return one + two;
    }
}
