public class ComparingObjectsExample{
    public static void main(String[] args){
        Rational r1 = new Rational(3, 5);
        Rational r2 = new Rational(3, 5);
        
        int x = 5;
        int y = 5;
        
        System.out.println(x == y);
        
        
        System.out.println(r1 == r2);
        System.out.println(r1.equals(r2));
        
    }
}