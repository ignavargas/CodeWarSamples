package com.nach;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String input= "Ignacio";

        PairSplitter pairSplitter = new PairSplitter(input);

        pairSplitter.inputPairSplitter().stream().forEach(System.out::println);

    }
}
