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
        StringBuilder groupString = new StringBuilder();
        groupString.append("Group ").append(name).append(":\n");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            groupString.append(iterator.next().toString()).append("\n");
        }
        return groupString.toString();
    }

    public boolean addStudent(Student student) {
        return students.add(student);
    }

    public Student removeStudentByDni(String dni) {
        Student studentRemoved = null;
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getDni().equals(dni)) {
                studentRemoved = student;
                iterator.remove();
            }
        }
        return studentRemoved;
    }
}
