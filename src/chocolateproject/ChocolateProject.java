/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolateproject;

import java.util.Scanner;
import java.io.*;
import java.util.*;

/**
 *
 * @author alaas
 */
public class ChocolateProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input=new Scanner(System.in);
        
        //Array to insert Object
        chocolateFactory[]arry=new chocolateFactory[6];
    
        
        //ask user to enter information:
        
        int prpN,picN;
        
        System.out.println("Welcome to our chocolate factory:We are very excited to show you our products");
        System.out.println("First please enter your Product number and number of Pieces you want and production Year for each flavor: ");
       
      
        //insert object to index 0
        System.out.println("for Protein Flavor:");
        System.out.print("Enter your Product number: ");
        prpN=input.nextInt();
        System.out.print("Enter number of Pieces you want: ");
        picN=input.nextInt();
        System.out.print("Enter production Year: ");
        Date d=new Date(input.nextInt());
        arry[0]=new ProteinFlavor(prpN,d,10,30,15,2.1,picN,2,8.6,7,19);
        
        //insert object to index 1
        System.out.println("for Cookie Flavor:");
        System.out.print("Enter your Product number: ");
        prpN=input.nextInt();
        System.out.print("Enter number of Pieces you want: ");
        picN=input.nextInt();
        System.out.print("Enter production Year: ");
        Date d1=new Date(input.nextInt());
        arry[1]=new CookieFlavor(prpN,d1,10.2,15.2,6.2,4.1,picN,1.2,5.9,4.2,"Small");
         
        
        //insert object to index 2
        System.out.println("for Peanuts Cookie Flavor:");
        System.out.print("Enter your Product number: ");
        prpN=input.nextInt();
        System.out.print("Enter number of Pieces you want: ");
        picN=input.nextInt();
        System.out.print("Enter production Year: ");
        Date d2=new Date(input.nextInt());
        arry[2]=new PeanutsCookieFlavor(prpN,d2,11.3,5.2,4.3,6.2,picN,1.1,2.3,9.2,"small","small");
        
        //insert object to index 3
        System.out.println("for Dark Chocolat Flavor:");
        System.out.print("Enter your Product number: ");
        prpN=input.nextInt();
        System.out.print("Enter number of Pieces you want: ");
        picN=input.nextInt();
        System.out.print("Enter production Year: ");
        Date d3=new Date(input.nextInt());
        arry[3]=new DarkChocoFlavor(prpN,d3,5,10,2,5.2,picN,4,6.8,1.1,30);
        
        //insert object to index 4
        System.out.println("for Fruits Flavor:");
        System.out.print("Enter your Product number: ");
        prpN=input.nextInt();
        System.out.print("Enter number of Pieces you want: ");
        picN=input.nextInt();
        System.out.print("Enter production Year: ");
        Date d4=new Date(input.nextInt());
        System.out.print("Whate type of Fruit Flavor you want:");
        String fr=input.next();
        arry[4]=new FruitsFlavor(prpN,d4,30,20,15,3,picN,1,0.2,1.4,fr);
        
        //insert object to index 5
        System.out.println("for coffee Flavor:");
        System.out.print("Enter your Product number: ");
        prpN=input.nextInt();
        System.out.print("Enter number of Pieces you want: ");
        picN=input.nextInt();
        System.out.print("Enter production Year: ");
        Date d5=new Date(input.nextInt());
        arry[5]=new coffeeFlavor(prpN,d5,1.2,10,20,2.1,picN,3.2,1.1,0.2,40);
        
        
        
         System.out.println("******************************************************");
        
        
        //print the ingredients  for each flavor 
        int c=0;
        loop:
        while(c>=0&&c<=6){
        System.out.println("Pleas enter What flavor you want know its ingredients:\n0)Protein Flavor\n1)Cookie Flavor\n2)Peanuts Cookie Flavor\n3)Dark Chocolat Flavor\n4)Fruits Flavor\n5)coffee Flavor\n6)Exit");
        c=input.nextInt();
        switch(c){
          
         case 0:
         System.out.println(arry[0].IngredientsOfChoco());
         break;
         
         case 1:
         System.out.println(arry[1].IngredientsOfChoco());
         break;
         
         
         case 2:
         System.out.println(arry[2].IngredientsOfChoco());
         break;
         
         case 3:
         System.out.println(arry[3].IngredientsOfChoco());
         break;
         
         
         case 4:
         System.out.println(arry[4].IngredientsOfChoco());
         break;
         
         
         case 5:
         System.out.println(arry[5].IngredientsOfChoco());
         break;
         
         case 6:
             break loop;
        }
        }
        
        System.out.println("******************************************************");
        
        
        //Find the calories of specific flavor 
        System.out.println("Pleas enter What flavor you want know its calories:\n0)Protein Flavor\n1)Cookie Flavor\n2)Peanuts Cookie Flavor\n3)Dark Chocolat Flavor\n4)Fruits Flavor\n5)coffee Flavor");
        int num=input.nextInt();
        System.out.println("The calory is: "+arry[num].calculateCalories()); 
       
        
        System.out.println("******************************************************");
        
        
        //print the Expiry Date for each flavor
        System.out.println("The Expiry Date for each flavor:");
        for (int i = 0; i <arry.length; i++) {
            System.out.println("The Product number "+arry[i].getProductnum()+" will expire in a year "+arry[i].theExpiryDate());
        }
        
        System.out.println("******************************************************");
        
        
        //Write benfitsOfChocolate for each flavor to file
        System.out.println("BenfitsOfChocolate for each flavor:");
        try{
        File file=new File("benfitsOfChocolate.txt");
        PrintWriter input1=new PrintWriter(file);
        Scanner output=new Scanner(file);
        //Enter price one file
          for (int i = 0; i <arry.length; i++) {
                 input1.println(arry[i].benfitsOfChocolate());
          }
        input1.close();
        //Read benfitsOfChocolate from file
        while(output.hasNext()) {
            System.out.println(output.nextLine()); 
          }
         output.close();
        }
        
        catch(Exception ex){
            System.out.println("");
        }
        
        
        
        System.out.println("******************************************************");
        //create 3 object from Date
        Date d7=new Date(2019);
        Date d8=new Date(2017);
        Date d9=new Date(2020);
        //create array 
        chocolateFactory [] array= new chocolateFactory[3];
        //Reade information from file and fill it in object
        try{
        File file=new File("Flavor.txt");
        Scanner output1=new Scanner(file);
         String junk=output1.nextLine(); //to read the first line
         array[0]= new ProteinFlavor(output1.nextInt(),d7,output1.nextDouble(),output1.nextDouble(),output1.nextDouble(),output1.nextDouble(),output1.nextInt(),output1.nextDouble(),output1.nextDouble(),output1.nextDouble(),output1.nextDouble());
         array[1]= new ProteinFlavor(output1.nextInt(),d9,output1.nextDouble(),output1.nextDouble(),output1.nextDouble(),output1.nextDouble(),output1.nextInt(),output1.nextDouble(),output1.nextDouble(),output1.nextDouble(),output1.nextDouble());
         array[2]= new ProteinFlavor(output1.nextInt(),d8,output1.nextDouble(),output1.nextDouble(),output1.nextDouble(),output1.nextDouble(),output1.nextInt(),output1.nextDouble(),output1.nextDouble(),output1.nextDouble(),output1.nextDouble());
         output1.close();
        }
        catch(IOException ex){
            System.out.println(ex);
        }
        
       
       //creat collection and fill it whith object
        ArrayList<ProteinFlavor>list=new ArrayList<>();
        //add objects in collection
        for (int i = 0; i < array.length; i++) {
             list.add((ProteinFlavor) array[i]);
          }
        //sort the collection as for the product number
        Collections.sort(list);
        //print collection sort
        System.out.println("The order of Protein Flavors is according to the product number:");
        for(Object o:list){
            System.out.println(o);
        }
        
        System.out.println("******************************************************");
        
        //
        System.out.println("Do you want to know which Protein Flavor product will expire soon?\n1)YES\n2)NO");
        int num1=input.nextInt();
      if(num1==1){
        //get the Expiry Date from collection
        int exp1=list.get(0).theExpiryDate();
        int exp2=list.get(1).theExpiryDate();
        int exp3=list.get(2).theExpiryDate();
        
        if(exp1<exp2&&exp1<exp3)
         System.out.println("Beware product number "+list.get(0).getProductnum()+" it will expire soon in a year "+exp1);
        
         else if(exp2<exp1&&exp2<exp3)
         System.out.println("Beware product number "+list.get(1).getProductnum()+" it will expire soon in a year "+exp2);
        
         else
         System.out.println("Beware product number "+list.get(2).getProductnum()+" it will expire soon in a year "+exp3);
        }
        
      else {
          System.out.println("OK...As you like");
      }
      
        
        
       System.out.println("******************************************************"); 
       
       
        //Make your own flavor of chocolate
        MakeYourOwnChocolate obj=new MakeYourOwnChocolate();
        //creat collection
        ArrayList<String>list1=new ArrayList<>();
        list1.add(obj.Component1);
        list1.add(obj.Component2);
        list1.add(obj.Component3);
        list1.add(obj.Component4);
        list1.add(obj.Component5);
        list1.add(obj.Component6);
        
        int numb1, num2;
        System.out.println("We want to know if there are flavors that can be mixed together?\nSo Make your own flavor of chocolate and choose at least three flavors that you want to mix together:");
        System.out.println("Let me know how many flavors you want to mixed together?");
        int numb=input.nextInt();
       
        while(numb>3||numb<=0){
            System.out.println("Wrong choice!!! You have to choose at least three flavors");
              numb=input.nextInt();
        }
        
        
        if(numb==1){
        System.out.println("So Choose:\n0)TOFFEE\n1)CHOCOLATE\n2)CARAMEL\n3)PEANUTS\n4)COCONUT\n5)MILK");
         numb1=input.nextInt();
         System.out.println("You chose: "+list1.get(numb1)+"\nThank you, we will take your opinion into consideration");   
        }
        
        else if(numb==2){
         System.out.println("So Choose:\n0)TOFFEE\n1)CHOCOLATE\n2)CARAMEL\n3)PEANUTS\n4)COCONUT\n5)MILK");
         num1=input.nextInt();
         num2=input.nextInt();
         System.out.println("You chose: "+list1.get(num1)+", "+list1.get(num2)+"\nThank you, we will take your opinion into consideration");   
        }
        else {
         System.out.println("So Choose:\n0)TOFFEE\n1)CHOCOLATE\n2)CARAMEL\n3)PEANUTS\n4)COCONUT\n5)MILK");
         numb=input.nextInt();
         num1=input.nextInt();
         num2=input.nextInt();
         System.out.println("You chose: "+list1.get(numb)+", "+list1.get(num1)+", "+list1.get(num2)+"\nThank you, we will take your opinion into consideration");   
        }
        
        
        System.out.println("******************************************************"); 
        
        System.out.println("We hope you enjoyed with us, Thank you(:");
    }
    
}
