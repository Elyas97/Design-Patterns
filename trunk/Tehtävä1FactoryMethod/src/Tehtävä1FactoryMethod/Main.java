package Teht�v�1FactoryMethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus opiskelija= new Opiskelija();
        AterioivaOtus lapsi= new Lapsi();
        opettaja.aterioi();
        opiskelija.aterioi();
        lapsi.aterioi();
    }
}
