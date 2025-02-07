import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OddEvenCountFile {
    public static void main(String[] args) {
        File file = new File("input.txt"); 

        try (Scanner sc = new Scanner(file)) {
            int size = sc.nextInt(); 
            int arr[] = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            int odd = 0, even = 0;
            for (int num : arr) {
                if (num % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            System.out.printf("Odd: %d Even: %d%n", odd, even);

        } catch (FileNotFoundException e) {
            System.out.println("Error: input.txt not found. Please make sure the file exists.");
        }
    }
}
