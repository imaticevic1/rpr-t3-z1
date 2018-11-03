package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;
import java.util.Set;
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
        String k = new String("");
        int brojac = 1;
        for (Map.Entry<String, TelefonskiBroj> par : hmap.entrySet()) {
            if (par.getKey().substring(0, 1).equals(ss)) {
                k += brojac + ". " + par.getKey() + " - " + par.getValue().ispisi() + "\n";
                brojac++;
            }
        }
            return k;
    }
    public Set<String> izGrada(FiksniBroj.Grad g) {
        Set<String> skup = new TreeSet<String>() ;
        for (Map.Entry<String, TelefonskiBroj> par : hmap.entrySet()){
                if(par.getValue().ispisi().substring(1,3).equals(g.getPozivni())) {
                    skup.add(par.getKey());
                }
        }
        return skup;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g){
        Set<TelefonskiBroj> skup = new TreeSet<TelefonskiBroj>() ;
        for (Map.Entry<String, TelefonskiBroj> par : hmap.entrySet()){
            if(par.getValue().ispisi().substring(1,3).equals(g.getPozivni())) {
                skup.add(par.getValue());
            }
        }
        return skup;
    }
}

