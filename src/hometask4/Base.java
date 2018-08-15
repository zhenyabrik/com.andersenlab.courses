package hometask4;

import java.util.HashSet;
import java.util.Set;

public class Base {

    public static void main(String[] args) {
        SetClass setClass = new SetClass();

        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(111);
        setA.add(44);

        Set<Integer> setB = new HashSet<>();
        setB.add(12);
        setB.add(2);
        setB.add(141);
        setB.add(4);

        System.out.println("equals: " + setClass.equals(setA, setB));
        System.out.println("union: " + setClass.union(setA, setB));
        System.out.println("subtract: " + setClass.subtract(setA, setB));
        System.out.println("intersect: " + setClass.intersect(setA, setB));
        System.out.println("symmetricSubtract: " + setClass.symmetricSubtract(setA, setB));
    }
}
