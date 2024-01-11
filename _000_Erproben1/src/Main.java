import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n*** Arrays ***");
        int[] array = new int[3];
        array[0] = 17;
        array[1] = 5;
        array[2] = 56;
        System.out.println(addiereArray(array));

        System.out.println("\n*** For-Schleifen ***");
        for(int i = 0; i < 4; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 3; i >= 0; i--){
            System.out.print(i + " ");
        }
        final int[] ints = generiereArray(1000);
        System.out.println("\n");
        System.out.println(ints[0]);
        System.out.println(ints[999]);
        System.out.println(Arrays.toString(ints));
        System.out.println();
        System.out.println(addiereArray(ints));
    }

    public static int[] generiereArray(int l){
        int[] array = new int[l];
        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }
        return array;
    }
    public static int addiereArray(int[] values){
        int result = 0;
        for(int i = 0; i < values.length; i++){
            result += values[i];
        }
        return result;
    }
}