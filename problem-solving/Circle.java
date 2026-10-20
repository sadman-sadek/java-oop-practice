public class Circle extends Shape{
    Circle(double r){
        super(r,r);
    }
    void area (){
        double Result = Math.PI * dim1 * dim2;
        System.out.println("area of a circle is :"+Result);
    }
}