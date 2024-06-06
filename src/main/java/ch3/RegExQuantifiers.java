package ch3;

/**
 * ? 0 ή 1 εμφανισεις
 * + 1 η περισσοτερες εμφανίσεις
 * * 0 η περισσοτερες εμφανίσεις
 * {n} n εμφανίσεις
 * {n, m} μεταξύ n και m εμφανίσεις
 * {n, } τουλαχιστον n εμφανίσεις
 * {, m} όχι περισσοτερους από m χαρακτήρες
 */

public class RegExQuantifiers {
    public static void main(String[] args) {

        /*
        έγκυρη διευθυνση email
        xxx.yyy@zzz.com
        xxx.yyy@zzz.gr
        yyy@zzz.com
        yyy@zzz.gr
         */
        boolean isValidEmail = "matinampoz@gmail.com".matches("\\w*\\.?\\w+@\\w+\\.(com|gr)");
        System.out.printf("%s\n", isValidEmail ? "Matches" : "Not matches");


        //Δύο κεφαλαια γραμματα ακολουθούμενα από παυλα ακολουθούμενα από 7 αριθμους
        boolean is2CapitalsDash7Digits = "AB-1234567".matches("[A-Z]{2}-\\d{7}");
        System.out.printf("%s\n", is2CapitalsDash7Digits ? "Matches" : "Not matches");

        //θελω να εισαγω σε εναν πίνακα από strings το αποτελεσμα μιας split που θα διαχωρίσει το αλφαριθμητικο όπου υπάρχουν κενά
        String[] tokens = "Java     Advanced  Level".split("\\s+");
        for (String token : tokens){
            System.out.println(token);
        }

        //θέλω να αντικαταστήσω 1 η περισσ'οτερα κενά με 1 κενό
        String s1 = "Java     Advanced  Level".replaceAll("\\s+", " ");
        System.out.println(s1);

        //Αμοιβαία ανταλλαγη μεταξυ 2 string
        String s2 = "Bozardeni Matina".replaceAll("(.*)\\s+(.*)", "$2 $1");
        System.out.println(s2);
    }
}
