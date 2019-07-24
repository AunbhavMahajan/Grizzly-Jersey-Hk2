package main.java.resources.pojo;

import main.java.Services.Dictionary;

public class SpellChecker {

    private Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        System.out.println("Inside spell checker const");
        this.dictionary = dictionary;
    }

    public void sayHi() {
        System.out.println("Inside spell checker say hi");
        dictionary.sayHi();
    }

}
