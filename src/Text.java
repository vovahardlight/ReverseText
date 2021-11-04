public class Text {
    public static void main(String[] args) {
        String str = "abc";
        char[] result = str.toCharArray();
        String st = "";
        for (int i = result.length-1; i >= 0; i--){
            st+=result[i];
            }
        System.out.println(st);
    }
}
