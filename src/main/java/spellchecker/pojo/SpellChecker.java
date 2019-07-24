package main.java.spellchecker.pojo;

import main.java.spellchecker.service.Dictionary;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Inject;

@Service
public class SpellChecker {

    private Dictionary dictionary;

    @Inject
    public SpellChecker(Dictionary dictionary) {
        System.out.println("Inside spell checker const");
        this.dictionary = dictionary;
    }

    public void sayHi() {
        System.out.println("Inside spell checker say hi");
        dictionary.sayHi();
    }

}
