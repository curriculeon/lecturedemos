package com.github.perschola;

import com.github.perschola.innerandnestedclasses.OuterClass;
import org.junit.Test;

/**
 * Created by leon on 12/19/2019.
 */
public class OuterClassTest {
    @Test
    public void test() {
        OuterClass outerClass = new OuterClass();
        OuterClass.PublicNestedClass publicNestedClass = new OuterClass.PublicNestedClass();
        // ↓↓ THIS DOES NOT COMPILE ↓↓
        // OuterClass.PublicInnerClass publicInnerClass = new OuterClass.PublicInnerClass();
    }
}
