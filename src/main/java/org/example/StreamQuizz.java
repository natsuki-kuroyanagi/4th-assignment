package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class StreamQuizz {

    public static void main(String[] args) {
        List<String> names = List.of("garmany", "switzerland", "italy", "croatia", "belgium");

        List<String> sortedResult = names.stream().sorted().toList();

        long count = names.stream().filter(name -> name.startsWith("g")).count();

        boolean hascountryname = names.stream().anyMatch(name -> name.equals("itary"));

        names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(sortedResult);
    }
}
