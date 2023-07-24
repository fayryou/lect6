public class Duck extends Animal implements Flyable, Ability {

    @Override
    void sound() {
        System.out.println("Quack! quack!");
    }
    
    void turn() {
        System.out.println("duck turn");
    }

    public void fly() {
        System.out.println("duck fly");
    }

    public void glide() {
        System.out.println("duck glide");
    }

    @Override
    public void hover() {
        System.out.println("duck hover");
    }

    public void clean(Animal prey) { // super type is here so sub class of Animal can use !
        System.out.println(prey + " is being clean.");
    }

    void dance() {
        System.out.println("duck dance");
    }

    @Override
    public void disappear() {
        System.out.println("duck disappear");
    }

    @Override
    public void magic() {
        System.out.println("Ohmarukukui");
    }

    @Override
    public void attack() {
        System.out.println("duck attack");
    }
}
