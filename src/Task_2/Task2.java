package Task_2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Иван", "Иванов", "ПМ-2020-1", 5);
        Student student2 = new Student("Петр", "Кузнецов", "ПМ-2022-2", 4.6);
        Student student3 = new Student("Светлана", "Смирнова", "ПД-2021-1", 4.4);
        Student aspirant1 = new Aspirant("Альберт", "Эйнштейн", "Гении-1", 5);
        Student aspirant2 = new Aspirant("Гоги", "Кикабидзе", "Лузеры-1", 3);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(aspirant1);
        students.add(aspirant2);

        for (int i = 0; i < students.size(); i++) {
            System.out.println("У "+students.get(i).getFirstName() + " "+
                    students.get(i).getLastName() + " стипендия равна: " +
                    students.get(i).getScholarship() + " руб.");
        }
    }
}
