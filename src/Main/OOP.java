package Main;

import Shablon.*;

public class OOP {
    public static void main(String[] args) {
        Sheep sheep1 = new Sheep(90, 2, "male", "black");
        Sheep sheep2 = new Sheep(90, 2, "female", "black");
        Sheep sheep3 = new Sheep(90, 2, "female", "white");

        Cow animal4 = new Cow(345, 5, "female", "brown");
        Cow animal5 = new Cow(450, 5, "female", "brown");
        Cow animal6 = new Cow(256, 5, "female", "brown");
        Cow animal7 = new Cow(300, 5, "female", "brown");
        Cow animal8 = new Cow(365, 5, "female", "brown");

        Horse animal9 = new Horse(678, 6, "male", "black");
        Horse animal10 = new Horse(545, 5, "female", "white");


        Animal[] animals1 = {sheep1, sheep2, sheep3, animal4, animal5, animal6, animal7, animal8, animal9, animal10};
        Animal[] animals2 = {sheep1, animal4, animal9};
        Farm farm1 = new Farm("Alai", "Eldiar");
        Farm farm2 = new Farm("Besh-Sary", "Eldiar");
        System.out.println("Farm's addres:" + farm1.getAddress());
        System.out.println("Owner's name:" + farm1.getOwnerName());
        for (int i = 0; i < animals1.length; i++) {
            if (animals1[i].getClass().getSimpleName().equals("Sheep"))
                System.out.println(animals1[i]);
            else if (animals1[i].getClass().getSimpleName().equals("Cow")) {
                System.out.println(animals1[i]);
            } else if (animals1[i].getClass().getSimpleName().equals("Horse")) {
                System.out.println(animals1[i]);
            } else if (animals1[i].equals(10)) {
                System.out.println("-----------------------------------");
            }
        }
            for (int j = 0; j < animals2.length; j++) {
                System.out.println("Farm's addres:" +farm2.getAddress());
                System.out.println("Owner's name:" +farm2.getOwnerName());
                System.out.println(animals2[j]);




        }
    }

}
