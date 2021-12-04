import javax.swing.JOptionPane;

class Bicycle implements CarbonFootPrint
{
  
   public void getCarbonFootPrint()
   {
	   JOptionPane.showMessageDialog(null, "Bicycle Carbon Foot Print : 0", "Results", 
    		   JOptionPane.INFORMATION_MESSAGE);
   }

}
