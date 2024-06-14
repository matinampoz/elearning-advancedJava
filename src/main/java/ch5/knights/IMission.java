package ch5.knights;
 /*
 μια functional interface είναι μια διεπαφή  που έχει μόνο μία αφηρημένη μέθοδο.
 Μπορεί να έχει και άλλες μεθόδους, αλλά αυτές θα πρέπει να είναι default ή static.
 Αυτή η μοναδική μέθοδος καθορίζει το σκοπό της διεπαφής και μπορεί να εφαρμοστεί με την χρήση
 εκφράσεων λήμματος (lambda expressions) ή μεθόδων αναφοράς (method references).
  */
@FunctionalInterface
public interface IMission {
    void embark();
}
