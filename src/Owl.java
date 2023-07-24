public class Owl extends Animal implements Flyable, Ability {

    @Override
    public void fly() {
        System.out.println("owl fly");
    }

    @Override
    public void glide() {
        System.out.println("owl glide");
    }

    @Override
    public void hover() {
        System.out.println("owl hover");
    }

    @Override
    void sound() {
        System.out.println("Hook hook!");
    }

    void turn() {
        System.out.println("owl turn");
    }
    
    void dance() {
        System.out.println("owl dance");
    }

    @Override
    public void disappear() {
        System.out.println("owl disappear");
    }

    @Override
    public void magic() {
        System.out.println("Leviosaaa");
    }

    @Override
    public void attack() {
        System.out.println("owl attack");
    }
}
