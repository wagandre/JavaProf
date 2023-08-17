package Lessons.lesson13;

public class MyBinaryTree {

    private Node root;

    public void add(int key, String value) {
        if (isEmpty()) {
            root = new Node(key, value);
        } else {
            Node current = root;
            Node parent = null;
            while (current != null) {
                if (key == current.key) {
                    current.value = value;
                    return;
                } else if (key < current.key) {
                    parent = current;
                    current = current.left;
                } else {
                    parent = current;
                    current = current.right;
                }
            }
            if (key < parent.key) {
                parent.left = new Node(key, value);
            } else {
                parent.right = new Node(key, value);
            }


        }
    }


    public Node getRoot() {
        return root;
    }

    public boolean isEmpty() {
        return root == null;


    }

    protected class Node  {
        public String getValue() {
            return value;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public Node(int key, String value) {
            this.key = key;
            this.value = value;

        }

        private int key;
        private String value;
        private Node left;
        private Node right;


        @Override
        public String toString() {
// key - 2 , value - Node 2 , left -1, right - 3
            return String.format("Key - %d, value - %s, left %d, right - %d.",
                    key, value,
                    left == null ? null : left.key,
                    right == null ? null : right.key);


        }
    }
}
