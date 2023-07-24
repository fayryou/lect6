public class Pig extends Animal implements Ability {

    @Override
    void sound() {
        System.out.println("Oink oink!");
    }
    
    void turn() {
        System.out.println("pig turn");
    }

    void fly() {
        System.out.println("pig fly");
    }

    void glide() {
        System.out.println("pig glide");
    }

    void dance() {
        System.out.println("pig dance");
    }

    @Override
    public void disappear() {
        System.out.println("pig disappear");
    }

    @Override
    public void magic() {
        System.out.println("Doramisola");
    }

    @Override
    public void attack() {
        System.out.println("pig attack");
    }
}
