/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse.linkedlist;

import java.util.LinkedList;

/**
 *
 * @author kimde
 */
public class ReverseLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> vowels = new LinkedList<String>();
        vowels.add("A");
        vowels.add("E");
        vowels.add("I");
        vowels.add("O");
        vowels.add("U");

        int listsize = vowels.size();
        int looplistsize = vowels.size();

        for (int i = 0; i <= listsize - 1; i++) {
            System.out.println(vowels.toArray()[looplistsize - 1]);
            looplistsize = looplistsize - 1;
        }

    }

}
