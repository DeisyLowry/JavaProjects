package com.dgl.linkedlist;


public class Main {

    public static void printItems(int n) {
        for(int i = 0; i < n; i++){
            System.out.println(1);
        }
        // WRITE THE FOR LOOP TO COMPLETE PRINTITEMS HERE //
        //                                                //
        //                                                //
        ////////////////////////////////////////////////////
    }
    // DO NOT CHANGE THE MAIN METHOD BELOW
    public static void main(String[] args) {
        printItems(10);
    }

}
        /*

        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1

            Linked List:
            4



    }

}





// THIS CODE GOES IN YOUR LINKEDLIST CLASS:
// ----------------------------------------

//package datastructures.linkedlist;


//public class LinkedList {

    // CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE //
    //                                                          //
    //                                                          //
    //                                                          //
    //                                                          //
    //////////////////////////////////////////////////////////////


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
*/

