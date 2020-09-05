package bks;

public class app {
    /*
    get five-digit numbers which meet demand that:
    1.units = myriabit
    2.tens = kilobit
    3.units + tens + kilobit + myriabit = hundreds place
    */
    public static void main(String[] args){
        for(int i = 10000; i < 100000 ; i++){
            if(i % 10 == i / 10000 && (i / 10) % 10 == (i / 1000) % 10 && i % 10 + (i / 10) % 10 + (i / 1000) % 10 + i / 10000 == (i / 100) % 10){
                System.out.println(i);
            }
        }
    }
}
