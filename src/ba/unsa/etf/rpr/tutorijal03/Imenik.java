package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;

public class Imenik {
    private HashMap<String, TelefonskiBroj> hmap = new HashMap<String, TelefonskiBroj>();
    private String ime;
    private TelefonskiBroj broj;

    void dodaj(String im, TelefonskiBroj br) {
        this.ime = im;
        this.broj = br;
        hmap.put(ime, broj);
    }

    public String dajBroj(String ime) {
        TelefonskiBroj novi = (TelefonskiBroj) hmap.get(ime);
        return novi.ispisi();
    }

    public String dajIme(TelefonskiBroj broj) {
        for (Map.Entry<String, TelefonskiBroj> i : hmap.entrySet()) {
            if (i.getValue() == broj) {
                return i.getKey();
            }
        }
        return null;
    }

    public String naSlovo(char s) {
        String ss = "" + s;
        String k = new String();
        int brojac = 1;
        for (Map.Entry<String, TelefonskiBroj> par : hmap.entrySet())
            if(par.getKey().substring(0,1)== ss){
                k += brojac + ". " + par.getKey() + " - " + par.getValue().ispisi();
                brojac++;
            }
            return k;
    }
    /*public Set<String> izGrada(FiksniBroj.Grad g) {
        Set<String> skup = new Set<String>() ;
        for (Map.Entry<String, TelefonskiBroj> par : hmap.entrySet()){
            if(par instanceof FiksniBroj){
               return null;
            }
        }
        return null;*/
    }*/

}
