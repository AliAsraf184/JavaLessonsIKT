import java.util.Arrays;
import java.util.Scanner;

public class JavaExample1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        int []arr1= new int[2];
        for (int i = 0; i < arr.length; i++) {
            arr [i]= scan.nextInt();
            int min = Arrays.stream(arr).min().getAsInt();
            int max = Arrays.stream(arr).max().getAsInt();

     arr1[0]=min;
     arr1[1]=max;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
