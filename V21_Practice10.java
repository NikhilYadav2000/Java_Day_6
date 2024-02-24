class Circle{
    public int area(int r){
        return (int)(3.14*r*r);
    }
    public int abc(int x){
        return x;
    }
}
class Cylinder extends Circle{
    public int area(int r,int h){
        return (int)(3.14*r*r*h);
    }
    public int abc(int x){
        return x=2;
    }
}
public class V21_Practice10 {
    public static void main(String[] args) {
        Circle c=new Circle();
        System.out.println(c.area(3)); // 28

        Cylinder cy=new Cylinder();
        System.out.println(cy.area(3, 4)); // 113

        Circle c2=new Cylinder();
        System.out.println(c2.area(3));
        // System.out.println(c2.area(3,4)); // is not possible bcoz c2 is a type of Circle reference varibale (Parent)  it does not have the feature of public int area(int r,int h), so it can call int area(int r)only.

        System.out.println(c2.abc(1)); // 2 will be printed as B's abc() will override A' abc() as they have same number of arguments 
    }
}
