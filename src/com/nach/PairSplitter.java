package com.nach;

import java.util.ArrayList;
import java.util.List;

public class PairSplitter {

    String inputWord;

    public PairSplitter(String inputWord) {
        this.inputWord = inputWord;
    }

    public String getInputWord() {
        return inputWord;
    }

    public void setInputWord(String inputWord) {
        this.inputWord = inputWord;
    }

    public List<String> inputPairSplitter(){
        List<String> stringSplitterResult = new ArrayList<>();

        for (int i=0; i < inputWord.length(); i++){

            if(i+2 <= inputWord.length()) {
                stringSplitterResult.add(inputWord.substring(i, i + 1) + inputWord.substring(i + 1, i + 2));
            }else{
                inputWord = inputWord + "_";
                stringSplitterResult.add(inputWord.substring(i));
            }

            i++;
        }

        return stringSplitterResult;
    }
}
