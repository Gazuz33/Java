/*package com.company;

import java.util.Comparator;
class Comparator1 implements Comparator<Food> {

    public int сompare(Food arg0, Food arg1) {
        if (arg0 == null) return 1;

        else if (arg1 == null) return -1;
        else if (arg0 instanceof Cheese) {
            return 1;
        } else if (arg1 instanceof Cheese) {
            return -1;
        } else if ((arg0 instanceof Apple || arg1 instanceof Apple)) {
            return ((Apple) arg0).getSize().compareTo(((Apple) arg1).getSize());
        } else if ((arg0 instanceof Apple || arg1 instanceof Burger)) {
            return ((Apple) arg0).getSize().compareTo(((Burger) arg1).getSize());
        } else if ((arg0 instanceof Burger || arg1 instanceof Apple)) {
            return ((Burger) arg0).getSize().compareTo(((Apple) arg1).getSize());
        } else if ((arg0 instanceof Burger || arg1 instanceof Burger)) {
            return ((Burger) arg0).getSize().compareTo(((Burger) arg1).getSize());
        }
        return 0;

    }

}*/

