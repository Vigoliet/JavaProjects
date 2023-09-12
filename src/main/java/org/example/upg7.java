package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Mest frekventa elementet:
//Skapa en metod som tar en List<Integer> som parameter och returnerar det mest
//frekventa talet i listan med hjälp av en Map<Integer, Integer>.
public class upg7 {
    public static void main(String[] args) {

        List <Integer> list = new ArrayList<>();

        Map <Integer, Integer> frequency = new HashMap<>();

        list.add(1);
        list.add(2);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(8);
        list.add(9);

        int mostFrequentNumber = getMostFrequentNumber(list);
        System.out.println(mostFrequentNumber);

    }

    public static int getMostFrequentNumber(List<Integer> list){
        //   talet    frekvens
        Map<Integer, Integer> frequency = new HashMap<>();

        // 1: 1
        // 2: 1
        // 5: 3
        // 8: 1
        // 9: 1



        for (int i = 0; i < list.size(); i++) {

            int numberToAdd = list.get(i);

            if (!frequency.containsKey(numberToAdd)) {
                frequency.put(list.get(i), 1);
                System.out.println(numberToAdd);
            } else {
                frequency.replace(numberToAdd, frequency.get(numberToAdd)+1);
            }
        }
        
        int currentMaxFrequency = Integer.MIN_VALUE;


                
                
        return 0;
    }


}
