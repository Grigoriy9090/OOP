import java.time.LocalDate;

public class Bird extends Animal {
    public Bird(String name, LocalDate birthDay, Illness illness, int wingQuantity) {
        super(name, birthDay, illness); 
    }
@Override
public void swim(){
    System.out.println();
}
}
