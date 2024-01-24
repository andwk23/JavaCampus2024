public class Main {
    public static void main(String[] args) {

        System.out.println(verschluesselung("ABC"));
    }
    public static String verschluesselung(String s){
        char[] chars = s.toCharArray();
        String result = "";

        for(int i = 0; i < chars.length; i++){
            int buchstabe = chars[i];
            result += buchstabe;
        }
        return result;
    }
}
