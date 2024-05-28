package ch2.missionKnight;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;

/*
Θελουμε να ελεγξουμε την κλαση knight η οποια εχει ενα dependency. Ειναι προτιμοτερο σε αυυτο το dependancy
να βαλουμε μία parent class και οχι μία συγκεκρινενη υλοποιηση. Ετσι ο constractor δεχεται οποιοδηποτε
αντικειμενο τυπου mission(saveAPrincesMission, killADragonMission  η οποιοδηποτε άλλο δημιουργηθεί στο μέλλον.
Ετσι η κλαση ειναι loosly coupled οσο αφορα την κλαση mission, δεδομενου οτι δεν κανει new ενα συγκεκριμενο
mission αλλα του δίνεται inject και αρα είναι testable
 */
class KnightTest {

    @Test
    void knightShouldEmbarkOnAMission() {
        //η mock ειναι μια μέθοδος του Mockito που δημιουργεί μια τυχαία κλαση mission
        Mission mockMission = Mockito.mock(Mission.class);
        //δημιουργώ εναν νέο knight και περνάω μέσα το mockmission
        Knight knight = new Knight(mockMission);
        //καλώ την μέθοδο που θέλω να τεστάρω
        knight.embarkOnAMission();
        //διασφαλίζω οτι η μεθοδος embark κληθηκε ακριβως μια φορα κατα την εκτελεση της μεθοδου embarkOnAMission της κλασης knight
        Mockito.verify(mockMission, times(1)).embark();
    }
}