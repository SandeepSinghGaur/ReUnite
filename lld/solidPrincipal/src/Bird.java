public abstract class Bird {
    protected FlyBehavior flyBehavior;
    public Bird(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
    public void performFly() {
        if (flyBehavior != null) flyBehavior.fly();
    }

    public abstract void eat();
    public abstract void makeSound();
}
