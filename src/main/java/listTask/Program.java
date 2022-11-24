package listTask;

import java.util.LinkedList;

public class Program {
    public static void main(String[] args) {
        LinkedList<Students> list = new LinkedList<>();

        // добавил элементы в список
        list.add(new Students("Oleg", 19, 323));
        list.add(new Students("Misha", 21, 321));
        list.add(new Students("Yura", 22, 324));
        list.add(new Students("Valya", 23, 423));
        list.add(new Students("Gleb", 24, 353));
        list.add(new Students("Vitya", 17, 383));
        // Список после добавления в него элементов
        System.out.println("Список после добавления в него элементов");
        write(list);

        System.out.println("Размер заполненного списка: " + list.size() + "\n");

        // Добавил элемент в конец списка
        System.out.println("Список после добавления элемента в конец");
        list.addLast(new Students("Maxim", 19, 381));
        write(list);

        // Добавление элемента в начало списка
        System.out.println("Список после добавления элемента в начало");
        list.addFirst(new Students("Sasha", 29, 4381));
        write(list);

        // Удалил элемент из списка
        System.out.println("Список после удаления элемента");
        list.removeIf(student -> student.getStudentName().equals("Yura"));
        write(list);

        //проверяю наличие элемента в списке, возвращаю true если элемент есть в списке.
        System.out.print("Есть ли в списке студент Misha: ");
        list.forEach(students -> {
            if (students.getStudentName().equals("Misha")) {
                System.out.println("Да \n");
            }
        });

        // Очищаю список
        System.out.println("Список после очистки: ");
        list.removeAll(list);
        System.out.println();
        //проверяю наличие элемента в списке, возвращаю Да если элемент есть в списке.
        System.out.print("Есть ли в списке студент Misha: ");
        if (list.size() == 0) {
            System.out.println("Нет");
        }

    }

    private static void write(LinkedList<Students> list) {
        list.forEach(students -> System.out.println("Имя студента: " + students.getStudentName() + ", возраст студента: "
                + students.getStudentAge() + ", группа студента: " + students.getStudentGroup()));
        System.out.println();
    }

}
