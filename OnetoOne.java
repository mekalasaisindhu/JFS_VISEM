
/*class passport{
    int pNo;
    String nationality;
    passport(int pNo,String nationality){
        this.pNo=pNo;
        this.nationality=nationality;
}
}
class person{
    int id;
    String name;
    passport p;
    person(int id,String name,passport p){
        this.id=id;
        this.name=name;
        this.p=p;
}
}

public class OnetoOne {
    public static void main(String[] args) {
        passport p1=new passport(98765,"Indian");
        person per1=new person(1,"Krishna",p1);
        System.out.println("Passport Number: "+per1.p.pNo);
     
}
}
*/
//write a program to store n persons passport details and print any given peron id,nma,passport number and nationality

import java.util.*;
class Passport{
    int pNo;
    String nationality;
    Passport(int pNo,String nationality){
        this.pNo=pNo;       
        this.nationality=nationality;
    }
}
class Person{
    int id;
    String name;
    Passport p;
    Person(int id,String name,Passport p){
        this.id=id;
        this.name=name;
        this.p=p;
    }
}
public class OnetoOne {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      Passport p;
      Person m[];
      int n=3;
        m=new Person[n];
        for(int i=0;i<n;i++){
            p=new Passport(1000+i,"Indian");
            System.out.println("Enter id of person ");
            int id=sc.nextInt();
            System.out.println("Enter name of person ");
            String name=sc.next();
            m[i]=new Person(id,name,p);
        }
        
        System.out.println("Enter id (0 to "+(n-1)+") to get details ");
        int k;
      
        k=sc.nextInt();
        System.out.println("Person name: "+m[k].name);
        System.out.println("Passport Number: "+m[k].p.pNo);
        System.out.println("Nationality: "+m[k].p.nationality);
        sc.close();
    }
            
}
