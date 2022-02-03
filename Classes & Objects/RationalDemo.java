public class RationalDemo{
    public static void main(String[] args){
        Rational r1 = new Rational();
        System.out.println(r1.getNum() + " / " + r1.getDen());
        r1.setNum(12);
        r1.setDen(11);
        System.out.println(r1.getNum() + " / " + r1.getDen());
        
        Rational r2 = new Rational();
        System.out.println(r2.getNum() + " / " + r2.getDen());
    }
}