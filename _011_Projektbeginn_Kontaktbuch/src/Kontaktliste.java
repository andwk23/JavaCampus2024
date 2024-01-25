import java.util.Arrays;

public class Kontaktliste {
    // Array für Elemente
    Kontakt[] elemente = new Kontakt[10];
    // Objektmethode "hinzufügen"
    public void hinzufuegen(Kontakt kontakt) {
        boolean wurdeEingefuegt = false;
        for (int i = 0; i < elemente.length; i++) {
            if (elemente[i] == null) {
                elemente[i] = kontakt;
                wurdeEingefuegt = true;
                break;
            }
        }

        if (!wurdeEingefuegt) {
           Kontakt[] neueElemente  = new Kontakt[elemente.length +10];
           arrayKopieren(elemente, neueElemente);
           neueElemente[elemente.length] = kontakt;
           elemente = neueElemente;
        }
    }
    // Objektmethode "entfernen"
    public void entfernen(Kontakt kontakt){
        for (int i = 0; i < elemente.length; i++) {
            if (elemente[i] != null){
                Kontakt zumVergleich = elemente[i];
                if (kontakt.getVorname().equals(zumVergleich.getVorname()) &&
                kontakt.getNachname().equals(zumVergleich.getNachname()) &&
                kontakt.getTelefonnummer().equals(zumVergleich.getTelefonnummer())){
                    elemente[i] = null;
                    break;
                }
            }
        }
    }

    // Objektmethode "arrayKopieren"
    public void arrayKopieren(Kontakt[] a, Kontakt[] b) {
        int zaehlerB = 0;
        for (Kontakt kontakt : a) {
            if (kontakt != null) {
                b[zaehlerB] = kontakt;
                zaehlerB++;
            }
        }
    }
}
