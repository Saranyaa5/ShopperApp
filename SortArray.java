import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt"); 
            Scanner sc = new Scanner(file);

            int size = sc.nextInt();
            int arr[] = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr); 

            for (int num : arr) {
                System.out.print(num + " ");
            }
            
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: input.txt not found. Make sure the file exists in the correct directory.");
        }
    }
}
