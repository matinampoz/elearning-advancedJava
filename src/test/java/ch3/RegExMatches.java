package ch3;

public class RegExMatches {
    public static void main(String[] args) {

        //αποκλειστική ισότητα
        boolean regExEquals = "Red".matches("Red");
        System.out.printf("%s/n", regExEquals ? "Matches" : "Not matches");

        //να ειναι ειτε Red ειτε Green
        boolean regExRedOrGreen = "Red".matches("Red|Green");
        System.out.printf("%s/n", regExRedOrGreen ? "Matches" : "Not matches");

        //Το πρώτο γραμμα ειτε κεφαλαίο ειτε πεζο
        boolean regExRedOrGreenFirstLetter = "red".matches("[Rr]ed|[Gg]reen");
        System.out.printf("%s/n", regExRedOrGreenFirstLetter ? "Matches" : "Not matches");

        //Το πρώτο γραμμα οποιοδηποτε κεφαλαιο και μετα εχει ing
        boolean regExRange = "Ring".matches("[A-Z]ing");
        System.out.printf("%s/n", regExRange ? "Matches" : "Not matches");

        //Το πρώτο γραμμα οποιοδηποτε γραμμα και μετα εχει ing
        boolean regExRange2 = "ring".matches("[A-Za-z]ing");
        System.out.printf("%s/n", regExRange2 ? "Matches" : "Not matches");

    }

}
