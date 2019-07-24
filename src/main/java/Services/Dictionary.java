package main.java.Services;

import org.jvnet.hk2.annotations.Service;

@Service
public class Dictionary {

    public Dictionary() {
        System.out.println("Inside Dictionary const");
    }

    public void sayHi() {
        System.out.println("Inside dictionary say hi function");
    }
}
