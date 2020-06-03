package data_structures;

public class BasicBinaryTree<T extends Comparable<T>> {
    private Node root;
    private int size;

    public BasicBinaryTree() {
        root = null;
    }

    public int size() {
        return size;
    }

    public void add(T item) {
        var node = new Node(item);
        if (root == null) {
            this.root = node;
            System.out.println("Set root: " + node.getItem());
            this.size++;
        } else {
            insert(this.root, node);
        }
    }

    public boolean contains(T item) {
        var node = getNode(item);
        return node != null;
    }

    public boolean delete(T item) {
        var deleted = false;
        if (this.root == null) {
            return false;
        }

        var currentNode = getNode(item);
        if (currentNode != null) {
            if (currentNode.getLeft() == null && currentNode.getRight() == null) {
                unlink(currentNode, null);
                deleted = true;
            } else if (currentNode.getLeft() == null && currentNode.getRight() != null) {
                unlink(currentNode, currentNode.getRight());
                deleted = true;
            } else if (currentNode.getLeft() != null && currentNode.getRight() == null) {
                unlink(currentNode, currentNode.getLeft());
                deleted = true;
            } else {
                var child = currentNode.getLeft();
                while (child.getRight() != null && child.getLeft() != null) {
                    child = child.getRight();
                }

                child.getParent().setRight(null);
                child.setLeft(currentNode.getLeft());
                child.setRight(currentNode.getRight());
                deleted = true;
            }
        }

        if (deleted) {
            this.size--;
        }

        return deleted;
    }

    private void unlink(Node currentNode, Node newNode) {
        if (currentNode == this.root) {
            newNode.setLeft(currentNode.getLeft());
            newNode.setRight(currentNode.getRight());
            this.root = newNode;
        } else if (currentNode.getParent().getRight() == currentNode) {
            currentNode.getParent().setRight(newNode);
        } else {
            currentNode.getParent().setLeft(newNode);
        }
    }

    private Node getNode(T item) {
        var currentNode = this.root;
        while (currentNode != null) {
            var val = item.compareTo(currentNode.getItem());
            if (val == 0) {
                return currentNode;
            } else if (val < 0) {
                currentNode = currentNode.getLeft();
            } else {
                currentNode = currentNode.getRight();
            }
        }
        return null;
    }

    private void insert(Node parent, Node child) {
        if (child.getItem().compareTo(parent.getItem()) < 0) {
            if (parent.getLeft() == null) {
                parent.setLeft(child);
                child.setParent(parent);
                this.size++;
            } else {
                insert(parent.getLeft(), child);
            }
        } else if (child.getItem().compareTo(parent.getItem()) > 0) {
            if (parent.getRight() == null) {
                parent.setRight(child);
                child.setParent(parent);
                this.size++;
            } else {
                insert(parent.getRight(), child);
            }
        }

        // We just ignore for duplicates
    }

    private class Node {
        private Node right;
        private Node left;
        private Node parent;
        private T item;

        public Node(T item) {
            this.item = item;
            right = null;
            left = null;
            parent = null;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }
    }
}
