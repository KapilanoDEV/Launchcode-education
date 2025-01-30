package org.launchcode.java.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD("CD example",700,"CD-R",350);
        DVD myDVD = new DVD("DVD example",4700,"DVD-R",1450);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCD.spinDisc();
        myDVD.spinDisc();

        myCD.readData();
        myDVD.readData();

        System.out.println(myCD.writeData(275));
        System.out.println(myDVD.writeData(8000));

        System.out.println(myCD.diskInfo());
        System.out.println(myDVD.diskInfo());

    }
}
