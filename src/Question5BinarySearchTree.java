public class Question5BinarySearchTree {
    private Node root;
    private static int counter = 0;

    private class Node{
        private int value;
        private Node left;
        private Node right;

        private Node (int value){
            this.value = value;
        }
    }

    public Question5BinarySearchTree(int value){
        root = new Node (value);
    }

    public Node kthLowestValue(Node root, int k)
    {
        // base case
        if (root == null)
            return null;

        // search in left subtree
        Node left = kthLowestValue(root.left, k);

        // if kth lowest is found in left subtree, return it
        if (left != null)
            return left;

        // if current element is k'th smallest, return it
        counter++;
        if (counter == k)
            return root;

        // else search in right subtree
        return kthLowestValue(root.right, k);
    }
}