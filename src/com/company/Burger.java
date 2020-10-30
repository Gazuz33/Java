package com.company;

public class Burger extends Food {

    private String size = null;
    public void consume() {
        System.out.println(this + " was eaten");
    }

    public Burger (String size,Double calories)
    {
        super("Burger",calories);
        this.size=size;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Burger)) return false;
            return size.equals(((Burger)arg0).size);
        } else
            return false;
    }
    public String toString() {
        return super.toString() + " size '" + size.toUpperCase() + "'";
    }

}
