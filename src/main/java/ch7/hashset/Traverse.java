package ch7.hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Traverse {
    public static void main(String[] args) {
        Set<Contact> contacts = new TreeSet<>();

        contacts.add(new Contact("Alice"));
        contacts.add(new Contact("David"));
        contacts.add(new Contact("Bob"));
        contacts.add(new Contact("Chris"));

        contacts.forEach(System.out::println);
    }
}
