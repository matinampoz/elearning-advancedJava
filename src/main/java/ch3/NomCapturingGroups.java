package ch3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Μόνο ελεγχω την υπαρξη ενος pattern χψρις να το καταναλώσω. απλως να δω αν υπάρχει ή οχι. Στα non capturing groups δεν μπορω να αναφερθω με back reference
 */

public class NomCapturingGroups {
    public static void main(String[] args) {


        String s = "HalloWorld HalloWorldWorld";


        //capturing patterns
        Pattern pattern = Pattern.compile("(Hallo)(World)+");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){
            for (int i = 1; i <= matcher.groupCount(); i++ ) {
                //το grouCount δινει ποσα groups υπαρχουν σε καθε match
                System.out.print(matcher.group(i) + " "); //μου δινει χωρια το κάθε group
            }
            System.out.println();
        }

        System.out.println("==================================================================================");


        //non capturing groups. λειτουργουν ως zero length assertions, δηλαδή μας διαβεβαιώνουν ότι υπάρχει αλλα αυτο που επιστρεφεται είναι zero lengh
        //κανουν match αλλα δεν καταναλώνουν τους χαρακτηρες
        //θελω το world να υπάρχει μέσα στο pattern αλλα να μην αποδιδεται - αποθηκευεται
        Pattern pattern2 = Pattern.compile("(Hallo)(?:World)+");
        Matcher matcher2 = pattern2.matcher(s);

        while (matcher2.find()){
            for (int i = 1; i <= matcher2.groupCount(); i++ ) {
                //το groupCount δινει ποσα groups υπαρχουν σε καθε match
                System.out.print(matcher2.group(i) + " "); //μου δινει χωρια το κάθε group
            }
            System.out.println();
        }


        System.out.println("==================================================================================");


        //Αν θέλουμε να δηλώσουμε ότι ένα regex ακολουθείται από ένα non-capturing group χρησιμοποιούμε το ?=
        Pattern pattern3 = Pattern.compile("(Hallo)(?=World)+");
        Matcher matcher3 = pattern2.matcher(s);

        while (matcher3.find()){
            for (int i = 1; i <= matcher3.groupCount(); i++ ) {
                //το groupCount δινει ποσα groups υπαρχουν σε καθε match
                System.out.print(matcher3.group(i) + " "); //μου δινει χωρια το κάθε group
            }
            System.out.println();
        }
    }

}
