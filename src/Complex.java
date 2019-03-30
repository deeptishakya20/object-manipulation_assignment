class Complex{

   private double realNumber;
   private double imaginaryNumber;
           
         public void setData(double realNumber, double imaginaryNumber){
            this.realNumber=realNumber;     
            this.imaginaryNumber=imaginaryNumber;
       }
         
         public void showData(){
             System.out.println(realNumber+"+"+imaginaryNumber+"i");      

       }

         public void ComplexSum(Complex c1,Complex c2){
       
             double realNumber=c1.realNumber+c2.realNumber;
             double imaginaryNumber=c1.imaginaryNumber+c2.imaginaryNumber;
             
             System.out.println(realNumber+"+"+imaginaryNumber+"i");
             
       }
        

}
