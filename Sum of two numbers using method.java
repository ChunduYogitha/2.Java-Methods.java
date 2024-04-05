import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        int sol = Sum();
        System.out.println(sol);
    }   
    static int Sum(){
        Scanner sc  = new Scanner(System.in);
            System.out.print("Enter the number 1 : ");
            int n1 = sc.nextInt();
            System.out.print("Enter the number 2 : ");
            int n2 = sc.nextInt();
            int sum = n1 + n2;
            return sum;
    }
}
/*
Enter the number 1 : 10
Enter the number 2 : 20
30
*/
