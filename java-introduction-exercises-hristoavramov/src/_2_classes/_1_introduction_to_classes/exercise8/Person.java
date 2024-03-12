package _2_classes._1_introduction_to_classes.exercise8;

public class Person {

    private String name;
    private Person mother;
    private Person father;

    public Person(String name, Person mother, Person father) {
        this.name = name;
        this.mother = mother;
        this.father = father;
    }

    public boolean isSiblingOf(Person person) {
        // Return "true" if this object is the sibling of the person given as a parameter
        return false;
    }

    public boolean isGrandparentOf(Person person) {
        // Return "true" if this object is the grandparent of the person given as a parameter
        return false;
    }

    public boolean isGrandchildOf(Person person) {
        // Return "true" if this object is the grandchild of the person given as a parameter
        return false;
    }

    // The next two methods are for the brave of heart! These methods can be quite difficult to implement.

    public boolean isAncestorOf(Person person) {
        // Return "true" if this object is an ancestor of the person given as a parameter
        return false;
    }

    public boolean isDescendantOf(Person person) {
        // Return "true" if this object is a descendant of the person given as a parameter
        return false;
    }
}
