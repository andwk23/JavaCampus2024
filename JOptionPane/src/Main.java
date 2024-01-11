import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        String eingabe = JOptionPane.showInputDialog("Eine Beispiel Nachricht");

        System.out.println(eingabe);

        float zufall = (float)Math.random();
        System.out.println(zufall);

        int gerundet = Math.round(zufall);
        System.out.println(gerundet);

        float[] begrenzung = new float[] {0.1f, 0.2f, 0.33f, 0.829f};
        float ergebnis = begrenzteZufallsZahl(begrenzung);
        System.out.println(ergebnis);
    }
    public static float begrenzteZufallsZahl(float[] begrenzung){
        float zufall = (float)Math.random();
        int counter = 0;

        while(counter < begrenzung.length){
            if (zufall == begrenzung[counter]){
                zufall = (float)Math.random();
                counter = 0;
            }else{
                counter++;
            }
        }
        return zufall;
    }
}