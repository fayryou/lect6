public class Cow extends Animal implements Ability{

    @Override
    void sound() {
        System.out.println("Moo moo!");
    }
    
    void turn() {
        System.out.println("cow turn");
    }

    void fly() {
        System.out.println("cow fly");
    }

    void glide() {
        System.out.println("cow glide");
    }

    void dance() {
        System.out.println("cow dance");
    }

    @Override
    public void disappear() {
        System.out.println("Cow disappear");
    }

    @Override
    public void magic() {
        System.out.println("Acadacadabra");
    }

    @Override
    public void attack() {
        System.out.println("cow attack");
    }

}
