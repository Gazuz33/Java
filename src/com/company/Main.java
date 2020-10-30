package com.company;

public class Main {
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        int itemsSoFar = 0;
        Double calories = 0.0;
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese(Double.parseDouble(parts[1]));
            } else
            if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1],Double.parseDouble(parts[2]) );
            }
            if (parts[0].equals("Burger")) {
                breakfast[itemsSoFar] = new Burger(parts[1],Double.parseDouble(parts[2]));
            }
            if (parts[0].equals("-calories"))
            {
                for (Food item: breakfast)
                if (item!=null)
                    calories+=item.Calculatecalories();
                else
                    break;
            }
            itemsSoFar++;
        }
        for (Food item: breakfast)
            if (item!=null)
                item.consume();
            else
                break;

        System.out.println("Good!");
        System.out.println(calories);

    }
}
