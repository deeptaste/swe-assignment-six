import model.CodingPractice;
import model.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MyStudentRecordsMgmtApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student(110001, "Dave", Helper.parseDate("11/18/1951"));
        Student s2 = new Student(110002, "Anna", Helper.parseDate("12/07/1990"));
        Student s3 = new Student(110003, "Erica", Helper.parseDate("01/31/1974"));
        Student s4 = new Student(110004, "Carlos", Helper.parseDate("08/22/2009"));
        Student s5 = new Student(110005, "Bob", Helper.parseDate("03/05/1990"));

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        System.out.println("\n" + "All Students:");
        Collections.sort(students, Comparator.comparing(Student::getName));
        printListOfStudents(students);

        System.out.println("\n" + "PlatinumAlumni Students:");
        List<Student> platinumAlumni = getListOfPlatinumAlumniStudents(students);
        printListOfStudents(platinumAlumni);

        //Coding Practice Test
        int[] numsArr1 = { 5, 7, 10, 14, 35 };
        System.out.println("\n" + "Integers in Array: " + Arrays.toString(numsArr1));
        CodingPractice.printHelloWorld(numsArr1);

        int[] numsArr2 = { 1, 2, 3, 4, 5 };
        System.out.println("\n" + "Integers in Array: " + Arrays.toString(numsArr2));
        System.out.println("\t" + "2nd biggest integer: " + CodingPractice.findSecondBiggest(numsArr2));

        int[] numsArr3 = { 19, 9, 11, 0, 12 };
        System.out.println("\n" + "Integers in Array: " + Arrays.toString(numsArr3));
        System.out.println("\t" + "2nd biggest integer: " + CodingPractice.findSecondBiggest(numsArr3));
    }

    public static void printListOfStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println("\t"
                    + student.getStudentId() + " - "
                    + student.getName() + " - "
                    + Helper.getFormattedDate(student.getDateOfAdmission()));
        }
    }

    public static List<Student> getListOfPlatinumAlumniStudents(List<Student> students) {
        List<Student> platinumAlumni = new ArrayList<>();

        for (Student student : students) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(student.getDateOfAdmission());
            cal.add(Calendar.YEAR, 30);

            if (cal.getTime().before(new Date())) {
                platinumAlumni.add(student);
            }
        }

        platinumAlumni.sort(Comparator.comparing(Student::getDateOfAdmission).reversed());
        return platinumAlumni;
    }
}