import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OddEvenCountFromFile {
    public static void main(String[] args) {
        File file = new File("input.txt");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new arr[size];

       for(int i=0;i<size;i++){
         arr[i]=sc.nextInt();
       }
      
    int odd=0;
		int even=0;
		for(int i=0;i<size;i++) {
			if(arr[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.printf("odd: %d even: %d",odd,even);
    sc.close();
        
    }
}
