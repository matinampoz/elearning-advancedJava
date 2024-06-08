package ch4.theater;

import java.util.Scanner;

public class TheaterDemo {

    private static Theater theater = new Theater("Acropolis", 10, 12);
    private static Scanner in = new Scanner(System.in); //εφοσον η main ειναι static μπορει να καλει μόνο static μεθοδους και μεταβλητες

    public static void main(String[] args) {

        boolean exit = false;
        int choice;

        do {
            showMenu();
            String response = in.nextLine();
            if (response.matches("\\d")) {
                choice = Integer.parseInt(response);
            } else {
                System.out.println("Wrong choice");
                continue;
            }

            switch (choice) {
                case 1:
                    manageReservation();
                    break;
                case 2:
                    manageCancellation();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Please give choice 1, 2 or 3");
            }
        } while (!exit);
        System.out.println("Adios");
    }

    public static void showMenu() {
        System.out.println("Give your choice");
        System.out.println("1. Reserve seat");
        System.out.println("2. Cancel seat");
        System.out.println("3. Exit");
    }

    public static void manageReservation(){
        try{
            System.out.println("Give seat number");
            String response = in.nextLine();
        /*
        ο ελεγχος αν ειναι σωστο το response θα γινει στο reserveSeat().
        εδω φτιαχνουμε εναν ενδιαμεσο (controller). Απο την μια μερια θα επικοινωνει με τον χρήστη και από την αλλη θα
        καλει τις αντιστοιχες μεθοδους. Δεν εχει λογική ο controller απλα αλληλεπιδρα με τον χρηστη, λαμβανει δεδομενα
        και καλει μεθοδους. Τo Theater που ειναι ενα business object εχει την λογική
         */
            System.out.printf("%s Registration\n", theater.reserveSeat(response) ? "Successful" : "Unsuccessful");
        } catch (IsReservedException e) {
            System.out.println("Seat is already reserved");
        } finally {
            theater.printSeats();
        }

    }

    public static void manageCancellation() {
        try {
            System.out.println("Give seat number");
            String response = in.nextLine();
            System.out.printf("%s Cancellation\n", theater.cancelReservation(response) ? "Successful" : "Unsuccessful");
        } catch (IsNotReservedException e) {
            System.out.println("Seat is not reserved");
        } finally {
            theater.printSeats();
        }
    }
}
