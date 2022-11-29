/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolateproject;

/**
 *
 * @author alaas
 */

   
public class coffeeFlavor extends chocolateFactory {
    
    /**
     * attribute
     */
    private double amountCoffee;
    /**
     * 
     */
    
    public coffeeFlavor (){
        super();
        amountCoffee=0;
    }
    /**
     * 
     * @param productnum
     * @param productionDate
     * @param amountOfSugar
     * @param amountOfChoco
     * @param amountOfMilk
     * @param amountOfFat
     * @param numOfPieces
     * @param protein
     * @param Carbohydrates
     * @param DietaryFiber
     * @param amountCoffee 
     */
    public coffeeFlavor (int productnum, Date productionDate, double amountOfSugar, double amountOfChoco, double amountOfMilk, double amountOfFat, int numOfPieces,  double protein, double Carbohydrates, double DietaryFiber,double amountCoffee){
        super(productnum,productionDate,amountOfSugar,amountOfChoco,amountOfMilk,amountOfFat,numOfPieces,protein,Carbohydrates,DietaryFiber);
        this.amountCoffee=amountCoffee;
    }
    /**
     * 
     * @param amountCoffee 
     */
    public void setAmountOfCoffee(double amountCoffee){
        this.amountCoffee= amountCoffee;
    }
    /**
     * 
     * @return double
     */
    public double getAmountOfCoffee(){
        return amountCoffee;
    } 
    /**
     * 
     * @return String
     */
    public String toString (){
        return "coffeeFlavor{ " +super.toString()+", Amount of coffee ="+amountCoffee+"}";
    }
    /**
     * 
     * @param o
     * @return boolean
     */
    public boolean equals(Object o){
        coffeeFlavor c=(coffeeFlavor)o; 
        return(c.amountCoffee == this.amountCoffee);
    }
    /**
     * 
     * @return double
     */
    public double price(){
        return(getNumOfPicese()*2.75);
    }
    /**
     * 
     * @return String
     */
    String benfitsOfChocolate() {
        return("Benefits Of Coffee Chocolate:\n1-Very Nutritious\n2-Powerful Source of Antioxidants\n3-May Improve Blood Blood Pressure\n4-Increase Concentration\n");}

    /**
     * 
     * @return String
     */
    public String IngredientsOfChoco(){
        return ("Suger : "+getAmountOfSugar()+"%"+" | chocolate : "+getAmountOfChoco()+"%"+" | Milk : "+getAmountOfMilk()+"%"+" | coffee : "+getAmountOfCoffee()+"%"+" | Fat : "+ getAmountOfFat()+"%"+ "Protein: " + getProtein() + "%, "+"Carbohydrates: "+getCarbohydrates()+"%, "+"DietaryFiber: "+getDietaryFiber()+"%");
    }

    

}   
   

