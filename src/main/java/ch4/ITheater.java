package ch4;
/*
Ορίζει μεθοδους που παρεχουν λειτουργικότητα στην κλαση Theater
 Οι μέθοδοι που βρίσκονται σε ενα interface ειναι by default public και abstract
 */
public interface ITheater {
    boolean reserveSeat(String SeatNumber) throws IsReservedException;
    boolean cancelReservation(String seatNumber) throws IsNotReservedException;
}
