import javax.swing.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // Kontakte laden

        // Kontakt-Klasse erstellen
        Kontakt kontakt = new Kontakt("Harald", "Unbekannt", "01234- 6789258");
        System.out.println(kontakt.getVorname());

        // Listenstruktur für Kontakte implementieren
        Kontaktliste kontakliste = new Kontaktliste();
        for(int i = 0; i <= 10; i++) {
            kontakliste.hinzufuegen(kontakt);
        }
        for(int i = 0; i < kontakliste.elemente.length - 9; i++) {
            Kontakt schublade = kontakliste.elemente[i];
            System.out.println("Vorname: " + schublade.getVorname() +
                    " - Nachname: " + schublade.getNachname() +
                    " - Telefonnumer: " + schublade.getTelefonnummer());
        }


        // Eingabeaufforderung[Erstellen/Anzeigen/Suchen/Beenden]

        String eingabe =
                nichtLeereEingabe("Bitte gib einen befehl ein [Erstellen/Anzeigen/Suchen/Beenden]").toUpperCase();
        if(eingabe.equals("ERSTELLEN")) {
            System.out.println("Befehl: ERSTELLEN");
        } else if(eingabe.equals("ANZEIGEN")){
            System.out.println("Befehl: ANZEIGEN");
        } else if (eingabe.equals("SUCHEN")){
            System.out.println("Befehl: SUCHEN");
        } else if (eingabe.equals("BEENDEN")){
            System.out.println("Befehl: BEENDEN");
        }
        // Logik

        // Kontakte speichern
    }
    public static String nichtLeereEingabe(String eingabeAufforderung){
        String eingabe = "";
        while(eingabe.trim().equals("")){
            eingabe = JOptionPane.showInputDialog(eingabeAufforderung);
        }
        
        return eingabe;

    }

}