import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // Einlesen von Konsole
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte gib den Rechnungsbetrag ein: ");
        String eingabeRechnung = scanner.nextLine();
        System.out.print("Wie viel Prozent Trinkgeld (z.B. 10): ");
        String eingabeProzent = scanner.nextLine();
        System.out.print("Wie viele Personen waren beteiligt? ");
        String eingabePersonen = scanner.nextLine();

        // Verarbeiten von Eingaben
        float rechnungsbetrag = Float.parseFloat(eingabeRechnung);
        int prozent = Integer.parseInt(eingabeProzent);
        int personen = Integer.parseInt(eingabePersonen);

        // berechnen von Daten
        float trinkgeld =rechnungsbetrag * (prozent / 100f);
        float rechnung = rechnungsbetrag + trinkgeld;
        float rechnungProPerson = rechnung / personen;

        // Ausgeben von Daten
        System.out.println("\nEin Trinkgeld von " + prozent + "% entspricht: " + trinkgeld + " Euro.");
        System.out.println("Rechnungsbetrag + Trinkgeld entspricht: " + rechnung + " Euro.");
        System.out.println("Jede Person übernimmt: " + rechnungProPerson + " Euro");
    }

}