package tree;
import java.util.*;
//tree
public class Tree{
    static class tree{
        int data;
        tree left;
        tree right;
        tree(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    public static void main(String[] sm){
        tree root=new tree(1);
        root=new tree(1);
        root.left=new tree(2);
        root.right=new tree(3);
        root.left.left=new tree(4);
        root.left.right=new tree(5);
        root.right.left=new tree(6);
        root.right.right=new tree(7);
        System.out.println("Inorder recursively");
        inorder(root);
        System.out.println();
        System.out.println("Preorder recursively");
        preorder(root);
        System.out.println();
        System.out.println("Postorder recursively");
        postorder(root);
        System.out.println();
        System.out.println("Iterative traversal");
        iterative(root);
        System.out.println();


    }
    public static void inorder(tree root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
        
    }
    public static void preorder(tree root){
        if(root==null) return;
       
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
        
    }
    public static void postorder(tree root){
        if(root==null) return;
       
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
        
    }
    public static void iterative(tree root){
        Stack<tree> st=new Stack<>();
        tree cur=root;
        while(cur!=null||!st.isEmpty()){
            while(cur!=null){
                st.push(cur);
                cur=cur.left;
                
            }
            cur=st.pop();
            System.out.print(cur.data+" ");
            cur=cur.right;
            
        }        

    }


}