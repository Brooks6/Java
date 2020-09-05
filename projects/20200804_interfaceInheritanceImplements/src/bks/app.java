package bks;

public class app {
    public static void main(String [] args){
        Animals [] animals = {
                new Dogs(),
                new Birds()
        };

        int i = 0;
        while(i < animals.length){
            animals[i].eat();
            i++;
        }

        /*
        Animals myBird = new Birds();
        Animals myDog = new Dogs();
        Animals can replace Class Birds or Dogs
        */

    }
}
