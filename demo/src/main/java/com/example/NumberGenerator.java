package com.example;

import java.util.Random;
import java.util.function.Supplier;
import java.util.*;

public class NumberGenerator {
    public static List<Integer> cardNumbers;
    public static int index=0;

    public static List<Integer> newList() {
        cardNumbers = new ArrayList<Integer>();
        Random random = new Random();

        while (cardNumbers.size() < 16) {
            int randomNum = random.nextInt((50-0+1))+0;
            cardNumbers.add(randomNum);
            cardNumbers.add(randomNum);
        }
        Collections.shuffle(cardNumbers);
        return cardNumbers;
    }

    public static int incrementIndex(){
        int value= cardNumbers.get(index);
        index++;
        return value;

    }
}
