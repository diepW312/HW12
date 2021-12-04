
class Car implements CarbonFootPrint
{
   int km;
   float fuelUsed;
  
   Car(int k, float f)
   {
       km = k;
       fuelUsed = f;
   }
  
   public void getCarbonFootPrint()
   {
       float cf = km*fuelUsed;
       System.out.println("Car Carbon Foot Print : " + cf);
   }

}