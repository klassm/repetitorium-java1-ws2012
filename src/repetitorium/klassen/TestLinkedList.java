package repetitorium.klassen;

public class TestLinkedList {
    public static void main(String[] args) {
        studentLinkedListDatabase();
        addRemove();
    }

    private static void addRemove() {
        StudentLinkedListDatabase studentLinkedListDatabase = new StudentLinkedListDatabase();
        studentLinkedListDatabase.addStudent(new Student("Hans", "Wurst", "123"));
        studentLinkedListDatabase.addStudent(new Student("Hans", "Meier", "124"));
        studentLinkedListDatabase.addStudent(new Student("Erika", "Mustermann", "125"));
        studentLinkedListDatabase.addStudent(new Student("Erika", "Wurst", "126"));
        studentLinkedListDatabase.addStudent(new Student("Gerhard", "Meier", "127"));

        System.out.println(studentLinkedListDatabase.getStudentAt(0).printMe());
        System.out.println(studentLinkedListDatabase.getStudentAt(1).printMe());
        studentLinkedListDatabase.addGradeToStudentsWithForename("Hans", 2);
        System.out.println(studentLinkedListDatabase.getStudentAt(0).printMe());
        System.out.println(studentLinkedListDatabase.getStudentAt(1).printMe());

        System.out.println();
        System.out.println();

        System.out.println(studentLinkedListDatabase.getStudentAt(0).printMe());
        studentLinkedListDatabase.removeLastGradeFromStudentsWithMatriculationNumber("123");
        System.out.println(studentLinkedListDatabase.getStudentAt(0).printMe());
    }

    private static void studentLinkedListDatabase() {
        StudentLinkedListDatabase studentLinkedListDatabase = new StudentLinkedListDatabase();
        for (int i = 0; i < 100; i++) {
            studentLinkedListDatabase.addStudent(new Student("Foo" + i, "Bar" + i, i + ""));
        }

        System.out.println("Anzahl: " + studentLinkedListDatabase.numberOfStudents());
        System.out.println();

        for (int i = 0; i < 20; i++) {
            studentLinkedListDatabase.deleteStudent("" + i);
        }

        System.out.println(studentLinkedListDatabase.printMe());

        System.out.println("Anzahl: " + studentLinkedListDatabase.numberOfStudents());
    }
}
