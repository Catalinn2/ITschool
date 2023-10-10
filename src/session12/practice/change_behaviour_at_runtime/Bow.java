package session12.practice.change_behaviour_at_runtime;

public class Bow implements Weapon {
    @Override
    public void use() {
        System.out.println("Shoots arrows!");
    }
}
