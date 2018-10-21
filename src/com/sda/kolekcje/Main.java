package com.sda.kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Michal");
        lista.add("Kamil");
        lista.add("Filip");

        System.out.println("Rozmiar: " + lista.size());

        lista.add("Karol");
        lista.add("Piotr");

        System.out.println("Rozmiar: " + lista.size());

        for (String imie : lista) {
            System.out.println("Imie: " + imie);
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        lista.remove("Kamil");
        lista.remove(2);
        try {
            String imie = lista.get(72);
            System.out.println("Element o indeksie 2: " + imie);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Za wysoki indeks");
            //e.printStackTrace();
        }

        lista.clear();

        List<User> lista2 = new ArrayList<>();

        User user1 = new User("Michal", "Rusiecki", 28);
        User user2 = new User("Robert", "Lewandowski", 22);
        User user3 = new User("Jan", "Nowak", 44);
        User user4 = new User("Piotr", "Kowalski", 55);

        lista2.add(user1);
        lista2.add(user2);
        lista2.add(user3);
        lista2.add(user4);

        for (User osoba : lista2) {
            System.out.println("Imie: " + osoba.getName() + " Nazwisko: " + osoba.getLastname() + " Wiek: " + osoba.getAge());
        }
    }
}
