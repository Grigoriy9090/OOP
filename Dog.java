import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String name, LocalDate birthDay, Illness illness) {
        super(name, birthDay, illness);
    }

    @Override
    public void fly() {
        System.out.println();
    }

    @Override
    public void swim() {
        System.out.println();
    }
}
