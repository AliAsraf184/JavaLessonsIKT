package az.iktlab.juniors.java_lessons.lesson_7;

import java.util.Scanner;

public class Middlechrchtr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String x= sc.next();
       int a= x.length();
    char b = x.charAt(a-1);
    int odd= a/2;
    int even = (a/2)-1;
if(a%2==0) // daxil edilen tekdi
    System.out.println(x.charAt(odd)+" "+x.charAt(even));
      else {
    System.out.println(x.charAt(odd));}



    }
}
