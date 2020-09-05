package bks;

public class Students {
    double gpa;
    public Students(double aGpa){
        this.gpa = aGpa;
    }
    public Boolean isOnHonnorRoll(){
        if(this.gpa >=3.5){
            return true;
        }else {
            return false;
        }
    }
}
