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
            int k;
        switch (n){
            case 1:
                k = ulaz.nextInt();
                switch(k) {
                    case 1:
                        System.out.println("Unesite podatke osobe:");
                        System.out.print("Ime i prezime: ");
                        Scanner ulaz0 = new Scanner(System.in);
                        String imePrezime = ulaz0.nextLine();
                        System.out.print("Fiksni broj: ");
                        Scanner ulaz5 = new Scanner(System.in);
                        String broj = ulaz5.nextLine();
                        System.out.print("Grad: ");
                        Scanner ulaz6 = new Scanner(System.in);
                        String grad1 = ulaz6.nextLine();
                        FiksniBroj.Grad gradEnum = FiksniBroj.Grad.valueOf(grad1.toUpperCase());
                        imenik.dodaj(imePrezime, new FiksniBroj(gradEnum, broj));
                        System.out.println("Nastaviti unos?\n1)Da\n2)Ne");
                        int v = ulaz.nextInt();
                        upisuj = 2 - v;
                        break;
                    case 2:
                        System.out.println("Unesite podatke osobe:");
                        System.out.print("Ime i prezime: ");
                        Scanner ulaz1 = new Scanner(System.in);
                        String imePrezime1 = ulaz1.nextLine();
                        System.out.print("Mobilna mreza: ");
                        Scanner ulaz2 = new Scanner(System.in);
                        int mobilnaMreza = ulaz2.nextInt();
                        System.out.print("Broj: ");
                        Scanner ulaz3 = new Scanner(System.in);
                        String broj1 = ulaz3.nextLine();
                        imenik.dodaj(imePrezime1, new MobilniBroj(mobilnaMreza, broj1));
                        System.out.println("Nastaviti unos?\n1)Da\n2)Ne");
                        int v1 = ulaz.nextInt();
                        upisuj = 2 - v1;
                        break;
                    default:
                        return;
                }
                break;
                default:
                    return;
                }
        }
    }
}
