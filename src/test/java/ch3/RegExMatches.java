package ch3;

public class RegExMatches {
    public static void main(String[] args) {

        //αποκλειστική ισότητα
        boolean regExEquals = "Red".matches("Red");
        System.out.printf("%s", regExEquals ? "Matches" : "Not matches");

        System.out.println();

        //να ειναι ειτε Red ειτε Green
        boolean regExRedOrGreen = "Red".matches("Red|Green");
        System.out.printf("%s", regExRedOrGreen ? "Matches" : "Not matches");

        System.out.println();

        //Το πρώτο γραμμα ειτε κεφαλαίο ειτε πεζο
        boolean regExRedOrGreenFirstLetter = "red".matches("[Rr]ed|[Gg]reen");
        System.out.printf("%s", regExRedOrGreenFirstLetter ? "Matches" : "Not matches");

        System.out.println();

        //Το πρώτο γραμμα οποιοδηποτε κεφαλαιο και μετα εχει ing
        boolean regExRange = "Ring".matches("[A-Z]ing");
        System.out.printf("%s", regExRange ? "Matches" : "Not matches");

        System.out.println();

        //Το πρώτο γραμμα οποιοδηποτε γραμμα και μετα εχει ing
        boolean regExRange2 = "ring".matches("[A-Za-z]ing");
        System.out.printf("%s", regExRange2 ? "Matches" : "Not matches");

    }

}
