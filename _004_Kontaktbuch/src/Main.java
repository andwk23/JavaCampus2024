public class Main {
    public static void main(String[] args) {
        Auto meinErstesAuto = new Auto();
        Auto meinZweitesAuto = new Auto("BMW", 45000);

        gibAus(meinErstesAuto);

        meinErstesAuto.modell = "Polo";
        meinErstesAuto.preis = 20000;

        gibAus(meinErstesAuto);
        gibAus(meinZweitesAuto);

        Fahrrad f1 = erstelleFahrrad();
        gibAus(f1);

    }
    public static void gibAus(Auto auto) {
        System.out.println();
        System.out.println("Modell: " + auto.modell);
        System.out.println("Preis: " + auto.preis);
    }
    public static Fahrrad erstelleFahrrad() {
        Fahrrad fahrrad = new Fahrrad("Kettler", 560, 50);
        return fahrrad;
    }
    public static void gibAus(Fahrrad fahrrad){
        System.out.println("Modell: " + fahrrad.modell);
        System.out.println("Preis: " + fahrrad.preis);
        System.out.println("Rahmengroesse: " + fahrrad.rahmengroesse);
    }
}
class Auto{
    String modell = "";
    int preis = 0;

    // Konstruktoren
    public Auto() {
    }
    public Auto(String model, int preis){
        this.modell = model;
        this.preis = preis;
    }
}

class Fahrrad{
    String modell;
    int preis;
    int rahmengroesse;

    public Fahrrad(String modell, int preis, int rahmengroesse){
        this.modell =modell;
        this.preis = preis;
        this.rahmengroesse = rahmengroesse;
    }
}