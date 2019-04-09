// filename Main.java
class Grandparent {
    public void Print() {
        System.out.println("Grandparent's Print()");
    }
}
  
class Parent extends Grandparent {
    public void Print() {
        System.out.println("Parent's Print()");
    }
}
  
class Child extends Parent {
    public void Print() {
        super.super.Print(); 
        System.out.println("Child's Print()");
    }
}
  
public class Main7 {
    public static void main(String[] args) {
        Child c = newChild();
        c.Print();
    }
}
