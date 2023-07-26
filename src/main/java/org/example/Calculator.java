package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.function.*;

public class Calculator {
    static Supplier a;
    static Supplier<Calculator> instance = Calculator::new;

    public BinaryOperator<Integer> plus = (x, y) -> x + y;
    public BinaryOperator<Integer> minus = (x, y) -> x - y;
    public BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //    добавила проверку на 0, но не поняла что могу сделать, если это все-таки деление на 0. Результат ведь Integer, поэтому возвращаю 0
    public BinaryOperator<Integer> divide = (x , y) -> y > 0 ? x / y : 0;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}

