package DSA.practiseDSa;

import java.util.LinkedList;
import java.util.Queue;

import DSA.BinaryTress.buildtree;

public class BinaryTree {

    // Nested class Node
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Static nested class for tree operations
    static class BinaryTrees {
        static int idx = -1;

        public static Node buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new BinaryTree().new Node(nodes[idx]); // Create an instance of Node
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode;
        }
    }

    // making the pre order in the binary tree

    public void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    // making the implementation for the inOrder

    public void InOrder(Node root) {
        if (root == null) {
            return;
        }

        // this is for the trversing for the left side of the tree
        InOrder(root.left);

        // prinitng the parent class if the left is represent null
        System.out.println(root.data + " ");

        // making the right side

        InOrder(root.right);
    }

    // making the post order using the dsa

    public void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    // making the level order traversal

    public void leverOrder(Node root){
        if(root == null){
            return;
        }

        Queue<Node> queyNodes = new LinkedList<>();
        queyNodes.add(root);

        while (!queyNodes.isEmpty()) {
            Node currentNode = queyNodes.poll();
            System.out.println(currentNode.data + " ");


            if(currentNode.left != null){
                queyNodes.add(currentNode.left);
            }


            if(currentNode.right != null){
                queyNodes.add(currentNode.right);
            }
        }


        
    }


    //counting the nodes 

    public static int countNodes(Node root){

        if(root == null){
            return 0;
        }
      int leftside = countNodes(root.left);
      int rightside = countNodes(root.right);

      return leftside + rightside + 1;




    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();

        // Building the tree
        Node root = BinaryTrees.buildtree(nodes);

        // Performing inorder traversal to display the tree
        System.out.println("Inorder traversal of the constructed tree:");
        // System.out.println(root.data);
        // tree.preOrder(root);

        // tree.InOrder(root);
        // tree.postOrder(root);
        // tree.leverOrder(root);

        System.out.println(countNodes(root));

    }
}
