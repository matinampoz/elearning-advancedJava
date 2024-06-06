package ch4;

public class Theater {

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
            if (isReserved()){
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
