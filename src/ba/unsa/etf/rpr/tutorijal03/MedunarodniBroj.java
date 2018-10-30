package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj  {
    private String drzava, broj;

    public MedunarodniBroj(String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
    }

    @Override
    public String ispisi() {return new String(drzava + "/" + broj);}

    @Override
    public int hashCode() {
        return 1;
    }
}
