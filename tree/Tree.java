package tree;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class TreeStructure {
    Node root;

    TreeStructure() {
        root = null;
    }
}

public class Tree {
    public static void main(String[] sm) {
        Scanner sc = new Scanner(System.in);
        TreeStructure t = new TreeStructure();
        t.root = new Node(10);
        t.root.left = new Node(5);
        t.root.right = new Node(20);
        System.out.println(t.root.data);
    }
}
