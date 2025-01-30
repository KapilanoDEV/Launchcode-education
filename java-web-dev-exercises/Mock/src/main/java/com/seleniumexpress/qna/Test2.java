package main.java.com.seleniumexpress.qna;

class Test3 {
    // This static method will be available inside your child class
    // and you will be able to call it directly as in line 12. Go to * in Test.java
    public static void myStaticMethod() {
        System.out.println("Inside static method - Test3");
    }
}
public class Test2 extends Test3{
    public void m1(){
        myStaticMethod();
    }
    public static void main(String[] args) {

        new Test2().m1();
    }

}

