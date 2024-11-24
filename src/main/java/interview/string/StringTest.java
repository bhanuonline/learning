package interview.string;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);//true
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.length() == s2.length());//t
        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s1));//0
        System.out.println(s1.compareToIgnoreCase(s2));//0
        System.out.println(s1.compareToIgnoreCase(s1));//0

    }
}
