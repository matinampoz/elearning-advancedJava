package ch3;
/*
. οποιοσδηποτε χαρακτήρας
^ αρχη string/line, οταν ειναι μεσα σε [] ειναι αρνηση, οταν ειναι εξω ειναι αρχη string
$ τέλος string
\w [a-zA-Z0-9_]
\W [^a-zA-Z0-9_] ^:αρνηση
\s [\t\r\n\f]
\S [^\t\r\n\f]
\d [0-9]
\D [^0-9]
\b word boundaries
\. .
 */

public class RegExShorthand {
    public static void main(String[] args) {

        //ξεκιναει οποιοδηποτε χαρακτήρα, ακολουθεί κενο και μετα ψηφίο
        boolean isAnyCharSpaceDigit = "@ 4".matches(".\\s\\d");
        System.out.printf("%s\n", isAnyCharSpaceDigit ? "Matches" : "Not matches");

        //ξεκιναει απο γραμμα ακολουθεί ψηφίο
        boolean isLetterDigit = "l2".matches("[a-zA-Z]\\d");
        System.out.printf("%s\n", isLetterDigit ? "Matches" : "Not matches");

        //πάλι γραμμα και ψηφίο αλλα πριν και μετα μπορει να υπαρχουν αλλοι χαρακτηρες
        boolean isLettetDigitAnywhere = "is l2true".matches(".*[A-Za-z]\\d.*");
        System.out.printf("%s\n", isLettetDigitAnywhere ? "Matches" : "Not matches");

        //πάλι γραμμα και ψηφίο και πριν και μετα μπορει να υπαρχουν αλλοι χαρακτηρες
        //αλλα να υπαρχουν word boundaries αναμεσα σε αλλους χαρακτηρες και γραμμα-ψηφιο
        boolean isLetterDigitAsWholeWord = "is l2 true".matches(".*\\b[A-Za-z]\\d\\b.*");
        System.out.printf("%s\n", isLetterDigitAsWholeWord ? "Matches" : "Not matches");

    }
}
