package ch3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherCapturingGroups {
    public static void main(String[] args) {

        String s = "login:matina;pass:123456;";

        //θελω να κανω match μεχρι να βρω το τελευταιο ;, greedy pattern
        Pattern patternGreedy = Pattern.compile(".*;"); //οπσδ χαρακτηρας 0+ φορες, ακολουθούμενος από ;
        Matcher matcher = patternGreedy.matcher(s); //ετσι η matcher βρισκει και αποθηκευει τα patterns που βρισκονται στο string
        //εκτυπωση των patterns, η find επιστρεφει οσο βρίσκει patterns τα οποια εχουν γινει match
        while (matcher.find()){
            System.out.println(matcher.group()); //group: ολο το match που εχει γίνει
        }

        System.out.println("==================================================================================");


        //θελω να κανω match μεχρι να βρω ; , not greedy, but reluctant pattern
        Pattern patternNotGreedy = Pattern.compile(".*?;"); //οπσδ χαρακτηρας 0+ φορες, ακολουθούμενος από ; μεχρι το 1ο ;
        Matcher matcher2 = patternNotGreedy.matcher(s); //ετσι η matcher βρισκει και αποθηκευει τα patterns που βρισκονται στο string
        //εκτυπωση των patterns, η find επιστρεφει οσο βρίσκει patterns τα οποια εχουν γινει match
        while (matcher2.find()){
            System.out.println(matcher2.group()); //group: ολο το match που εχει γίνει
        }


        System.out.println("==================================================================================");


        String s2 = "B31:F45:D55:";

        //θέλω να βρω εκεινα τα patterns στο s2, τα οποια ξεκιναν με κεφαλαιο φτανουν μεχρι την 1η : (reluctant), αλλα ξεκιναν και από την αρχή του string
        Pattern patternStartOfString = Pattern.compile("^[A-Z].*?:");
        Matcher matcher3 = patternStartOfString.matcher(s2);
        while (matcher3.find()){
            System.out.println(matcher3.group()); //group: ολο το match που εχει γίνει
        }

        System.out.println("==================================================================================");


        //θελω να πάρω την αφαίρεση 2 συνόλων
        String s3 = "A31:D45:X55:H78:";
        Pattern patternNegation = Pattern.compile("[A-Z&&[^ADX]].*?:"); //παιρνω τα patterns που ξεκινουν με κεφαλαιο ΚΑΙ δεν ξεκινουν απο A, D, X κ.τ.λ.
        Matcher matcher4 = patternNegation.matcher(s3);
        while (matcher4.find()){
            System.out.println(matcher4.group());
        }


        System.out.println("==================================================================================");



        //θελω να πάρω την τομή 2 συνόλων
        Pattern patternIntersection = Pattern.compile("[A-Z&&[ADX]].*?:"); //παιρνω τα patterns που ξεκινουν με κεφαλαιο ΚΑΙ ξεκινουν απο A, D, X κ.τ.λ.
        Matcher matcher5 = patternIntersection.matcher(s3);
        while (matcher5.find()){
            System.out.println(matcher5.group());
        }

        System.out.println("==================================================================================");

        //θελω να πάρω την τομή 2 συνόλων
        Pattern patternUnion = Pattern.compile("[A-C[M-Z]].*?:"); //παιρνω τα patterns που ξεκινουν με κεφαλαιο ΚΑΙ ξεκινουν απο A, D, X κ.τ.λ.
        Matcher matcher6 = patternUnion.matcher(s3);
        while (matcher6.find()){
            System.out.println(matcher6.group());
        }

        System.out.println("==================================================================================");

        String s4 = "12/31/2000";

        Pattern patternDate = Pattern.compile("(\\d{2}/\\d{2}/\\d{4})");
        Matcher matcher7 = patternDate.matcher(s4);


    }

}
