public class BinaryTree {

    private Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    private Node recursiveAdd(Node currentNode, int value) {
        if (currentNode == null) {
            return new Node(value);
        }

        if (value < currentNode.value) {
            currentNode.left = recursiveAdd(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = recursiveAdd(currentNode.right, value);
        } else {
            return currentNode;
        }

        return currentNode;
    }

    public void add(int value) {
        root = recursiveAdd(root, value);
    }

    public void orderTraversal(Node node) {
        if (node != null) {
            orderTraversal(node.left);
            System.out.print(node.value + " ");
            orderTraversal(node.right);
        }
    }

}