package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    public enum Grad {BUGOJNO(30),BUSOVACA(30),DOBRETICI(30),DONJI_VAKUF(30),FOJNICA(30),GORNJI_VAKUF(30),JAJCE(30),
        KISELJAK(30),KRESEVO(30),NOVI_TRAVNIK(30),TRAVNIK(30),VITEZ(30),
    ODZAK(31),ORASJE(31),DOMALJAVAC_SAMAC(31),BREZA(32),DOBOJ_JUG(32),KAKANJ(32),MAGLAJ(32),OLOVO(32),
        TESANJ(32),USORA(32),VARES(32),VISOKO(32),ZAVIDOVICI(32),
    ZENICA(32),ZEPCE(32),SARAJEVO(33)/*,HADZICI,ILIDZA,ILIJAS,NOVI_GRAD,SARAJEVO,NOVO_SARAJEVO,STARI_GRAD,TRNOVO,VOGOSCA,
    BOSANSKO_GRAHOVO,DRVAR,GLAMOC,KUPRES,LIVNO,TOMISLAVGRAD,BANOVICI,CELIC,DOBOJ_ISTOK,
        GRACANICA,GRADACAC,KALESIJA,KLADANJ,LUKAVAC,SAPNA,SREBRENIK,TEOCEK,TUZLA,ZIVINICE,
    CAPLJINA,CITLUK,JABLANICA,KONJIC,MOSTAR,NEUM,PROZOR,RAVNO,STOLAC,BIHAC,BOSANSKA_KRUPA,BOSANSKI_PETROVAC,
    BUZIM,CAZIN,KLJUC,SANSKI_MOST,VELIKA_KLADUSA,GORAZDE,GRUDE,LJUBUSKI,POSUSJE,SIROKI_BRIJEG,BRCKO*/;
    private final int pozivni;
    private Grad (int pozivni) {this.pozivni = pozivni;}
    public int getPozivni(){
    return this.pozivni;
    }
    }
    private Grad grad;
    private String broj;
    public FiksniBroj(Grad grad, String broj){
        this.grad = grad;
        this.broj = broj;
    }
    @Override
    public String ispisi(){
        System.out.println(grad.getPozivni());
        return new String("0" + grad.getPozivni() + "/" + broj);

    }
    @Override
    public int hashCode(){return 2;}
}
