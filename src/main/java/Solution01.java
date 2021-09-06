import java.util.Scanner;

public class Solution01 {
    // ask the user for their name
    // read in the input the user provides from standard input
    // print out the name to standard output

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
