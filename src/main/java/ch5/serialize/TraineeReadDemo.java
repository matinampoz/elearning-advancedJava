package ch5.serialize;

import java.io.*;

public class TraineeReadDemo {

    public static void main(String[] args) {

        try(ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("D:/opa/trainee.ser"))) {
            Trainee traineeAlice;
            traineeAlice = (Trainee) ois.readObject();
            System.out.println(traineeAlice.getName() + " successfully read");
            System.out.println(traineeAlice);

        } catch (FileNotFoundException | ClassNotFoundException | NotSerializableException e) {
            System.out.println("Read failed ...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
