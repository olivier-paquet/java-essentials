package org.paq.java.essentials.jdk.collections.list;

import org.paq.java.essentials.jdk.collections.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _List_Main {
    private static Logger log = LoggerFactory.getLogger(_List_Main.class);

    public static void main(String[] args) {
        _Print_List_Example();
        _Immutable_List_Example();
        _List_View_From_Array_Example();
        _ArrayList_From_Array_Example();
        _ArrayList_Example();

    }

    private static void _Print_List_Example() {
        logMethod("_Print_List_Example");
        List<String> numbers = new ArrayList(List.of("One", "Two", "Three", "Four"));
        log.info(String.valueOf(numbers));
        for(String s : numbers) {
            log.info(s);
        }

        log.info(String.join("->", numbers));
    }

    private static void _Immutable_List_Example() {
        logMethod("_Immutable_List_Example");
        List<String> numbers = List.of("One", "Two", "Three", "Four"); // creates an immutable list - cannot be modified
        try {
            numbers.remove(0); // UnsupportedOperationException
        } catch(UnsupportedOperationException e) {
            log.warn("Cannot remove element", e);
        }
    }

    private static void _List_View_From_Array_Example() {
        logMethod("_List_View_From_Array_Example");
        String[] numberArray = new String[]{"One", "Two", "Three", "Four"}; // immutable because it's a view
        List<String> numbersView = Arrays.asList(numberArray);
        try {
            numbersView.add("Five");
        } catch(UnsupportedOperationException e) {
            log.warn("Cannot add element", e);
        }
    }

    private static void _ArrayList_From_Array_Example() {
        logMethod("_ArrayList_From_Array_Example");
        String[] numberArray = new String[]{"One", "Two", "Three", "Four"}; // immutable because it's a view
        List<String> numbers = new ArrayList<>(Arrays.asList(numberArray));
        numbers.add("Five");
        log.info(String.valueOf(numbers));
    }

    private static void _ArrayList_Example() {
        logMethod("_ArrayList_Example");
        List<String> numbers = new ArrayList(List.of("One", "Two", "Three", "Four"));
        log.info(String.valueOf(numbers));
        numbers.remove(0); // remove first element at position 0
        log.info(String.valueOf(numbers));
        numbers.add("Five"); // add at last position
        log.info(String.valueOf(numbers));
        numbers.add(3,"Six"); // add at position 3, the current element will be shifted to the right
        log.info(String.valueOf(numbers));
    }

    private static void logMethod(String methodName) {
        log.info("");
        log.info(methodName);
        log.info("=".repeat(methodName.length()));
    }
}
