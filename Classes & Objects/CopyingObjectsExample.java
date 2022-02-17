public class CopyingObjectsExample{
    public static void main(String[] args){
        Rational r1 = new Rational(3, 5);
        Rational r2 = r1;
        
        System.out.println(r1 == r2);
        r1.setDen(7);
        System.out.println(r1);
        System.out.println(r2);
        
        Rational r3 = new Rational(r1);
        System.out.println(r1 == r3);
        System.out.println(r1.equals(r3));
        r3.setNum(4);
        System.out.println(r3);
        System.out.println(r1);
    }
}