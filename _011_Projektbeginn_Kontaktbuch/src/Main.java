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


        // Eingabeaufforderung

        // Logik

        // Kontakte speichern
    }


}