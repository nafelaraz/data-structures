package trees;

import java.util.LinkedList;
import java.util.Queue;

public class Node {

    private int data;

    private Node left, right;

    public Node(int data) {
        this.data = data;
    }

    public void insert(Node node) {
        if (node.getData() <= data) {
            if (left == null) {
                this.left = node;
            } else {
                this.left.insert(node);
            }
        } else {
            if (right == null) {
                this.right = node;
            } else {
                this.right.insert(node);
            }
        }
    }

    public boolean contains(Node node) {
        if (this.data == node.getData()) {
            return true;
        } else if (node.getData() < this.data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(node);

            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(node);
            }
        }
    }

    public void printLevelOrder() {

        Queue<Node> queue = new LinkedList<>();
        queue.add(this);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.println(temp.getData());
            if(temp.getLeft() != null){
                queue.add(temp.getLeft());
            }
            if(temp.getRight()!=null){
                queue.add(temp.getRight());
            }

        }
    }

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(data);
        if (right != null) {
            right.printInOrder();
        }
    }

    public void printPreOrder() {
        System.out.println(data);

        if (left != null) {
            left.printPreOrder();
        }
        if (right != null) {
            right.printPreOrder();
        }
    }

    public void printPostOrder() {
        if (left != null) {
            left.printPostOrder();
        }
        if (right != null) {
            right.printPostOrder();
        }
        System.out.println(data);

    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
