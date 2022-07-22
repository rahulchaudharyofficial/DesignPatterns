package in.rahulchaudharyofficial.clone;

public class CloneDemo {
    public static void main(String[] args) {
        var p1 = new Person("Rahul");
        var p2 = new Person("Rahul");
        var p3 = p1.clone();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
