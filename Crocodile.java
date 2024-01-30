import java.time.LocalDate;

public class Crocodile extends Animal {
    public Crocodile(String name, LocalDate birthDay, Illness illness) {
        super(name, birthDay, illness);
    }
    @Override
    public String toString(){
        return String.format("name =%s, birthday =%s, illness =%s", name, birthDay, illness);
}
@Override
public void fly(){
    System.out.println();
}
}

