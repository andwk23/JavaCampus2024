public class Main {
    public static void main(String[] args)
    {
        int[] array = new int[1];
        try {
            System.out.println( array[1] );
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index nicht zulässig");
            e.printStackTrace();
        } finally {
            System.out.println("Programmende");
        }


    }
}