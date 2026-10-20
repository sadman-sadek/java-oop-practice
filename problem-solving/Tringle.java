public class Tringle extends Shape {
    Tringle(double dim1, double dim2){
        super (dim1,dim2);
    }
   void area (){
    double RESULT = 0.5 * dim1 * dim2 ;
    System.out.println("the area of Tringle is :"+RESULT);
   }
}