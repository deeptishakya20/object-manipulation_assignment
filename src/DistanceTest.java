public class DistanceTest{

      public static void main(String args[]){
            Distance obj1=new Distance();
            Distance obj2=new Distance();
             

            obj1.setData(2,4);

            obj2.setData(3,5);
            obj1.showData();
            obj2.showData();
           
            Distance obj3=new Distance();
            
            obj3.addDistance(obj1,obj2);

    }


}