public class Rectangle{
      private   double length;
      private  double breadth;
                   Rectangle(double length, double breadth){
                           this.length=length;
                           this.breadth=breadth;
                }     

                   
                   public double areaOfRectangle(){
                         
                           return length*breadth;
                          
                }
        
                   public double perimeterOfRectangle(){
                         double perimeter=2*(length+breadth);
                          return (perimeter);
                         
                }
                    public void compareArea(Rectangle obj1,Rectangle obj2){
                          if(obj1.areaOfRectangle()==obj2.areaOfRectangle())
                          System.out.println("Rectangles having same area");
                          else
                          System.out.println("Rectangles having different area");
                         
                }

    

   }
