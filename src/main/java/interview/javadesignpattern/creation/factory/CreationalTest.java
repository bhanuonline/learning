package interview.javadesignpattern.creation.factory;

public class CreationalTest {
    public static void main(String[] args) {

    Shape shape =FatoryShape.getShape("tri");
    shape.shape();
    }
}
