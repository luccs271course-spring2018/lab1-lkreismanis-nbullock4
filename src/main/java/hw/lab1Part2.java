import java.util.Scanner;
import java.util.Scanner;    
    
public class lab1Part2 {
    public static void main(String[] args){
        int n;
        int i;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        n = keyboard.nextInt();
        for(i = 1; i < n+1; i++){

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("Fizz-Buzz");
                }
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                else
                    System.out.println(i);
        }
    }
}