public class Main {
    public static void main(String[] args) {
        TaschenRechnerMitBasis mk = new TaschenRechnerMitBasis();
        System.out.println(mk.addieren(26));
        System.out.println(TaschenRechnerMitBasis.letztesErgebnis());
    }
}


    class TaschenRechnerMitBasis {
        private int basis = 0;
        private static int ergebnis = 0;

        public TaschenRechnerMitBasis() {
        }

        public TaschenRechnerMitBasis(int basis) {
            this.basis = basis;
        }

        public int addieren(int zahl) {
            int tmp = this.basis + zahl;
            TaschenRechnerMitBasis.ergebnis = tmp;
            return tmp;
        }

        public int subtrahieren(int zahl) {
            int tmp = this.basis - zahl;
            TaschenRechnerMitBasis.ergebnis = tmp;
            return tmp;
        }

        public static int letztesErgebnis() {
            return ergebnis;
        }
    }