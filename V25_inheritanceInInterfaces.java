interface A {
    void meth1();
}

interface B extends A {
    void meth2();
}

class C implements B {
    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    @Override
    public void meth2() {
        System.out.println("meth2");
    }
}

public class V25_inheritanceInInterfaces {
    public static void main(String[] args) {
        C c = new C();
        c.meth1();
        c.meth2();
    }
}
