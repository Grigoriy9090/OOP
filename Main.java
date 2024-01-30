import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Animal cat = new Animal("Барсик", LocalDate.of(2020,03,20),new Illness("Лишай"));
        System.out.println(cat.getName());
        System.out.println();
        
        Animal animal = new Animal();
        cat.setIllness(new Illness(null));
        System.out.println(cat.getIllness());
        cat.lifeCycle();
        System.out.println();

        Animal dog = new Dog("Персик", LocalDate.of(2020,02,10),new Illness("Лишай"));
        System.out.println(dog.illness);
        dog.lifeCycle();
        System.out.println();

        List<Animal> list = new ArrayList<>();
        list.add(dog);
        list.add(cat);
        
        Animal bird = new Bird("Ласточка", LocalDate.of(2020,03,20),new Illness("Лишай"), 2);
        System.out.println(bird.illness);
        bird.lifeCycle();
        System.out.println();
        
        Animal crocodile = new Crocodile("Гоша", LocalDate.of(2020,01,19),new Illness("Крокодилий дерматит"));
        System.out.println(crocodile.illness);
        crocodile.lifeCycle();
        System.out.println();
        
        list.add(new Fish("Дори", LocalDate.of(2023,01,19),new Illness("Обезвоживание"), 2));
        System.out.println(list);
        System.out.println();
    }

}
