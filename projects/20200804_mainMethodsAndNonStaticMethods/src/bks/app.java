package bks;

public class app {
    public static void main(String[] args){
        app myApp = new app();
        myApp.sayHi("Brooks");
    }

    public void sayHi(String name){
        /*
        "static" match to "static void main"
        * */
        System.out.println("Hello" + name);
    }
}
