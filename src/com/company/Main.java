package com.company;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");

        Coche ford = new Coche("Ford", "Mustang", "4356GHN", 3200, 45000.0);
        Coche lambo = new Coche("Lamborghini", "Aventador", "5674RTG", 4600, 120000.0);
        Coche ferrari = new Coche("Ferrari", "X6", "4523TRE", 4566, 85000.0);

        List<Coche> cocheList = new ArrayList<>();

        cocheList.add(ford);
        cocheList.add(lambo);
        cocheList.add(ferrari);

        System.out.println("Muestro el ford: " + cocheList.get(0));

    }
}
