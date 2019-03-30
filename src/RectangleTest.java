

public class RectangleTest{
   
     public static void main(String[] args){
            
                      
                
               
                     
                                        Rectangle obj1=new Rectangle(20,30);

                                        Rectangle obj2=new Rectangle(10,20);

                        

                                        System.out.println("Area of rectangle="+obj1.areaOfRectangle());

 					System.out.println("Perimeter of rectangle="+obj1.perimeterOfRectangle());

                                        System.out.println("Area of rectangle="+obj2.areaOfRectangle());
 					
					System.out.println("Perimeter of rectangle="+obj2.perimeterOfRectangle());

                                        Rectangle obj3=new Rectangle(obj1.areaOfRectangle(),obj2.areaOfRectangle());

                                            obj3.compareArea(obj1,obj2);
                               
     } 
}