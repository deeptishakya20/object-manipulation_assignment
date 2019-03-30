public class Distance{

       private int feet;
       private double inches;

           public void setData(int feet, double inches){
              this.feet=feet;
              this.inches=inches;
                  
      }

              public void showData(){

                 System.out.println("Distance="+feet+" and "+inches);
      }


              public void addDistance(Distance obj1, Distance obj2){
              int feet=obj1.feet+obj2.feet;
              double inches=obj1.inches+obj2.inches;
              System.out.println("Total Distance="+feet+" and "+inches);
 

      }

} 