package org.example;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForSample {

    public static void main(String[] args) {

        List<String> names = List.of("Brazil(South America)", "Franch(Europe)", "Colombia(South America)", "Egypt(Afurica)", "America(North America)");
        List<String> result = new ArrayList<>();

        for (String name : names) {
            if (name.contains("South America")) {
                result.add(name);
            }
        }

        System.out.println(result);
    }
}
