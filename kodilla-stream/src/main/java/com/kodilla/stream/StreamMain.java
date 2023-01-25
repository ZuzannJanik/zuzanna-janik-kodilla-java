package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
        System.out.println();

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        System.out.println();

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("Your text is ugly.... Abracadabra.... it's prettier this way!");
        System.out.println(poemBeautifier.beautifulText ("ugly example", (text -> "ABC " + text + " ABC")));
        System.out.println(poemBeautifier.beautifulText ("ugly example", (text -> text.toUpperCase())));
        System.out.println(poemBeautifier.beautifulText ("ugly example", (text -> "$$$ " + text + " $$$")));
        System.out.println(poemBeautifier.beautifulText ("ugly example", (text -> "<---> " + text + " <---->")));
    }
}