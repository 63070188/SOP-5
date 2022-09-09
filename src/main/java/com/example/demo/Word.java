package com.example.demo;

import java.util.ArrayList;

public class Word {
    public ArrayList<String> badWord;
    public ArrayList<String> goodWords;

    public Word() {
        this(null,null);
    }

    public Word(ArrayList<String> badWord, ArrayList<String> goodWords) {
        this.badWord = badWord;
        this.goodWords = goodWords;
    }

    public ArrayList<String> getGoodWords() {
        return goodWords;
    }

    public void setGoodWords(ArrayList<String> goodWords) {
        this.goodWords = goodWords;
    }

    public ArrayList<String> getBadWord() {
        return badWord;
    }

    public void setBadWord(ArrayList<String> badWord) {
        this.badWord = badWord;
    }
}
