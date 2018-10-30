package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;

public class Imenik extends HashMap {
    private String ime;
    private TelefonskiBroj broj;
    void dodaj(String ime, TelefonskiBroj broj){
        this.ime = ime;
        this.broj = broj;
    }
    public String dajBroj(String ime) {return null;}
}
