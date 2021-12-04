//This program is a continuation of HW9 but this time we will be using java GUI to customize its functionality
//In this program it will have a GUI for user input and the output result.
//There will also be a welcome message that will appear on program start up that will pop-up a window.
//Author: Will Diep
import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.*;
public class testCarbonFootPrint {
	public static void main(String args[])
	{
		JFrame frame = new JFrame("Carbon Footprint Calculator");
		final JLabel label = new JLabel("Hello! This is a carbon footprint calculator!");
		frame.getContentPane().add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	    ArrayList<CarbonFootPrint> cf = new ArrayList<CarbonFootPrint>();
	    String FuelBuilding = JOptionPane.showInputDialog("Enter how much fuel buildings use");
	    int BuildingFuelConsumption = Integer.parseInt(FuelBuilding);
	    Building b = new Building(BuildingFuelConsumption,5.125f);
	    String FuelCar = JOptionPane.showInputDialog("Enter how much fuel cars use");
	    int CarFuelConsumption = Integer.parseInt(FuelCar);
	    Car c = new Car(CarFuelConsumption,2.78f);
	    Bicycle bc = new Bicycle();
	    cf.add(b);
	    cf.add(c);
	    cf.add(bc);
   
	    Iterator<CarbonFootPrint> itr = cf.iterator();
	    while(itr.hasNext()){
	        itr.next().getCarbonFootPrint();
	        
	        
	    }
	    
	}
}
