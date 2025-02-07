import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Month5 {
    public static void main(String[] args) {
        File file = new File("monthinput.txt"); 
        try {
            Scanner sc = new Scanner(file);

            System.out.print("enter the month: ");
            int month = sc.nextInt();
            int days_num = 0;
            System.out.print("Enter the start day of the month: ");
            int start = sc.nextInt();

            if (month == 2) {
                System.out.print("enter the number of days in feb(28/29): ");
                days_num = sc.nextInt();
            } else {
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    days_num = 31;
                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    days_num = 30;
                }
            }

            System.out.println("M T W T F S S");
            int mat[][] = new int[4][7];
            int k = 1;
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    if (i == 0 && j < start - 1) {
                        continue;
                    }
                    mat[i][j] = k;
                    k++;
                }
            }
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    if (i == 0 && j < start - 1) {
                        System.out.print("* ");
                        continue;
                    }
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            e.printStackTrace();
        }
    }
}
