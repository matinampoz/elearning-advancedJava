package ch4;

public interface ISeat {
    boolean reserve() throws IsReservedException;
    boolean cancel() throws  IsNotReservedException;
}
