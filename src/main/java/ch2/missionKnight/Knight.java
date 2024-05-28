package ch2.missionKnight;

public class Knight {
    private Mission mission;

    //mission is injected
    public Knight(Mission mission) {
        this.mission = mission;
    }

    public void embarkOnAMission(){
        mission.embark();
    }

    /*
    Ακολουθει μία υλοποιηση στην οποια η κλαση knight ειναι tightly coupled με την mission,
    γιατι δημιουρηειται κατα την εκτελεση της κλασης knight. αυτο την κανει not testable
    private SavePrincessMission savePrincessmission;

    public Knight(){
        this.savePrincessmission = new SavePrincessMission(System.out);
    }
    public void embarkOnAMission(){
        savePrincessmission.embark();
    }

     */
}
