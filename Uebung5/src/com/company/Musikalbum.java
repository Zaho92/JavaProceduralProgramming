package com.company;

public class Musikalbum{

    public enum TontraegerTyp{
        Schallplatte,
        CD,
        mp3
    }

    private String Interpreter;
    private String Album;
    private TontraegerTyp Tontraeger;
    private int Erscheinungsjahr;
    private int AnzahlDerLieder;

    public Musikalbum(String in_Interpreter, String in_Album, TontraegerTyp in_Tontraeger, int in_Erscheinungsjahr, int in_AnzahlDerLieder){
        Interpreter = in_Interpreter;
        Album = in_Album;
        Tontraeger = in_Tontraeger;
        Erscheinungsjahr = in_Erscheinungsjahr;
        AnzahlDerLieder = in_AnzahlDerLieder;
    }

    public String getInterpreter(){
        return Interpreter;
    }

    public String getAlbum() {
        return Album;
    }

    public TontraegerTyp getTontraeger() {
        return Tontraeger;
    }

    public int getErscheinungsjahr() {
        return Erscheinungsjahr;
    }

    public int getAnzahlDerLieder() {
        return AnzahlDerLieder;
    }
}