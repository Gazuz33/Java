package com.company;

public class Burger extends Food {

    private String size;
    public Burger (String size)
    {
        super("Burger");
        this.size=size;
    }
    public void consume() {
        System.out.println(this + " was eaten");
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
   /* public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Burger)) return false;
            return size.equals(((Burger)arg0).size);
        } else
            return false;
    }*/
    public String toString() {
        return super.toString() + " size '" + size.toUpperCase() + "'";
    }

}
