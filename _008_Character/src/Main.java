public class Main {
    public static void main(String[] args) {
        char c = 'f';
        char inUnicode = '\u0063';
        int dezimal = (int) inUnicode;
        char ascii = (char) dezimal;
        char b = '\u0042';
        int dezimal1 = b;
        b = (char)dezimal;
        System.out.println("Character 'c' ist: " + c);
        System.out.println("In Unicode dargestellter Character ist: " + inUnicode);
        System.out.println("Umwandlung des Unicodecharacters in einen Integer(6*16 + 3): " + dezimal);
        System.out.println("Umwandlung der Zahl 99 in ein ASCII-Character: " + ascii);
        System.out.println("\nDefinition eines char durch Unicode, Umwandlung in int \n" +
                "und Umwandlung des int in char");
        System.out.println("\\u0042 = " + b);
        System.out.println("int dezimal = b ==> " + dezimal1);
        System.out.println("b = (char)dezimal ==> " + b);
    }
}