package placement.day7;

import java.util.ArrayList;
import java.util.Scanner;

class Queue {
    private ArrayList<Integer> queue;

    public Queue() {
        queue = new ArrayList<>();
    }

    public void inQueue(int a) {
        queue.add(a);
    }

    public int deQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty. Nothing to remove.");
            return -1;
        } else {
            return queue.remove(0);
        }
    }

    public void front() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element: " + queue.get(0));
        }
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();

        while (true) {
            System.out.println("Enter a character: \n" +
                    "x --> to add element \n" +
                    "y --> to remove element \n" +
                    "f --> to check front element \n" +
                    "e --> to check if queue is empty \n" );
            char ch = sc.next().charAt(0);

            switch (ch) {
                case 'x':
                    System.out.println("Enter an element to add:");
                    int a = sc.nextInt();
                    q.inQueue(a);
                    break;
                case 'y':
                    System.out.println("Removing front element:");
                    q.deQueue();
                    break;
                case 'f':
                    System.out.println("Front element:");
                    q.front();
                    break;
                case 'e':
                    System.out.println("Queue is empty: " + q.isEmpty());
                    break;
                case 'q':
                    System.out.println("Exiting...");
                    sc.close(); // Close the scanner
                    return; // Exit the loop and terminate the program
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
