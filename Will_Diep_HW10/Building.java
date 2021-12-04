
class Building implements CarbonFootPrint
{
   int noStoreys;
   float fuelUsed;
  
   Building(int n, float f)
   {
       noStoreys = n;
       fuelUsed = f;
   }
  
   public void getCarbonFootPrint()
   {
       float cf = noStoreys*fuelUsed;
       System.out.println("Building Carbon Foot Print : " + cf);
   }

}