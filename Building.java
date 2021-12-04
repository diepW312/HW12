import javax.swing.JOptionPane;

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
       JOptionPane.showMessageDialog(null, "Building Carbon Foot Print : " + cf,"Results", 
    		   JOptionPane.INFORMATION_MESSAGE);
   }

}