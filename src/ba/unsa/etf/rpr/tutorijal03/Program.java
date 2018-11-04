package ba.unsa.etf.rpr.tutorijal03;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Želite li kreirati telefinski imenik:\n1)Da\n2)Ne");
        int n = ulaz.nextInt();
        Imenik imenik = new Imenik();
        int upisuj = 1;
        while(upisuj > 0) {
            System.out.println("Unesi:\n1)Fiksni broj" +
                    "\n2)Mobilni broj\n3)Prekini unos");
            int k = 0;
        switch (n){
            case 1:
                k = ulaz.nextInt();
                switch(k) {
                    case 1:
                        System.out.println("Unesite podatke osobe u obliku\nIme i prezime\nBroj\nGrad");
                        new String(ulaz.nextLine());
                        String imePrezime = ulaz.nextLine();
                        String broj = ulaz.nextLine();
                        String grad = ulaz.nextLine();
                        FiksniBroj.Grad gradEnum = FiksniBroj.Grad.valueOf(grad.toUpperCase());
                        imenik.dodaj(imePrezime, new FiksniBroj(gradEnum, broj));
                        System.out.println("Nastaviti unos?\n1)Da\n2)Ne");
                        int v = ulaz.nextInt();
                        upisuj = 2 - v;
                        break;
                    case 2:
                        System.out.println("Unesite podatke osobe u obliku\nIme i prezime\nMobilna mreza\nBroj");
                        new String(ulaz.nextLine());
                        String imePrezime1 = ulaz.nextLine();
                        int mobilnaMreza = ulaz.nextInt();
                        String broj1 = ulaz.nextLine();
                        imenik.dodaj(imePrezime1, new MobilniBroj(mobilnaMreza, broj1));
                        System.out.println("Nastaviti unos?\n1)Da\n2)Ne");
                        int v1 = ulaz.nextInt();
                        upisuj = 2 - v1;
                        break;
                    default:
                        System.out.println("Uspješno ste završili kreiranje telefonskog imenika!");
                        return;
                }
                break;
                default: return;
                }
        }
    }
}
