
package MrBakuBlowingShitUP;

import java.util.*;
public class fun {
  public static void main(String[] args) {
    //DO NOT CHANGE
    double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
    //WRITE YOUR CODE HERE
    
    
   System.out.println("Enter your name");
    name = scan.nextLine();
    
    System.out.println("Do you have a US driver license?");
    String driverLicense = scan.next();
    
     if (driverLicense.equalsIgnoreCase("no")){
         System.out.println("Invalid data!");
         System.exit(0);
     }else if(driverLicense.equalsIgnoreCase("yes")){
       
      System.out.println("Enter your zip code");
      int zipCode = scan.nextInt();
      if(zipCode == 20910 || zipCode == 20740){
        premium +=60;
      }else if(zipCode == 22102 || zipCode== 22103){
        premium +=30;
      }else{
        premium+=50;
      }
      
      System.out.println("Is this vehicle Owned, Financed, or Leased?");
      vehicleOwnership = scan.next();
      if(vehicleOwnership.equalsIgnoreCase("owned")){
        premium +=10;
      }else{
        premium +=20;
      }
      
      System.out.println("How is this vehicle primarily used?");
      vehicleUsage = scan.next();
      
      if(vehicleUsage.equalsIgnoreCase ("business")){
        premium+=50;
        
      }else if(vehicleUsage.equalsIgnoreCase("pleasure")){
        premium+=10;
      }else if(vehicleUsage.equalsIgnoreCase("commute")){
        premium+=20;
        System.out.println("Days Driven To Work And/Or School");
        daysDrivenToWorkOrSchool = scan.nextInt();
        premium += 5*daysDrivenToWorkOrSchool;
        System.out.println("Miles Driven To Work And/Or School");
        milesToWorkOrSchool = scan.nextInt();
      premium += 1*milesToWorkOrSchool;
      }
    
      
      
      
      System.out.println("How old are you?");
      int age= scan.nextInt();
      if(age< 16){
        System.out.println("Invalid data!");
        System.exit(0);
        
      }else if(age >= 16 || age < 18){
        premium *= 20; 
      }else if(age>= 18 || age <= 21){
        premium *=6;
      }else if(age>21 || age <25){
        premium *=2;
      }
      
      System.out.println("What is your driving experience? ");
      int experience= scan.nextInt();
      
    if ((age-experience) <= 0){
      System.out.println("Invalid data!");
      System.exit(0);
    }else{
      premium -= 5*experience;
    }
    System.out.println("Have you had any accidents in the last 5 years?");
    
   
    String accidents= scan.next();
   
    if (accidents.equalsIgnoreCase("yes") ){
     System.out.println("How many?");
     accidentsAmount = scan.nextInt();
     premium += (0.2*premium)*accidentsAmount;
    }
    System.out.println("Have you had continuous insurance for the past 12 months?");
    continuousInsurance = scan.next();
    if(continuousInsurance.equalsIgnoreCase("no")){
      premium =2*premium;
    }
    System.out.println("What is the highest level of education you have completed?");
    education = scan.next();
    if(education.equalsIgnoreCase("phd") || education.equalsIgnoreCase("masters") || education.equalsIgnoreCase("bachelors")){
      premium= premium-premium*0.05;
    }else if(education.equalsIgnoreCase("doctors")){
      premium= premium-premium*0.1;
    }else if(education.equalsIgnoreCase("less then high school")){
      premium= premium+premium*0.05;
    }
    
     
    System.out.println(name+",here's your quote!");
    System.out.println("Start Your Policy Today For: $"+premium);
    referenceNumber = name.substring(0, name.length()-2).toUpperCase()+""+ age+"" +name.substring(name.length()-2).toUpperCase()+""+zipCode+""+education.toUpperCase();
    System.out.println("Reference number:"+referenceNumber);
     }
     
  
}
}
