//This program will demonstrate the use of interface. Each class of a specific type of carbon producer will have their own unique variables used to calculate their carbon foot print.
//They will also implement the interface CarbonFootPrint.java to calculate their carbon footprint through the "getCarbonFootPrint method.
//Author:Will Diep


import java.util.*;
public class testCarbonFootPrint {
	public static void main(String args[])
	{
	    ArrayList<CarbonFootPrint> cf = new ArrayList<CarbonFootPrint>();;
	    Building b = new Building(5,5.125f);
	    Car c = new Car(500,2.78f);
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
