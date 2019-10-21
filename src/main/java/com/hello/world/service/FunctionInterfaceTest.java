package com.hello.world.service;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created with IntelliJ IDEA
 *
 * @auther youxiang
 * @date 2019/9/24 14:18
 * Description:
 */
public class FunctionInterfaceTest {

    public static void main(String[] args) {
        FunctionInterfaceTest functionInterfaceTest = new FunctionInterfaceTest();
        System.out.println("---------------");
        System.out.println(functionInterfaceTest.comper(12, value -> value * 12));
        System.out.println("---------------");
        System.out.println(functionInterfaceTest.comper2(12, 22, (value1, value2) -> value1 + value2));
        System.out.println("---------------");
        System.out.println(functionInterfaceTest.comper3("abc",value -> value.equals("abc")));
    }

    //Function
    public Integer comper(Integer value, Function<Integer, Integer> function) {
        return function.apply(value);
    }

    //BiFunction
    public Integer comper2(Integer value1, Integer value2, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(value1, value2);
    }

    //Predcate
    public boolean comper3(String value, Predicate<String> predicate) {
        return predicate.test(value);
    }
}
