package Teht�v�1FactoryMethod;

public abstract class AterioivaOtus {

    Juoma juoma = null;

    public abstract Juoma createJuoma();


    public void aterioi(){
        sy�();
        juo();
    }

    public void sy�(){
        System.out.println("Kylläpä ruoka maistuukin hyvältä");
    }


    public void juo(){
        if (juoma == null)
            juoma = createJuoma();
        System.out.println("Aterian jälkeen " + juoma + " tekee terää");
    }
}
