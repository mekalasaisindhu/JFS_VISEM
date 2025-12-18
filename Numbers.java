public class Numbers {
    public static void print_numbers(int i,int j)
    {
        if(i>j)
            return;
        else
            System.out.println(i);
        print_numbers(i+1,j);
    }
    public static void main(String[] args) {
        int i=1;
        int j=10;
        print_numbers(i,j);
    }
}
