package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;

public class Imenik extends HashMap {
    private String ime;
    private TelefonskiBroj broj;

    void dodaj(String ime, TelefonskiBroj broj){
        this.put(ime, broj);
        this.put(broj, ime);
        //this.put(ime.substring(0,1), broj);
        this.ime = ime;
        this.broj = broj;
    }
    public String dajBroj(String ime) {
        TelefonskiBroj novi =(TelefonskiBroj) get(ime);
        return novi.ispisi();
    }
    public String dajIme(TelefonskiBroj broj){
        String s = (String) get(broj);
      return s;
    }
    public String naSlovo(char s){
        return new String("Kako ovo???");
    }
}
