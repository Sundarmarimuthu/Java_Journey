import java.util.*;
public class mlove {
    public static void main(String[] sm){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    } 
    int[] al=new int[n];
    int j=0;
    for(int i=0;i<n;i++){
        if(a[i]!=0) al[j++]=a[i];
    }
    System.out.print(Arrays.toString(al));

    
}
}