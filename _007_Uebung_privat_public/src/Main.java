public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("BMW", 56000);
        System.out.println(auto.toString());
    }
}
class Auto{
    private String modell;
    private int preis;
    public Auto(){};

    public Auto(String modell, int preis) {
        this.modell = modell;
        this.preis = preis;
    }

    public String leseModell() {
        return modell;
    }

    public void setzeModell(String modell) {
        this.modell = modell;
    }

    public int lesePreis() {
        return preis;
    }

    public void setzePreis(int preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "modell='" + modell + '\'' +
                ", preis=" + preis +
                '}';
    }
}