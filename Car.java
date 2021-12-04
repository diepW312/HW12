import javax.swing.JOptionPane;

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
       JOptionPane.showMessageDialog(null,"Car Carbon Foot Print is " + cf,"Results", 
    		   JOptionPane.INFORMATION_MESSAGE);
   }

}