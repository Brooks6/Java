package bks;

public class classesAndObjects {
    public static void main(String [] args){
        Students myStudent = new Students();
        myStudent.firstName = "HONGZHANG";
        System.out.println(myStudent.firstName);

        Book book1 = new Book("dota2", "ice frog", 100, "Chinese");
        System.out.println(book1.title);
    }
}
