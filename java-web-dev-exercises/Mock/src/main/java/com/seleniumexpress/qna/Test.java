package main.java.com.seleniumexpress.qna;

public class Test implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Overriding the abstract method - Test class");
    }

    @Override
    public void defaultMethod() {
        //MyInterface.super.defaultMethod();
        System.out.println("Default method overridden - test class");
    }
    //Even though it is the same signature of the interface's static method, it
    // has not overriden it. It is a new static method inside the implementation.
    // If you try to add the Override annotation then you get an error
    // "Static methods cannot be annotated with @Override".
    // This is called method hiding
    //@Override
    public static void myStaticMethod() {
        System.out.println("Inside static method - Test");
    }

    public static void main(String[] args) {
        new Test().abstractMethod();
        new Test().defaultMethod();
        MyInterface.myStaticMethod(); // you can call this even if this class
        // does not implement the interface. You still need to use the interface name
        // * The static method can be inherited in case you are extending another class.
        // But the static method cannot be inherited if it is in an interface.
        // Whatever classes will be implementing the interface will only be inheriting
        // the abstract classes in the interface.
        new Test().myStaticMethod();

    }
}
