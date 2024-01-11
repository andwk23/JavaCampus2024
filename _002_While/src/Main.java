public class Main {
    public static void main(String[] args)
    {
        int counter = 0;
        while (counter < 5){
            System.out.println((counter + 1) + "-te Iteration");
            counter++;
        }
        System.out.println("\n" + berechnen(2));
        System.out.println("\n" + berechnenfor(3));
    }
    public static int berechnenfor(int number){
        if(number == 0){
            return number;
        }
        for(; number < 10; ){
            number *= number;
        }
        return number;
    }
    public static int berechnen(int number){
        if(number == 0){
            return number;
        }
        while (number < 10){
            number *= number;
        }
        return number;
    }
}