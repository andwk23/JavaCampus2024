import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        // Anzahl der Antwortmöglichkeiten einlesen
        int anzahl = leseAnzahl();

        //Antwortmöglichkeit einlesen
        String[] antworten = leseAntworten(anzahl);

        // Frage einlesen
        String antwort = "";
        while (true){
            String neueFrage = JOptionPane.showInputDialog(antwort + "Eine Frage stellen");
            if(neueFrage.equals("")){
                break;
            }
            else{
                antwort = antworten[zufallsZahl(0,anzahl-1)] + " ";
            }
        }

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

    public static String[] leseAntworten(int anzahl) {
        String[] antworten = new String[anzahl];
        int counter = 0;
        try {
            while (counter < anzahl){
                antworten[counter] = JOptionPane.showInputDialog("Antwort Nummer:", counter);
                counter++;
            }
        }
        catch (Exception e){
            System.out.println("Eingabe ist kein Antwort");
        }
    return antworten;
    }

    public static int zufallsZahl(int minimal, int maximal){
        float number = (float) Math.random() * (maximal - minimal) + minimal;
        return Math.round(number);
    }
}