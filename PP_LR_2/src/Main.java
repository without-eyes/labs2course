import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення масиву студентів
        List<Student> students = new ArrayList<>();

        // Додавання студентів у масив
        students.add(new Student(1, "Петров", "Іван", "Олександрович",
                "15.05.2004", "Львів", "+380123456789",
                "Комп'ютерні науки", 3, "КН-31"));
        students.add(new Student(2, "Іванов", "Петро", "Миколайович",
                "20.03.2005", "Київ", "+380987654321",
                "Право", 1, "ПВ-12"));
        students.add(new Student(3, "Сидоров", "Олена", "Василівна",
                "05.08.2006", "Харків", "+380122333444",
                "Право", 2, "ПВ-23"));

        //Виведення на екран потрібної інформації
        printFacultyStudents("Право", students);
        printStudentsBornAfterYear(2005, students);
        printGroupList("ПВ-12", students);
    }

    public static void printFacultyStudents(String faculty, List<Student> students) {
        System.out.printf("\nСтуденти, які вчаться на факультеті \"%s\":\n", faculty);
        for (Student student : students) {
            if (student.getFaculty().equals(faculty))
                System.out.println(student + "\n");
        }
    }

    public static void printStudentsBornAfterYear(int year, List<Student> students) {
        System.out.printf("\nСтуденти, які народилися після %d року:\n", year);
        for (Student student : students) {
            if (Integer.parseInt(student.getBirthDate().substring(6)) >= year)
                System.out.println(student + "\n");
        }
    }

    public static void printGroupList(String group, List<Student> students) {
        System.out.printf("\nСтуденти, які вчаться у %s:\n", group);
        for (Student student : students) {
            if (student.getGroup().equals(group))
                System.out.println(student + "\n");
        }
    }
}