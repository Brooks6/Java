package bks;

public class Birds implements Animals {
    @Override
    public void speak() {
        System.out.println("birds are speaking");
    }

    @Override
    public void eat() {
        System.out.println("birds are eating");
    }
}
