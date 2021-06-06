package ksk.tree.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ProblemSet1 {

    int getSumOfAllNodes(Node node) {
        if (node == null) return 0;
        return node.data + getSumOfAllNodes(node.left) + getSumOfAllNodes(node.right);
    }


    int getDiffOfValuesAtEvenAndOddLevel(Node node) {
        if (node == null) return 0;
        return node.data - getSumOfAllNodes(node.left) - getSumOfAllNodes(node.right);
    }

    int getTotalNumberOfNodes(Node node) {
        if (node == null) return 0;
        return 1 + getTotalNumberOfNodes(node.left) + getTotalNumberOfNodes(node.right);
    }

    int getTotalNumberOfLeafNodes(Node node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return getTotalNumberOfLeafNodes(node.left) + getTotalNumberOfLeafNodes(node.right);
    }

    int getHeightOfTree(Node node) {
        if (node == null) return -1;
        return max(getHeightOfTree(node.left), getHeightOfTree(node.right)) + 1;
    }

    private int max(int a, int b) {
        return a > b ? a : b;
    }

    void printAtGivenLevel(Node node, int level) {
        if (node == null) return;
        if (level == 1) {
            System.out.println(node.data + "");
            return;
        }
        printAtGivenLevel(node.left, level - 1);
        printAtGivenLevel(node.right, level - 1);

    }

    void printElementsInEachLevel(Node node) {
        if (node == null) return;
        int height = getHeightOfTree(node);
        for (int i = 0; i <= height; i++) {
            printAtGivenLevel(node, i + 1);
            System.out.println();
        }
    }

    void levelOrderTraversalUsingQueue(Node node) {
        if (node == null) return;
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(node);
        while (nodeQueue.size() > 0) {
            Node top = nodeQueue.remove();
            System.out.println(top.data + "");
            if (top.left != null) {
                nodeQueue.add(top.left);
            }
            if (top.right != null) {
                nodeQueue.add(top.right);
            }
        }
    }

    void reverseLevelOrderTraversalUsingRecursion(Node node) {

        if (node == null) return;
        int height = getHeightOfTree(node);
        for (int i = height; i >= 0; i--) {
            printAtGivenLevel(node, i + 1);
            System.out.println();
        }


    }

    void reverseLevelOrderTraversalUsingQueue(Node node) {
        if (node == null) return;
        Queue<Node> nodeQueue = new LinkedList<>();
        List<Integer> integerList = new ArrayList<>();
        nodeQueue.add(node);
        while (nodeQueue.size() > 0) {
            Node top = nodeQueue.remove();
            integerList.add(top.data);
            if (top.left != null) {
                nodeQueue.add(top.left);
            }
            if (top.right != null) {
                nodeQueue.add(top.right);
            }
        }

        for (int i = integerList.size() - 1; i >= 0; i--) {
            System.out.println(integerList.get(i));
        }
    }

    int maxLevel;

    void printLeftViewOfBinaryTree(Node node, int level) {
        if (node == null) return;
        System.out.println(node.data);

        if (level >= maxLevel) {
            System.out.println(node.data);
            maxLevel++;
        }

        printLeftViewOfBinaryTree(node.left, level + 1);
        printLeftViewOfBinaryTree(node.right, level + 1);
    }


}
