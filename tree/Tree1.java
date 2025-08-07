package tree;
//iterative traversal
import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class Tree1 {
    public static void main(String[] sm) {
        // Create a sample tree: 
        //      1
        //     / \
        //    2   3
        //   / \
        //  4   5
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Iterative Inorder Traversal:");
        inorderIterative(root);
    }

    public static void inorderIterative(Node root) {
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
        System.out.println();
    }
}
