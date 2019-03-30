public class TimeTest{

      public static void main(String args[]){
            Time obj1=new Time();
            Time obj2=new Time();
             

            obj1.setData(2,14);

            obj2.setData(3,15);
            obj1.showData();
            obj2.showData();
           
            Time obj3=new Time();
            
            obj3.addTime(obj1,obj2);

    }


}