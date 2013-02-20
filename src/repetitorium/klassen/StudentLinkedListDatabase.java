package repetitorium.klassen;

public class StudentLinkedListDatabase {
    private class ListEntry {
        private ListEntry previous;
        private ListEntry next;
        private Student value;

        private ListEntry(ListEntry previous, ListEntry next, Student value) {
            this.previous = previous;
            this.next = next;
            this.value = value;
        }
    }

    private ListEntry head = new ListEntry(null, null, null);
    private ListEntry tail = new ListEntry(null, null, null);

    public StudentLinkedListDatabase() {
        head.next = tail;
        tail.previous = head;
    }

    public void addStudent(Student student) {
        ListEntry previous = tail.previous;

        ListEntry entry = new ListEntry(tail.previous, tail, student);
        previous.next = entry;
        tail.previous = entry;
    }

    public void deleteStudent(String matriculationNumber) {
        ListEntry current = head;
        while (current.next != null) {
            Student student = current.value;
            if (student != null && student.getMatriculationNumber().equals(matriculationNumber)) {

                ListEntry previous = current.previous;
                ListEntry next = current.next;

                previous.next = next;
                next.previous = previous;
            }
            current = current.next;
        }
    }

    public void addGradeToStudentsWithForename(String forename, float grade) {
        ListEntry current = head;
        while (current.next != null) {
            Student student = current.value;
            if (student != null && student.getForename().equals(forename)) {
                student.addGrade(grade);
            }
            current = current.next;
        }
    }

    public void removeLastGradeFromStudentsWithMatriculationNumber(String matriculationNumber) {
        ListEntry current = head;
        while (current.next != null) {
            Student student = current.value;
            if (student != null && student.getMatriculationNumber().equals(matriculationNumber)) {
                student.removeLastGrade();
            }
            current = current.next;
        }
    }

    public Student getStudentAt(int index) {
        int i = -1;
        ListEntry current = head;
        while (current.next != null) {
            Student student = current.value;
            if (i == index) return student;
            i++;
            current = current.next;
        }
        return null;
    }

    public int numberOfStudents() {
        int count = -1;
        ListEntry current = head;
        while (current.next != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public String printMe() {
        String result = "";
        ListEntry current = head;

        while (current.next != null) {
            Student student = current.value;
            if (student != null) {
                result += student.printMe() + "\r\n";
            }
            current = current.next;
        }

        return result;
    }
}
