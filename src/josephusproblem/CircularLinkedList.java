/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package josephusproblem;

/* Name: Le Cong Hung
Student Code: SE161248
Purpose: Problem II: Josephus Problem
*/
public class CircularLinkedList {

    Node head;

    CircularLinkedList() {
        this.head = null;
    }

    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }
// -------------------------------------------------------------
//                       Output Straight
// -------------------------------------------------------------
    void eliminate(int step) {
        Node current = head;
        while (current.next != current) {
            for (int i = 1; i < step; i++) {
                current = current.next;
            }
            System.out.println("Eliminating person #" + current.data);
            current.data = current.next.data;
            current.next = current.next.next;
        }
        System.out.println("The last person remaining is #" + current.data);
    } 
// -------------------------------------------------------------

// -------------------------------------------------------------
//                           Output Horizontal
// -------------------------------------------------------------    
//    void eliminate(int step) {
//        Node current = head;
//        StringBuilder eliminationOrder = new StringBuilder();
//
//        while (current.next != current) {
//            for (int i = 1; i < step; i++) {
//                current = current.next;
//            }
//            eliminationOrder.append(current.data).append(" ");
//            current.data = current.next.data;
//            current.next = current.next.next;
//        }
//
//        System.out.println("Elimination Order: " + eliminationOrder.toString().trim());
//        System.out.println("The last person remaining is #" + current.data);
//    }
//// -------------------------------------------------------------    
}
