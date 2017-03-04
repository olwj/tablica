package com.sdajava.tablica;

public class Main {

    public static void main(String[] args) {

        int[] tablica = new int[5];
        int[] tablica2 = {2,4,5,6};
        int suma = 0;

        tablica [0] = 23;
        tablica [1] = 234;
        tablica [2] = 42;
        tablica [3] = 2122;

        System.out.println("Indeks 3: " +tablica[3]);
        System.out.println("Rozmiar tablicy: "+tablica.length);

        for(int i = 0; i<tablica.length; i++)
        {
        suma = suma + tablica[i];
        }

        System.out.println("Suma elementow tablicy: " +suma);

        for(int i=0; i<tablica.length; i++)
        {
            System.out.println("Wartosc tablica[ " + i + " ] wynosi: "+tablica[i]);
        }

        for(int wartosc: tablica)
        {
            System.out.println("Wartosc tablicy: " + wartosc);
        }




    }
}
