package com.nach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WordReverser {

    public WordReverser() {
    }

    public String reverseWord(String inputString){

        char[] inputList = inputString.toCharArray();
        char[] outputList = new char[inputList.length];

        for (int i = 0; i < inputList.length; i++) {

            outputList[i] = inputList[inputList.length - i - 1];
        }

        return String.valueOf(outputList);
    }

    public String reverseWithSB(String input){

        StringBuilder stringBuilder = new StringBuilder(input);

        return stringBuilder.reverse().toString();

    }
}
