package Teht‰v‰1FactoryMethod;

public abstract class AterioivaOtus {

    Juoma juoma = null;

    public abstract Juoma createJuoma();


    public void aterioi(){
        syˆ();
        juo();
    }

    public void syˆ(){
        System.out.println("Kyll√§p√§ ruoka maistuukin hyv√§lt√§");
    }


    public void juo(){
        if (juoma == null)
            juoma = createJuoma();
        System.out.println("Aterian j√§lkeen " + juoma + " tekee ter√§√§");
    }
}
