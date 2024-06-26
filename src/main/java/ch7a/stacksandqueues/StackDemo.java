package ch7a.stacksandqueues;

import java.util.Deque;
import java.util.LinkedList;

public class StackDemo {
    public static void main(String[] args) {
        Deque<Contact> stack = new LinkedList<>();
        int head = 1;

        do {
            stack.push(new Contact(String.format("%s", head++)));
        }while (head != 10);


        head = 1;
        do {
            Contact contact = stack.pop();
            System.out.println(contact);
            head++;
        } while (head != 10);
    }
}
