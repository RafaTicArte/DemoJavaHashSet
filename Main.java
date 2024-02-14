package DemoJavaHashSet;

public class Main {
    public static void main(String[] args) {
        Group DAM1 = new Group("DAM1");

        System.out.println("Adding students to the group...");
        DAM1.addStudent(new Student("10000000A", "María", "Segovia Madrid", 22));
        DAM1.addStudent(new Student("20000000B", "Juan", "Pérez Pérez", 19));
        DAM1.addStudent(new Student("20000000B", "Juan", "Pérez Pérez", 21));
        DAM1.addStudent(new Student("30000000C", "Fran", "Rodas Martín", 24));
        DAM1.addStudent(new Student("40000000D", "Sandra", "Alba Ruz", 30));
        System.out.println(DAM1);

        System.out.println("Removing student with DNI 20000000B...");
        DAM1.removeStudent("20000000B");
        System.out.println(DAM1);
    }
}
