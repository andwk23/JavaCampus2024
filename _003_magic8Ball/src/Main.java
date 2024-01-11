import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        // Anzahl der Antwortmöglichkeiten einlesen
        int anzahl = leseAnzahl();
        System.out.println(anzahl);

        //Antwortmöglichkeit einlesen

        // Frage einlesen

        // Zufällige Antwort wählen

        // Weitere Frage oder Programm beenden

        System.out.println("\n--- PROGRAMMENDE ---");
    }
    public static int leseAnzahl() {
        int anzahl = 1;
        boolean richtigeEingabe = false;
        while (!richtigeEingabe){
            try {
                anzahl = Integer.parseInt(JOptionPane.showInputDialog("Anzahl der Antworten"));
                if (anzahl > 0){
                    richtigeEingabe = true;
                }
            }
            catch (NumberFormatException e){
                System.out.println("Eingabe ist kein Integer");
            }
        }

        return anzahl;
    }
}