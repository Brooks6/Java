package bks;

public class Dogs implements Animals{//implementing all the methods in Animals class

    @Override
    public void speak() {
        System.out.println("dogs are speaking");
    }

    @Override
    public void eat() {
        System.out.println("dogs are eating");
    }
}
