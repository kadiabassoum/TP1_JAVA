package com.dic2.git.tpjava.exo7;

public class Search {

    public class Node {
        public char data;
        public Node left;
        public Node right;

        public Node(char data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // instance variable
    public Node root;

    // constructor pour initialiser le noeud root à null par défaut
    public Search() {
        this.root = null;
    }

    // méthode d'insertion
    public void insert(char newData) {
        this.root = insert(root, newData);
    }

    int rightCompteur = 0;

    int getRightCompteur(){
        return rightCompteur;
    }

    public Node insert(Node root, char newData) {

        // Base Case: root is null or not
        if (root == null) {
            // Insertion si root n'est pas null
            root = new Node(newData);

            return root;
        }

        // Here checking for root data is greater or equal to newData or not
        else if (root.data >= newData) {
            // if current root data is greater than the new data then now process the left sub-tree
            root.left = insert(root.left, newData);
        } else {
            // if current root data is less than the new data then now process the right sub-tree
            root.right = insert(root.right, newData);
            rightCompteur=+1;
        }

        return root;
    }


    //Traversal with préfixe
    public void traversse1() {
        traversse1(root);
    }

    public void traversse1(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        traversse1(root.left);
        traversse1(root.right);
    }

    //Traversal with Inorder
    public void traverse2() {
        traverse2(root);
    }

    public void traverse2(Node root) {
        if (root == null) {
            return;
        }
        /* first recur on left child */
        traverse2(root.left);

        /* then print the data of node */
        System.out.print(root.data + " ");

        /* now recur on right child */
        traverse2(root.right);
    }

    //Traversal with Inorder
    public void traverse3() {
        traverse3(root);
    }

    public void traverse3(Node root) {
        if (root == null) {
            return;
        }
        /// first recur on left subtree
        traverse3(root.left);

        // then recur on right subtree
        traverse3(root.right);

        // now deal with the node
        System.out.print(root.data + " ");
    }
}
