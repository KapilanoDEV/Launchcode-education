package org.launchcode.java.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc{

    public CD(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName, maxCapacity, aType, someUsedCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins are a rate of 200 - 500 rpm");

    }

    @Override
    public void readData() {
        System.out.println("Would you like to play a game?");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
