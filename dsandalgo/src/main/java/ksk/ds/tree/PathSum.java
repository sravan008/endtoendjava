package ksk.ds.tree;

public class PathSum {


    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) {
            return false;
        }
        int currentSum = 0;
        TreeNode currentNode = root;
        while (true) {
            currentSum += currentNode.getData();
            if (currentSum == targetSum) {
                return true;
            } else if (currentNode.getLeft() != null) {
                currentNode = currentNode.getLeft();

            } else if (currentNode.getRight() != null) {
                currentNode = currentNode.getRight();
            } else {
                return false;
            }
        }
    }


    public static void main(String[] args) {



    }


}




