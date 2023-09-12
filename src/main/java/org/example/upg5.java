package org.example;

import java.util.ArrayList;
import java.util.List;

public class upg5 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        colors.add("Blå");
        colors.add("Grön");
        colors.add("Röd");
        colors.add("Orange");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

    }
}
