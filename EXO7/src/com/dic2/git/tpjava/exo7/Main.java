package com.dic2.git.tpjava.exo7;

public class Main {

    public static void main(String[] args) {

        Search tree = new Search();

        char value='a';
        for(int i = 0; i<= 10; i++ ){
            tree.insert(value);
            value+=1;

        }

        System.out.println("Tri PréFixe");
        tree.traversse1();
        System.out.println();
        System.out.println("Trie Infixe");
        tree.traverse2();
        System.out.println();
        System.out.println("Tri Postfixe");
        tree.traverse3();
        System.out.println();
        System.out.println(" le nombre de noeuds à gauche: "+tree.rightCompteur);

    }

}
