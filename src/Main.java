import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // q1: take input from the user and sum

        int number=1234;
        int ans=0;
        while(number >0){

            int rem=number %10;
            number /=number;
           ans=ans*10+rem;
            System.out.println();

        }

    }
}