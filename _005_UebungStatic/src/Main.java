public class Main {
    public static void main(String[] args) {
        TaschenRechnerMitBasis taschenRechner = new TaschenRechnerMitBasis(10);
        System.out.println(taschenRechner.addieren(23));
        System.out.println(taschenRechner.subtrahieren(2) );
        System.out.println(TaschenRechnerMitBasis.letztesErgebnis());
        System.out.println(taschenRechner.addieren(662));
        System.out.println(TaschenRechnerMitBasis.letztesErgebnis());
    }


}
class TaschenRechnerMitBasis {
    int basis;
    static int ergebnis = 0;

    public TaschenRechnerMitBasis(){}
    public TaschenRechnerMitBasis(int basis){
        this.basis = basis;
    }
    public int addieren(int zahl){
        int tmp = this.basis + zahl;
        TaschenRechnerMitBasis.ergebnis = tmp;
        return tmp;
    }
    public int subtrahieren(int zahl){
        int tmp = this.basis - zahl;
        TaschenRechnerMitBasis.ergebnis = tmp;
        return tmp;
    }
    public static int letztesErgebnis(){
        return ergebnis;
    }
}
