import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File file = new File("src/test.txt");
        System.out.println(file.exists());

        try {
            //file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.write("Zeile 1!");

            writer.close();
        }catch (IOException e) {
            System.out.println("Fehler");
        }
        try {
            FileReader reader = new FileReader(file);
            int zeichen = reader.read();
            while (zeichen != -1) {
                System.out.println((char) zeichen);
                zeichen = reader.read();
            }

            reader.close();
        }catch (IOException e){
            System.out.println("Fehler");
        }

    }
}