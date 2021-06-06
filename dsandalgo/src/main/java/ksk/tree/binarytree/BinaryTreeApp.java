package ksk.tree.binarytree;


class BinaryTree {
    public Node createNewNode(int value) {
        Node newNode = new Node();
        newNode.left = null;
        newNode.right = null;
        newNode.data = value;
        return newNode;
    }
}


public class BinaryTreeApp {

    public static void main(String[] args) {
        BinaryTree a = new BinaryTree();
        Node root = a.createNewNode(2);
        root.left = a.createNewNode(7);
        root.right = a.createNewNode(5);
        root.left.left = a.createNewNode(2);
        root.left.right = a.createNewNode(6);
        root.left.right.left = a.createNewNode(5);
        root.left.right.right = a.createNewNode(11);
        root.right.right = a.createNewNode(9);
        root.right.right.left = a.createNewNode(4);

        ProblemSet1 sumOfAllNodes = new ProblemSet1();

        //System.out.println(sumOfAllNodes.getSumOfAllNodes(root));
        //System.out.println(sumOfAllNodes.getTotalNumberOfNodes(root));
        // System.out.println(sumOfAllNodes.getTotalNumberOfLeafNodes(root));
        // sumOfAllNodes.printAtGivenLevel(root, 2);
        //System.out.println(sumOfAllNodes.getHeightOfTree(root));
        //sumOfAllNodes.printElementsInEachLevel(root);
        //sumOfAllNodes.levelOrderTraversalUsingQueue(root);
        //sumOfAllNodes.reverseLevelOrderTraversalUsingQueue(root);
        sumOfAllNodes.reverseLevelOrderTraversalUsingRecursion(root);


    }


}
