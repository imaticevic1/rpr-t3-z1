package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj implements Comparable {
    public enum Grad {BUGOJNO("30"),BUSOVACA("30"),DOBRETICI("30"),DONJI_VAKUF("30"),FOJNICA("30"),GORNJI_VAKUF("30"),JAJCE("30"),
        KISELJAK("30"),KRESEVO("30"),NOVI_TRAVNIK("30"),TRAVNIK("30"),VITEZ("30"),
    ODZAK("31"),ORASJE("31"),DOMALJAVAC_SAMAC("31"),BREZA("32"),DOBOJ_JUG("32"),KAKANJ("32"),MAGLAJ("32"),OLOVO("32"),
        TESANJ("32"),USORA("32"),VARES("32"),VISOKO("32"),ZAVIDOVICI("32"),
    ZENICA("32"),ZEPCE("32"),CENTAR_SARAJEVO("33"),HADZICI("33"),ILIDZA("33"),ILIJAS("33"),NOVI_GRAD("33"),SARAJEVO("33"),NOVO_SARAJEVO("33"),STARI_GRAD("33"),TRNOVO("33"),VOGOSCA("33"),
    BOSANSKO_GRAHOVO("34"),DRVAR("4"),GLAMOC("34"),KUPRES("34"),LIVNO("34"),TOMISLAVGRAD("34"),BANOVICI("35"),CELIC("35"),DOBOJ_ISTOK("35"),
        GRACANICA("35"),GRADACAC("35"),KALESIJA("35"),KLADANJ("35"),LUKAVAC("35"),SAPNA("35"),SREBRENIK("35"),TEOCEK("35"),TUZLA("35"),ZIVINICE("35"),
    CAPLJINA("36"),CITLUK("36"),JABLANICA("36"),KONJIC("36"),MOSTAR("36"),NEUM("36"),PROZOR("36"),RAVNO("36"),STOLAC("36"),BIHAC("37"),BOSANSKA_KRUPA("37"),BOSANSKI_PETROVAC("37"),
    BUZIM("37"),CAZIN("37"),KLJUC("37"),SANSKI_MOST("37"),VELIKA_KLADUSA("37"),GORAZDE("38"),GRUDE("39"),LJUBUSKI("39"),POSUSJE("39"),SIROKI_BRIJEG("39"),BRCKO("49"),
                JEZERO("50"),KUPRES1("50"),MRKONJIC_GRAD("50"),RIBNIK("50"),SIPIVO("50"),BANJA_LIKA("51"),CELINAC("51"),GRADISKA("51"),ISTOCNI_DRVAR("51"),KNEZEVO("51"),
        KOTOR_VAROS("51"),LAKTASI("51"),PETROVAC("51"),PRNJAVOR("51"),SRBAC("51"),
        BOSANSKA_KOSTJANICA("52"),BOSANSKA_DUBICA("52"),KRUPA_NA_UNI("52"),NOVI_GRAD1("52"),OSTRA_LUKA("52"),PRIJEDOE("52"),
        BOSANSKI_BROD("53"),DERVENTA("53"),DOBOJ("53"),MODRICA("53"),PETROVO("53"),TESLIC("53"),VUKOSAVLOJE("53"),DONJI_ZABAR("54"),PELAGICEVO("54"),BOSANSKI_SAMAC("54"),
        BIJELJINA("55"),LOPARE("55"),UGLJEVIK("55"),BRATUNAC("56"),MILICI("56"),OSMACI("56"),SREBRENICA("56"),SEKOVICI("56"),VLASENICA("56"),ZVORNIK("56"),
        HAN_PIJESAK("57"),ISTOCNA_ILIDZA("57"),ISTOCNI_STARI_GRAD("57"),ISTOCNO_NOVOsARAJEVO("57"),KALINOVIK("57"),PALE("57"),SOKOLAC("57"),TRNOVO1("57"),CAJNICE("58"),
        FOCA("58"),ROGATICA("58"),RUDO("58"),USTIPRACA("58"),VISEGRAD("58"),BREKOVICI("59"),
        BILECA("59"),GACKO("59"),ISTOCNI_MOSTAR("59"),LJUBINJE("59"),NEVESINJE("59"),TREBINJE("59");
    private final String pozivni;
    private Grad (String pozivni) {this.pozivni = pozivni;}
    public String getPozivni(){
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
        return "0" + grad.getPozivni() + "/" + broj;

    }
    @Override
    public int compareTo(Object o) {
        return this.ispisi().compareTo(((TelefonskiBroj) o).ispisi());
    }
}
