import java.io.*;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Read the integer N from input
        int N = scanner.nextInt();

        // Loop to print the first 10 multiples of N
        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }

        scanner.close();
    }
}