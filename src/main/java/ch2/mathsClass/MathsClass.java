package ch2.mathsClass;

import java.util.ArrayList;
import java.util.List;

public class MathsClass {
    private int studentsNumber;
    private List<Student> studentList = new ArrayList<Student>();

    public MathsClass(int studentsNumber) {
        this.studentsNumber = studentsNumber;
    }

    public void addStudentToClass(Student student){
        studentList.add(student);
    }

    public boolean removeStudentFromList(Student student) throws EmptyStudentListException{
        if (studentList.isEmpty()) throw new EmptyStudentListException(MathsClass.class);
        return studentList.remove(student);
    }

    public int getStudentsNumber() {
        return studentsNumber;
    }

    public void setStudentsNumber(int studentsNumber) {
        this.studentsNumber = studentsNumber;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    //για να δημιουργησω κλαση test κανω alt και enter πανω στο ονομα της κλασης και μετα επιλεγω
}
