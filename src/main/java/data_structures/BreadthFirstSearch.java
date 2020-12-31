package data_structures;

public class BreadthFirstSearch {
    Node<Integer> root;

    void printOrderLevel() {
        int height = getTotal(root);
        for (int i = 0; i < height; i++) {
            printGivenLevel(root, i);
        }
    }

    void printGivenLevel(Node<Integer> node, int level) {
        if (node == null) {
            return;
        } else if (level == 0) {
            System.out.println(node.getValue() + " ");
        } else if (level > 0) {
            printGivenLevel(node.getLeft(), level - 1);
            printGivenLevel(node.getRight(), level - 1);
        }
    }


    public int getTotal(Node<Integer> node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + Math.max(getTotal(node.getLeft()), getTotal(node.getRight()));
        }
    }

    public static void main(String[] args) {
        var breadthFirstSearch = new BreadthFirstSearch();
        breadthFirstSearch.root = new Node<>(4);
        breadthFirstSearch.root.setLeft(new Node<>(8));
        breadthFirstSearch.root.setRight(new Node<>(10));
        breadthFirstSearch.printOrderLevel();
    }
}
