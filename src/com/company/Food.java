package com.company;
public abstract class Food implements Consumable {
    String name = null;
    Double calories = 0.0;
    public Food (String name, Double calories)
    {
        this.name=name;
        this.calories=calories;
    }
    public Food(String name) {
        this.name = name;
    }
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Food)) return false;
        if (name==null || ((Food)arg0).name==null) return false;
        return name.equals(((Food)arg0).name) && calories==((Food)arg0).calories;
    }
    public String toString() { return name; }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
        public Double Calculatecalories()
        {
        return calories;
    }

}


