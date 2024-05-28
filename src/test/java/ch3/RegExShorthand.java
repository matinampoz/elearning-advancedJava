package ch3;
/*
. οποιοσδηποτε χαρακτήρας
^ αρχη string/line
$ τέλος string
\w [a-zA-Z0-9_]
\W [^a-zA-Z0-9_] ^:αρνηση
\s [\t\r\n\f]
\S [^\t\r\n\f]
\d [0-9]
\D [^0-9]
 */

public class RegExShorthand {
    public static void main(String[] args) {

        //ξεκιναει οποιοδηποτε χαρακτήρα, ακολουθεί κενο και μετα ψηφίο
        boolean isAnyCharSpaceDigit = "@ 4".matches(".\\s\\d");
        System.out.printf("%s\n", isAnyCharSpaceDigit ? "Matches" : "Not matches");

        //ξεκιναει απο γραμμα ακολουθεί ψηφίο
        boolean isLetterDigit = "h7".matches("[a-zA-Z]\\d");
        System.out.printf("%s\n", isLetterDigit ? "Matches" : "Not matches");

    }
}
