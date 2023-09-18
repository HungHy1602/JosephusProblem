/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package josephusproblem;

import java.util.Scanner;

/* Name: Le Cong Hung
Student Code: SE161248
Purpose: Problem II: Josephus Problem
*/
public class JosephusProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people in the circle: ");
        int numPeople = scanner.nextInt();

        System.out.print("Enter the number used for counting off: ");
        int step = scanner.nextInt();

        System.out.print("Enter the number of the person where counting starts: ");
        int start = scanner.nextInt();

        CircularLinkedList circle = new CircularLinkedList();
        for (int i = 1; i <= numPeople; i++) {
            circle.append(i);
        }

        Node current = circle.head;
        while (current.data != start) {
            current = current.next;
        }

        circle.eliminate(step);

        scanner.close();
    }
}
