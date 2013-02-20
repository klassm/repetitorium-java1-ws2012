package repetitorium.klassen;

public class StudentArrayDatabase {
    private Student[] students;
    private int occupationPointer = 0;

    public StudentArrayDatabase(int databaseSize) {
        this.students = new Student[databaseSize];
    }

    public boolean addStudent(Student student) {
        if (occupationPointer >= students.length) {
            System.out.println("Keine Plätze mehr frei!");
            return false;
        }

        students[occupationPointer++] = student;
        return true;
    }

    public void deleteStudent(String matriculationNumber) {
        for (int i = 0; i < occupationPointer; i++) {
            Student student = students[i];
            if (student.getMatriculationNumber().equals(matriculationNumber)) {
                deleteEntryAt(i);
            }
        }
    }

    private void deleteEntryAt(int index) {
        Student[] newStudents = new Student[students.length - 1];

        int writeIndex = 0;
        for (int i = 0; i < occupationPointer; i++) {
            if (i == index) continue;
            newStudents[writeIndex++] = students[i];
        }

        students = newStudents;
        occupationPointer--;
    }

    public void addGradeToStudentsWithForename(String forename, float grade) {
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student.getForename().equals(forename)) {
                student.addGrade(grade);
            }
        }
    }

    public void removeLastGradeFromStudentsWithMatriculationNumber(String matriculationNumber) {
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student.getMatriculationNumber().equals(matriculationNumber)) {
                student.removeLastGrade();
            }
        }
    }

    public Student getStudentAt(int index) {
        if (index >= occupationPointer && index < 0) {
            return null;
        }

        return students[index];
    }

    public int numberOfStudents() {
        return occupationPointer;
    }

    public String printMe() {
        String result = "";
        for (int i = 0; i < occupationPointer; i++) {
            result += students[i].printMe() + "\r\n";
        }
        return result;
    }
}
