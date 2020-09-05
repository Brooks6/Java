package bks;

public class app {
    public static void main(String[] args){
        int a = 6, b = 3;
        System.out.println(a >> 1);//0110 >> 1 = 0011 = 3
        System.out.println(b << 2);//0011 << 2 = 1100 = 12
        System.out.println(a & b);//0110 & 0011 = 0010(2)
        System.out.println(a | b);//0110 | 0011 = 0111(7)
        System.out.println(a ^ b);//0110 ^ 0011 = 0101(5)
        System.out.println(~a);
        // ～6 = 11111111 11111111 11111111 11111001 negative（two's complement）
        //    = 10000000 00000000 00000000 00000110 ones' complement
        //    = 10000000 00000000 00000000 00000111 -7
    }
}
