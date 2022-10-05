package com.company;

import java.io.Console;

public class Main {



    public static void main(String[] args) {
        // write your code here

        Musikalbum album01 = new Musikalbum("Linkin Park", "METEORA", Musikalbum.TontraegerTyp.CD, 2003, 13);

        System.out.println("Programm Musikalbum:");
        System.out.println("Der Interpreter:      " + album01.getInterpreter());
        System.out.println("Der Albumtitel:       " + album01.getAlbum());
        System.out.println("Der Tontraeger:       " + album01.getTontraeger());
        System.out.println("Das Erscheinungsjahr: " + album01.getErscheinungsjahr());
        System.out.println("Die AnzahlDerLieder:  " + album01.getAnzahlDerLieder());
    }
}
