public class Time{

       private int hour;
       private int second;

           public void setData(int hour, int second){
              this.hour=hour;
              this.second=second;
                  
      }

              public void showData(){

                 System.out.println("Time="+hour+" and "+second);
      }


              public void addTime(Time obj1, Time obj2){
              int hour=obj1.hour+obj2.hour;
              int second=obj1.second+obj2.second;
              System.out.println("Total Time="+hour+" and "+second);
 

      }

} 