package DemoJavaHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Group {
    private String name;
    private Set<Student> students;

    public Group(String name) {
        this.name = name;
        this.students = new HashSet<>();
    }

    @Override
    public String toString() {
        String studentsString = "";
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            studentsString += it.next().toString() + "\n";
        }
        return "Group" + name + ":\n" + studentsString;
    }

    public boolean addStudent(Student student) {
        boolean studentAdded = false;
        if(!students.contains(student)){
            studentAdded = this.students.add(student);
        }
        return studentAdded;
    }

    public Student removeStudent(String dni) {
        Student studentRemoved = null;
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student student = it.next();
            if (student.getDni().equals(dni)) {
                studentRemoved = student;
                it.remove();
            }
        }
        return studentRemoved;
    }
}
