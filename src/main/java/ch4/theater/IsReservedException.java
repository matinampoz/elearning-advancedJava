package ch4.theater;

/*
 User defined εξαιρεση
 Χρησιμοποιειται στην περιπτωση που η θεση ειναι κατειλειμενη οταν γινεται η μεθοδος reserved
 */
public class IsReservedException extends Exception{

    /*public IsReservedException(){
        super();
        /*
        καλει τον constructor της parent class δηλαδη της exception
        Η super δεν χρειαζεται να γραφει γιατι η Java ουτως η αλλως σε μία ιεραρχία κληρονομικότητας οταν
        μια κλαση οπως η IsReservedException κληρονομει από μία άλλη κλαση, ο constructor ακόμα και αν δεν δώσουμε
        το super αυτόματα το JVM καλει τον constructor της parent class
        Επίσης εφόσον η Java παρεχει default constructor αν δεν έχω κανένα, τοτε μπορω να μην βάλω κανενα

    }

    public IsReservedException(String s){
        super(s);
        //ετσι μπορω να περναω μηνυμα, οχι απαραιτητο
    }
    */
}
