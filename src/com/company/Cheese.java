package com.company;
public class Cheese extends Food {
    public Cheese (Double calories)
    {
        super("Cheese",calories);
    }
    public Cheese() {
        super("Cheese");
    }
    public void consume() {
        System.out.println(this + " was eaten");
    }
}
