public class AbstractionExample {
    public static void main(String[] args) throws Exception {
        Shape shape = new Circle(); 
        shape.draw(); // Output: Drawing Circle
     }
  }
abstract class Shape {
    abstract void draw(); // Abstract method
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}