package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class WordPublisher {
    protected Word words;
    private ArrayList<String> keepBad, keepGood;

    public WordPublisher() {
        words = new Word();
        keepBad = new ArrayList<>();
        keepGood = new ArrayList<>();
    }

    @RequestMapping(value = "/addBad/{word}", method = RequestMethod.GET)
    public ArrayList<String> addBadWord(@PathVariable("word") String word){
        keepBad.add(String.valueOf(word));
        words.setBadWord(keepBad);
        return words.getBadWord();
    }

    @RequestMapping(value = "/delBad/{word}", method = RequestMethod.GET)
    public ArrayList<String> deleteBadWord(@PathVariable("word") String word){
        for(int i = 0; i < this.keepBad.size() ; i++){
            if(this.keepBad.get(i).equals(word)){
                this.keepBad.remove(this.keepBad.get(i));
            }
        }
        return words.getBadWord();
    }

    @RequestMapping(value = "/addGood/{word}", method = RequestMethod.GET)
    public ArrayList<String> addGoodWord(@PathVariable("word") String word){
        keepGood.add(String.valueOf(word));
        words.setGoodWords(keepGood);
        return words.getGoodWords();
    }

    @RequestMapping(value = "/delGood/{word}", method = RequestMethod.GET)
    public ArrayList<String> deleteGoodWord(@PathVariable("word") String word){
        for(int i = 0; i < this.keepGood.size() ; i++){
            if(this.keepGood.get(i).equals(word)){
                this.keepGood.remove(this.keepGood.get(i));
            }
        }
        return words.getGoodWords();
    }
    public void proofSentence(String s){

    }

}
