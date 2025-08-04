import java.util.*;
public class valid {
    public static void main(String[] sm){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String> ls=new ArrayList<>();
        generate(ls,"",0,0,n);
        System.out.println(ls);
    }
    public static void generate(List<String> ls,String s,int open,int close,int n){
        if(s.length()==2*n){
            ls.add(s);
            return;

        }
        if(open<n){
            generate(ls,s+"(",open+1,close,n);
        }
        if(close<open){
            generate(ls,s+")",open,close+1,n);
        }
    }

    
}
