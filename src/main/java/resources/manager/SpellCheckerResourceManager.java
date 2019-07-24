package main.java.resources.manager;

import org.jvnet.hk2.annotations.Service;

@Service
public class SpellCheckerResourceManager implements ResourceManager {

    public SpellCheckerResourceManager() {
        System.out.println("Inside SpellCheckerResourceManager constructor");
    }

    public void sayHi() {
        System.out.println("Inside SpellCheckerResourceManager sayHi");
    }
}
