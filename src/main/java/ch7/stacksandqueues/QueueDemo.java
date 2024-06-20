package ch7.stacksandqueues;

import java.util.Deque;
import java.util.LinkedList;

public class QueueDemo {
    public static void main(String[] args) {
        Deque<Contact> queue = new LinkedList<>();
        int head = 1;

        do {
            queue.addLast(new Contact(String.format("%s", head++)));
        }while (head != 10);


        head = 1;
        do {
            Contact contact = queue.poll();
            System.out.println(contact);
            head++;
        } while (head != 10);
    }
}
