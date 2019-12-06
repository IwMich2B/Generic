package pl.accenture;

public class Main {

    public static void main(String[] args) {
     Util util = new Util();
        util.go(new Person());
        util.go(new Employee());
    }
    MyList<Vehicle> myList = new MyList<>();


}

class Util<T extends Person> {
    void go(T t) {
        System.out.println("Przekazany typ to " + t.getClass().getSimpleName());
    }
}
class Person{

}
class Employee extends Person{

}
class MyList<T extends Vehicle>{
    void add(T t){

    }

}
