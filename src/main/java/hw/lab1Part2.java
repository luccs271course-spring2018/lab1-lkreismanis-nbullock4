import java.util.Scanner;
public class lab1Part2{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int n;
        System.out.println("Please enter a number: ");
        n = keyboard.nextInt();

        String[] result = new String[n];
        for(int i = 0; i < result.length;i++){
            System.out.println(" ");
        }
        for(int i=1; i<=n; i++){
            if(i % 15 == 0){
                System.out.println("fizz buzz");
            }
            else if(i % 3 == 0){
                System.out.println("fizz");
            }
            else if(i % 5 == 0){
                System.out.println("buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
    
    public static String[] fizzBuzzArray(final int n){
        int j = n-1;
        String[] result = new String[j];
        for(int i = 0; i < n; i++){
            if(i % 15 == 0) {
                result[i] = "Fizz Buzz";
            }
            else if(i % 5 == 0){
                result[i] = "Buzz";
            }
            else if(i % 3 == 0){
                result[i] = "Fizz";
            }
            else{
                result[i] = String.valueOf(result[0]);
            }

        }
        return result;
    }
}