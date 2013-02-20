package repetitorium.klassen;

public class TestArray {
    public static void main(String[] args) {
//        printOneStudent();
//        printAHundredStudents();
//        studentArrayDatabase();
        addRemove();
    }

    private static void addRemove() {
        StudentArrayDatabase studentArrayDatabase = new StudentArrayDatabase(5);
        studentArrayDatabase.addStudent(new Student("Hans", "Wurst", "123"));
        studentArrayDatabase.addStudent(new Student("Hans", "Meier", "124"));
        studentArrayDatabase.addStudent(new Student("Erika", "Mustermann", "125"));
        studentArrayDatabase.addStudent(new Student("Erika", "Wurst", "126"));
        studentArrayDatabase.addStudent(new Student("Gerhard", "Meier", "127"));

        System.out.println(studentArrayDatabase.getStudentAt(0).printMe());
        System.out.println(studentArrayDatabase.getStudentAt(1).printMe());
        studentArrayDatabase.addGradeToStudentsWithForename("Hans", 2);
        System.out.println(studentArrayDatabase.getStudentAt(0).printMe());
        System.out.println(studentArrayDatabase.getStudentAt(1).printMe());

        System.out.println();
        System.out.println();

        System.out.println(studentArrayDatabase.getStudentAt(0).printMe());
        studentArrayDatabase.removeLastGradeFromStudentsWithMatriculationNumber("123");
        System.out.println(studentArrayDatabase.getStudentAt(0).printMe());
    }

    private static void studentArrayDatabase() {
        StudentArrayDatabase studentArrayDatabase = new StudentArrayDatabase(100);
        for (int i = 0; i < 100; i++) {
            studentArrayDatabase.addStudent(new Student("Foo" + i, "Bar" + i, i + ""));
        }

        System.out.println("Anzahl: " + studentArrayDatabase.numberOfStudents());
        System.out.println();

        for (int i = 0; i < 20; i++) {
            studentArrayDatabase.deleteStudent("" + i);
        }

        System.out.println(studentArrayDatabase.printMe());

        System.out.println("Anzahl: " + studentArrayDatabase.numberOfStudents());
    }

    private static void printAHundredStudents() {
        Student[] students = new Student[100];
        for (int i = 0; i < 100; i++) {
            students[i] = new Student("Foo" + i, "Bar" + i, i + "");
        }
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println(student.printMe());
        }
    }

    private static void printOneStudent() {
        Student someStudent = new Student("Foo", "Bar", "1337");
        System.out.println(someStudent.printMe());
        System.out.println(someStudent);
    }
}
