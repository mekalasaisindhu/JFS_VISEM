import java.util.*;
public class SumOfTheDigits {
    public static int sum(int n){
    if(n==0)
        return 0;
    return (n%10+sum(n/10));
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a number");
     int n=sc.nextInt();
     int r=sum(n);
     System.out.println(r);
     sc.close();
    }
}
