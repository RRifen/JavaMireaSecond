package Prac2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();

        humans.add(new Human(12, "Gena", "Smirnov", LocalDate.of(10, 2, 3), 40));
        humans.add(new Human(10, "Vasya", "Orlov", LocalDate.of(3, 4, 5), 20));
        humans.add(new Human(13, "Kolya", "Sinicin", LocalDate.of(5, 7, 2), 25));
        humans.add(new Human(18, "Evgeny", "Karpov", LocalDate.of(1, 2, 3), 48));

        System.out.println("Сортировка по второй букве имени");
        Stream<Human> stream = humans.stream();
        stream.sorted(Comparator.comparingInt((Human o) -> o.getFirstName().charAt(1))).forEach(System.out::println);
        System.out.println("=======================");

        System.out.println("Фильтрация по весу кратному 10");
        stream = humans.stream();
        stream.filter((Human o1) -> o1.getWeight() % 10 == 0).forEach(System.out::println);
        System.out.println("=======================");

        System.out.println("Сортировка по произведению веса на возраст");
        stream = humans.stream();
        stream.sorted(Comparator.comparingInt(h -> h.getWeight() * h.getAge())).forEach(System.out::println);
        System.out.println("=======================");

        System.out.println("Произведение всех весов");
        stream = humans.stream();
        Integer result = stream.reduce(1, (num, Human ) -> num * Human.getWeight(), (num, num2) -> num * num2);

        System.out.println(result);

    }
}
