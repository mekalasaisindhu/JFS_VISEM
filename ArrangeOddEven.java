import java.util.*;
public class ArrangeOddEven {
    public static void main(String[] args) {
        int [] arr={81,31,66,1,4,3,8,6,21};
        System.out.println(fun(arr));
    }
    public static List<Integer> fun(int[] arr){
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0) l1.add(arr[i]);
            if(arr[i]%2==0) l2.add(arr[i]);
        }
        l1.addAll(l2);
        return l1;
    }

}
