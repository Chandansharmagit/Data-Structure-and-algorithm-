package DSA.BinaryTress;

public class buildtree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildingTree(int nodes[]) {
            idx++;
            // Check if the index is within bounds
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }
            // Create the new node with the current index
            Node root = new Node(nodes[idx]);
            root.left = buildingTree(nodes);  // Recursively build the left subtree
            root.right = buildingTree(nodes); // Recursively build the right subtree
            return root;
        }
    }

    // Method to perform preorder traversal of the tree
    public static void preOrder(Node root) {
        if (root == null) { // Base case: if the current node is null, return
            return;
        }
        System.out.print(root.data + " "); // Visit the root node
        preOrder(root.left); // Traverse the left subtree
        preOrder(root.right); // Traverse the right subtree
    }

    public static void inOrder(Node root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }


    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data+ " ");
    }

    public static int sumofChildren(Node root){
        if(root == null){
            return 0;
        }
        int leftsum = sumofChildren(root.left);
        int rightsum = sumofChildren(root.right);
        return leftsum + rightsum + root.data;
    }


    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight , rightHeight) + 1;
    }


    public static void main(String[] args) {
        int[] nodes = {
                1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1
        };

        BinaryTree.idx = -1; // Reset index before building a new tree
        Node root = BinaryTree.buildingTree(nodes);
        if (root != null) {
            System.out.println("Root data: " + root.data);
        } else {
            System.out.println("The tree is empty.");
        }

        System.out.println("Preorder traversal of the tree:");
        postOrder(root);

        System.out.println("the output is " + countNodes(root));

        System.out.println("the sum of node is " + sumofChildren(root));

        System.out.println("finding the height of the tree structure " + height(root));
    }
}


