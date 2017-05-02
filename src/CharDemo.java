public class CharDemo {

    public static char charExpression (int a) {
        
        int s = '\\';
        int total = s + a;
        char unicode = (char) total;
        return unicode;
}
 public static void main(String[] args) {
     System.out.println(charExpression(90));
       
}
}
