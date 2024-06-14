package ch5.serialize;

import java.io.*;

public class TraineeWriteDemo {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("C:/tmp/JavaSerializationDir/trainee.ser"))){

            Trainee traineeAlice = new Trainee("Alice", new City("Athens"));
            oos.writeObject(traineeAlice);
            System.out.println(traineeAlice.getName() + " successfully saved");

        } catch (FileNotFoundException | NotSerializableException e) {
            System.out.println("Error in saving");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
