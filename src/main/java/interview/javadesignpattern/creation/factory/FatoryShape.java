package interview.javadesignpattern.creation.factory;

public class FatoryShape {

    public static Shape getShape(String shape){
        if("circle".equals(shape)){
            return  new Circle();
        }else if ("tri".equals(shape))
            return new Triangle();
        return null;
    }
}
