abstract class A{ // abstract class are standard class, the methods in it are declared here and must be called by the child clases
    public void hindGreet(){
        System.out.println("Namaste");
    }
    abstract public void greet();
}
class B extends A{
    // @Override
    public void greet(){
        System.out.println("Hello");
    }
}

abstract class C extends A{ // this is will be giving error as it does not include the abstract method so make this also abstract
    public void japGreet(){
        System.out.println("Nii Haao");
    }
}
public class V23_abstractClassAndMethod {
    public static void main(String[] args) {
    B b = new B();  
    b.greet();  // Hello
    b.hindGreet(); // Namaste
    // C c = new C(); // Cant make object as they are abstract classes
    // c.japGreet();
    // A a = new A(); // Cant make object as they are abstract classes
    }
}
