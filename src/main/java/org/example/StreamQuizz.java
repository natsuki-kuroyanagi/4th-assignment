package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class StreamQuizz {

    public static void main(String[] args) {
        List<String> names = List.of("aaaac", "aaaae", "aaaaa", "aaaab", "aaaad");

        List<String> sortedResult = names.stream().sorted().toList();

        long count = names.stream().filter(name -> name.startsWith("b")).count();

        boolean b = names.stream().anyMatch(name -> name.equals("aaaab"));

        names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(sortedResult);
    }
}
