import java.util.Scanner;
public class ProgramTwo {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("How many miles do you drive per year? ");
        double mileDriven = scnr.nextDouble();
        
        System.out.println("What is the current price per gallon of gasoline? ");
        double gasPrice = scnr.nextDouble();
        
        System.out.println("How many miles per gallon does your car get? ");
        double mpg = scnr.nextDouble();
        
        double GallonsPerYear = mileDriven/mpg;
       
        double Cost= GallonsPerYear*gasPrice;
        
        final double LBS_CO2_PER_GALLON_E10 = 18.9; // pounds of CO2/gallon of E10 gasoline
        
        double COP= GallonsPerYear*LBS_CO2_PER_GALLON_E10;
        System.out.println("You use "+ GallonsPerYear+ " gallons of gas per year.This costs "+ Cost +" and produces "+COP+" lbs of CO2 pollution\n\n");
        
        
        
        /*
         * below is to compute the Electric cars
         */
        
        System.out.println("How many miles per kilowatt hour (kwh) does is get?");
        double MPK = scnr.nextDouble();
        System.out.println("What is the cost//kwh of your electricity (in cents)");
        double ePrice=scnr.nextDouble();
        
        double KperYear = mileDriven / MPK;
       
        double eCost = (KperYear * ePrice )/100;
        
        final double LBS_CO2_PER_KWH = 0.58815;   // pounds of CO2/KWH
        
        double eCOP = KperYear * LBS_CO2_PER_KWH;
          
       System.out.printf("That electric car would use " + KperYear+" kwh's of electricty per year. This costs "+eCost+" and produces %.2f lbs of CO2 pollution.\n",eCOP);
        
        /*
         * savings
         */
        
       double gasSavings = Cost-eCost;
       
       double COPred = COP-eCOP;
       
       System.out.println("That would save "+ gasSavings+" per year, and reduce carbon emissions by "+COPred+" lbs.");
}   
    }
