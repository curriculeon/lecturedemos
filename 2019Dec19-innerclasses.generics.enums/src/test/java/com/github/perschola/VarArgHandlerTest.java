package com.github.perschola;

import com.github.perschola.varargs.VarArgHandler;
import org.junit.Test;

/**
 * Created by leon on 12/19/2019.
 */
public class VarArgHandlerTest {
    @Test
    public void test0() {
        // given
        VarArgHandler varArgHandler = new VarArgHandler();

        // when
        varArgHandler.printIntegersOnSeparateLines(7, 8, 10, 15);

        // then
    }

    @Test
    public void test1() {
        // given
        VarArgHandler varArgHandler = new VarArgHandler();

        // when
        varArgHandler.printIntegersOnSeparateLines(7);

        // then
    }

    @Test
    public void test2() {
        // given
        VarArgHandler varArgHandler = new VarArgHandler();

        // when
        varArgHandler.printIntegersOnSeparateLines();

        // then
    }
}
