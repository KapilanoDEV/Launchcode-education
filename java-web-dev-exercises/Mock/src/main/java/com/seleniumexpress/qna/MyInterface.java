package main.java.com.seleniumexpress.qna;
//https://youtu.be/gD_slsA_VQc?si=XGZZTyA2qszrVNIB

public interface MyInterface {
    public abstract void abstractMethod();

    // Default methods provide an implementation
    // Where an interface has one or multiple implementations,
    // if one or more methods are added to the interface, all the implementations
    // will be forced to implement them too. Otherwise, the design will just break down.
    // Default interface methods are an efficient way to deal with this issue.
    // They allow us to add new methods to an interface that are automatically available
    // in the implementations. Therefore, we don’t need to modify the implementing classes.
    // In this way, backward compatibility is neatly preserved without having to
    // refactor the implementers.
    // If you want to prevent your default method from being overridden
    // then you cannot make it final; this is because all
    // interface methods are public, including the default ones, hence
    // you can't make them final.
    // You do not need to specify the public modifier as it is implicit
    // in default methods
    default void defaultMethod(){
        System.out.println("Inside default method...");
    }
    //If you want to prevent the method from being overridden then use static
    // methods. These
    public static void myStaticMethod() {
        System.out.println("Inside static method - Interface");
    }

}
