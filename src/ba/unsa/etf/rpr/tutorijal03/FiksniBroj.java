package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    public enum Grad {BUGOJNO(030),BUSOVACA(030),DOBRETICI(030),DONJI_VAKUF(030),FOJNICA(030),GORNJI_VAKUF(030),JAJCE(030),
        KISELJAK(030),KRESEVO(030),NOVI_TRAVNIK(030),TRAVNIK(030),VITEZ(030),
    ODZAK(031),ORASJE(031),DOMALJAVAC_SAMAC(031),BREZA(032),DOBOJ_JUG(032),KAKANJ(032),MAGLAJ(032),OLOVO(032),
        TESANJ(032),USORA(032),VARES(032),VISOKO(032),ZAVIDOVICI(032),
    ZENICA(032),ZEPCE(032),SARAJEVO(033)/*,HADZICI,ILIDZA,ILIJAS,NOVI_GRAD,SARAJEVO,NOVO_SARAJEVO,STARI_GRAD,TRNOVO,VOGOSCA,
    BOSANSKO_GRAHOVO,DRVAR,GLAMOC,KUPRES,LIVNO,TOMISLAVGRAD,BANOVICI,CELIC,DOBOJ_ISTOK,
        GRACANICA,GRADACAC,KALESIJA,KLADANJ,LUKAVAC,SAPNA,SREBRENIK,TEOCEK,TUZLA,ZIVINICE,
    CAPLJINA,CITLUK,JABLANICA,KONJIC,MOSTAR,NEUM,PROZOR,RAVNO,STOLAC,BIHAC,BOSANSKA_KRUPA,BOSANSKI_PETROVAC,
    BUZIM,CAZIN,KLJUC,SANSKI_MOST,VELIKA_KLADUSA,GORAZDE,GRUDE,LJUBUSKI,POSUSJE,SIROKI_BRIJEG,BRCKO*/;
    private final int levelCode;
    private Grad (int levelCode) {this.levelCode = levelCode;}
    public int getLevelCode(){
    return this.levelCode;
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
        return new String(grad.getLevelCode() + "/" + broj);
    }
    @Override
    public int hashCode(){return 0;}
}
