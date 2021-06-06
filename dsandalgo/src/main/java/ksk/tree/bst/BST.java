package ksk.tree.bst;


import java.util.Arrays;

class Node {
    Node left;
    Node right;
    int data;
}

class BST {

    public Node insert(Node node, int val) {
        if (node == null) {
            return createNewNode(val);
        }

        if (val < node.data) {
            node.left = insert(node.left, val);
        } else if ((val > node.data)) {
            node.right = insert(node.right, val);
        }

        return node;
    }

    public Node createNewNode(int k) {
        Node a = new Node();
        a.data = k;
        a.left = null;
        a.right = null;
        return a;
    }

    //Case 1: Deleting a node with no children: remove the node from the tree.
    //Case 2: Deleting a node with two children: call the node to be deleted N . Do not delete N . ...
    //Case 3: Deleting a node with one child: remove the node and replace it with its child.
    public Node delete(Node node, int val) {
        if (node == null) {
            return node;
        }

        if (val < node.data) {
            node.left = delete(node.left, val);
        } else if (val > node.data) {
            node.right = delete(node.right, val);
        } else {
            if (node.left == null || node.right == null) {
                Node temp = node.left != null ? node.left : node.right;

                if (temp == null) {
                    return null;
                } else {
                    return temp;
                }
            } else {
                Node successor = getSuccessor(node);
                node.data = successor.data;

                node.right = delete(node.right, successor.data);
                return node;
            }
        }

        return node;
    }


    boolean findValue(Node node, int val) {

        if (node == null) return false;
        while (node != null) {
            if (val < node.data) {
                node = node.left;
            } else if (val > node.data) {
                node = node.right;
            } else
                return true;
        }
        return false;
    }

    public Node getSuccessor(Node node) {
        if (node == null) {
            return null;
        }
        Node temp = node.right;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }

    Node getPredecessor(Node node) {
        if (node == null) return null;

        Node currentNode = node.left;

        while (currentNode.right != null) {
            currentNode = currentNode.right;
        }
        return currentNode;
    }


    Node printParentNode(Node node, int val) {
        if (node == null) return null;

        Node previousNode = node;
        if (val < node.data) {
            if (val == node.left.data) {
                return previousNode;
            } else
                return printParentNode(node.left, val);
        } else if (val > node.data) {
            if (val == node.right.data) {
                return previousNode;
            } else
                return printParentNode(node.right, val);
        }
        return null;
    }


    Node findSiblingNode(Node node, int val) {
        if (node == null) return null;

        Node previousNode = node;
        if (val < node.data) {
            if (val == node.left.data) {
                return previousNode.right != null ? previousNode.right : null;
            } else
                return findSiblingNode(node.left, val);
        } else if (val > node.data) {
            if (val == node.right.data) {
                return previousNode.left != null ? previousNode.left : null;
            } else
                return findSiblingNode(node.right, val);
        }
        return null;
    }

    // Only store the left node values, it is not required to store the right node values because
    //   right side values are greater than it's left side values
    Node inOrderParent(Node node, int val) {
        if (node == null) return null;
        Node inOrderParent = node;

        while (node != null) {
            if (val < node.data) {
                inOrderParent = node;
                node = node.left;
            } else if (val > node.data) {
                node = node.right;
            } else {
                break;
            }

        }
        return node != null ? inOrderParent : null;
    }

    Node getInOrderSuccessor(Node node, int val) {
        if (node == null) return null;
        Node inOrderSuccessor = node;

        while (node != null) {
            if (val < node.data) {
                inOrderSuccessor = node;
                node = node.left;
            } else if (val > node.data) {
                node = node.right;
            } else {
                if (node.right != null) {
                    inOrderSuccessor = getSuccessor(node);
                }
                break;
            }

        }
        return node != null ? inOrderSuccessor : null;
    }

    Node getInOrderPredecessor(Node node, int val) {
        if (node == null) return null;
        Node inOrderPredecessor = node;

        while (node != null) {
            if (val < node.data) {
                inOrderPredecessor = node;
                node = node.left;
            } else if (val > node.data) {
                node = node.right;
            } else {
                if (node.left != null) {
                    inOrderPredecessor = getPredecessor(node);
                }
                break;
            }

        }
        return node != null ? inOrderPredecessor : null;
    }

    int evenOrOddLevels(Node node, String ss) {

        if (node != null) System.out.println(node.data + "--" + ss);
        if (node == null) {
            return 0;
        }
        return node.data - evenOrOddLevels(node.left, "left") - evenOrOddLevels(node.right, "right");
    }

    Node findLowestCommonAncestor(Node node, int val1, int val2) {
        if (node == null) return null;
        while (node != null) {
            if (val1 < node.data && val2 < node.data) {
                node = node.left;
            } else if (val1 > node.data && val2 > node.data) {
                node = node.right;
            } else {
                break;
            }
        }
        return node;
    }

    //Check if the given tree is BST or not ->> do the inorder meaning sort it ascending order and check every element is greater than it's previous

    //Construct Balanced BST from the keys

    Node constructBSTFromGivenValues(int[] array) {
        if (array.length <= 0) return null;
        Arrays.sort(array);
        return constructBST(array,  0, array.length);
    }

    Node constructBST(int[] array, int start, int end) {

        if (start > end) return null;
        int mid = (start + end) / 2;
        Node node = createNewNode(mid);
        node.left = constructBST(array, start, mid - 1);
        node.right = constructBST(array, mid + 1, end);
        return node;
    }

//    getFloorandCeiling(Node node){
//
//    }
//
//
//    boolean isBalanced(Node node){
//
//
//
//
//    }



}

class BSTApp {

    public static void main(String[] args) {
        BST a = new BST();
        Node root = null;

        root = a.insert(root, 8);
        root = a.insert(root, 3);
        root = a.insert(root, 6);
        root = a.insert(root, 10);
        root = a.insert(root, 4);
        root = a.insert(root, 7);
        root = a.insert(root, 1);
        root = a.insert(root, 14);
        root = a.insert(root, 13);

        //root = a.delete(root, 1);

        //System.out.println(a.findValue(root, 17));
        //Node temp = a.printParentNode(root, 13);
        //System.out.println(temp.data);

        Node temp = a.findSiblingNode(root, 3);
        System.out.println(temp.data);
        //Node temp = a.inOrderParent(root, 7);
        //System.out.println(temp.data);

        //Node temp = a.getInOrderSuccessor(root, 6);
        // Node temp = a.getInOrderPredecessor(root, 6);
        // System.out.println(temp.data);
        // System.out.println(a.evenOrOddLevels(root,""));

    }

}