import java.util.Scanner;
class Palindrome
{   
    public static boolean palin(String s,int i,int j){
        if(i>=j){
            return true;
        }
        else if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        else{
            return palin(s, i+1, j-1);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a String");
        String s=sc.nextLine();
        char [] ch=s.toCharArray();
        int n=ch.length;
        int i=0;
        int j=n-1;
        if(palin(s,i,j)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
        sc.close();
    }
}