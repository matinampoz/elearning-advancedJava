package ch4.theater;

public class Theater implements ITheater{

    private String theaterName;
    private int rows;
    private int seatsPerRow;
    private Seat[][] seats;

    public Theater(String theaterName, int rows, int seatsPerRow) {
        this.theaterName = theaterName;
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;
        seats = new Seat[rows][seatsPerRow];

        final char ALPHA = 'A';
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < seatsPerRow; j++){

                Seat seat = new Seat(String.format("%c%02d", (char) (i + ALPHA), j + 1));
                seats[i][j] = seat;
            }
        }
    }

    public String getTheaterName() {
        return theaterName;
    }

    /**
     *
     * @param seatNumber ο αριθμος θέσης σε μορφη κεφαλαιο γραμμα ακολουθουμενο απο 2 ψηφια
     * @return true αν γίνει το reservation, αλλιως false
     * @throws IsReservedException αν η θέση ειναι ηδη reserved
     */
    @Override
    public boolean reserveSeat(String seatNumber) throws IsReservedException {
        int row, column;
        if (seatNumber != null && seatNumber.matches("[A-Z]{1}\\d{2}")){
            row = seatNumber.charAt(0) - 'A';
            column = Integer.parseInt(seatNumber.substring(1));


        }else {
            System.out.println("Wrong seat number");
            return false;
        }
        return ((row >= 0 && row < this.rows) && (column >= 1 && column <= seatsPerRow)) &&
                (seats[row][column - 1].reserve());
    }

    /**
     *
     * @param seatNumber ο αριθμος θέσης σε μορφη κεφαλαιο γραμμα ακολουθουμενο απο 2 ψηφια
     * @return true αν γίνει το cancel, αλλιως false
     * @throws IsReservedException αν η θέση ειναι ηδη non reserved
     */
    @Override
    public boolean cancelReservation(String seatNumber) throws IsNotReservedException {
        int row, column;
        if (seatNumber != null && seatNumber.matches("[A-Z]{1}\\d{2}")){
            row = seatNumber.charAt(0) -'A';
            column = Integer.parseInt(seatNumber.substring(1));
        }else {
            System.out.println("Wrong seat number");
            return false;
        }
        return ((row >= 0 && row < this.rows) && (column >= 1 && column <= seatsPerRow)) &&
                (seats[row][column - 1].cancel());
    }

    /**
     * εκτυπωνει τα seatNumbers και -R αν η θεση ειναι reserved  η -NR αν δεν ειναι
     */
    @Override
    public void printSeats() {
        System.out.println(this.getTheaterName().toUpperCase());
        for (Seat[] row : seats) {
            for (Seat column : row){
                System.out.printf("%s%s", column.getSeatNumber(),
                        column.isReserved() ? "-R  " : "-NR  ");
            }
            System.out.println();
    }


}



    private static class Seat implements ISeat{
        /*
         H Seat έχει σχεση composition με το Theater για αυτό την δημιουργώ ως inner class
         */
        private String seatNumber;
        private boolean reserved;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
            //το JVM αρχικοποιει by default το reserved σε false
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public void setSeatNumber(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean isReserved() {
            return reserved;
        }

        public void setReserved(boolean reserved) {
            this.reserved = reserved;
        }


        @Override
        public boolean reserve() throws IsReservedException {
            if (!isReserved()){
                setReserved(true);
                return true;
            }else{
                throw new IsReservedException();
            }
        }

        @Override
        public boolean cancel() throws IsNotReservedException {
            if (isReserved()){
                setReserved(false);
                return true;
            }else{
                throw new IsNotReservedException();
            }
        }
    }

}
