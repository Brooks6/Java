public class workingWithStrings {
    public static void main(String [] args){
        String s = "hello brooks";
        System.out.println(s.toUpperCase());
        System.out.println(s.contains("o"));
        System.out.println(s.charAt(0));
        System.out.println(s.indexOf('b'));
        System.out.println(s.substring(10));//from index 10 to end
        System.out.println(s.substring(0,5));//fron index 0 to 4(not include 5th letter)
        System.out.println(s.substring(0, s.indexOf(" ")));//hello
    }
}
