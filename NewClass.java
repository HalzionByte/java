
package zayem44java.java;


public class NewClass {
   double width;
   double height;
   
   public NewClass(){
       width = 1;
       height = 1;
   }
   public NewClass(double w,double h){
      this.width = w;
      this.height = h;
   }
   public double GetArea(){
       return (width*height);
   }
   public double Perimeter(){
       return 2*(width+height);
   }
}
