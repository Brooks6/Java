package bks;

public class app {
    public static void main(String [] args){
        Students stu1 = new Students(3.1);
        Students stu2 = new Students(2.6);
        System.out.println("isOnHonorRoll: (stu1) " + stu1.isOnHonnorRoll());
        System.out.println("isOnHonorRoll: (stu2) " + stu2.isOnHonnorRoll());
    }
}
