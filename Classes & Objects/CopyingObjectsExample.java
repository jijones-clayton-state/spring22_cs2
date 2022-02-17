public class CopyingObjectsExample{
    public static void main(String[] args){
        Rational r1 = new Rational(3, 5);
        Rational r2 = r1;
        
        System.out.println(r1 == r2);
        r1.setDen(7);
        System.out.println(r1);
        System.out.println(r2);
    }
}