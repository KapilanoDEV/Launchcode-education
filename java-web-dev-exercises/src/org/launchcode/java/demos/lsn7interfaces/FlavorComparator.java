package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor o1, Flavor o2) {
//        return o1.getName().compareTo(o2.getName());
//        return o1.getAllergens().size().compareTo(o2.getAllergens().size());
        if (o1.getAllergens().size() - o2.getAllergens().size() < 0) {
            return -1;
        } else if (o1.getAllergens().size() - o2.getAllergens().size() > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
