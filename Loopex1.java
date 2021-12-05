import java.util.Scanner;

public class Loopex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=0;
        int m=0;
        int n=0;
        int a=0;
            for (int i = 0; i <= a; i++) {
                 a= sc.nextInt();
                if(a==0)
                    n=n+1;
                else if ( a>0)
                l=l+1;
                else
               m=m+1;
        System.out.println("Sifirlarin sayi: "+n+" Musbet ededlerin sayi "+l+" Menfi ededlerin sayi "+m);
    }
} }
