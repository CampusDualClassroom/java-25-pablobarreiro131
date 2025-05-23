package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {
        Stack<String> pila = new Stack<>();
        pila.add("Smith");
        pila.add("Montessori");
        pila.add("Peralta");
        pila.add("House");
        return pila;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
        while (!stack.isEmpty()){
            System.out.println(stack.pop());;
            ;
        }
    }

    public static void main(String[] args) {
        Stack<String> pila = createStack();
        printAndEmptyStack(pila);
    }



}
