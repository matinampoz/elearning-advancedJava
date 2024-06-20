package ch7.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Traverse {
    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("Alice"));
        contacts.add(new Contact("David"));
        contacts.add(new Contact("Bob"));
        contacts.add(new Contact("Chris"));

        System.out.println("εκτυπωση με χρηση collection");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(contacts.get(i));
            //με την get κανω προσπελαση το στοιχειο i
        }

        System.out.println();

        // o iterrator ειναι ενασ δεικτης που δεχνει στα στοιχεια της λιστας. πραξεις οπως η διαγραφη γινεται μόνο με την χρήση iterator
        //με την μεθοδο iterator() τον αρχικοποιω ωστε να δειχνει στο πρωτο στοιχειο της συλλογης
        Iterator<Contact> it = contacts.iterator();
        System.out.println("εκτυπωση με χρήση iterator");
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();

        //διαγραφη με χρηση iterator
        Iterator<Contact> it2 = contacts.iterator();
        while (it2.hasNext()){
            Contact contact = it2.next();
            if (contact.getName().equals("Alice")){
                it2.remove();
            }
        }

        Iterator<Contact> it3 = contacts.iterator();
        System.out.println("2η εκτυπωση με χρηση  iterator - αφου εχει γινει η διαγραφη της alice");
        while (it3.hasNext()){
            System.out.println(it3.next());
        }

        System.out.println();

        System.out.println("3η εκτυπωση με χρηση enchaned for");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }

        System.out.println();

        System.out.println("4η εκτυπωση με χρηση for each");
        contacts.forEach((Contact contact) -> System.out.println(contact));

        System.out.println();

        System.out.println("5η εκτυπωση με χρηση for each πιο απλα γραμμενο");
        contacts.forEach(System.out::println);
    }


}
