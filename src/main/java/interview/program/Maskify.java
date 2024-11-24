package interview.program;

public class Maskify {
    public static void main(String[] args) {
        String text = "4556364607935616";
        int r= text.length()-4;
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if(i>=r){
                sb.append(text.charAt(i));
            }
            else{
                sb.append("#");
            }
        }
        System.out.println(sb);


        System.out.println("#".repeat(4));
    }
}
