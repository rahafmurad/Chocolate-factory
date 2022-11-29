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
public class PeanutsCookieFlavor extends  CookieFlavor {
    
   public String sizeOfPeanutscookie;

    public PeanutsCookieFlavor() {
        super();
        this.sizeOfPeanutscookie = "null";
    }
   
    /**
     * 
     * @param sizeOfPeanutscookie
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
     * @param sizeOfcookie 
     */
    public PeanutsCookieFlavor(int productnum, Date productionDate, double amountOfSugar, double amountOfChoco, double amountOfMilk, double amountOfFat, int numOfPieces, double protein, double Carbohydrates, double DietaryFiber, String sizeOfcookie,String sizeOfPeanutscookie) {
        super(productnum, productionDate, amountOfSugar, amountOfChoco, amountOfMilk, amountOfFat, numOfPieces, protein, Carbohydrates, DietaryFiber, sizeOfcookie);
        this.sizeOfPeanutscookie = sizeOfPeanutscookie;
    }

    /**
     * 
     * @return String
     */
    public String getSizeOfPeanutscookie() {
        return sizeOfPeanutscookie;
    }
    /**
     * 
     * @param sizeOfPeanutscookie 
     */
    public void setSizeOfPeanutscookie(String sizeOfPeanutscookie) {
        this.sizeOfPeanutscookie = sizeOfPeanutscookie;
    }

    
     /**
     * 
     * @return String
     */
    @Override
    public String toString() {
        return (super.toString()+", Size Of Peanuts cookie="+sizeOfPeanutscookie);
    }
    /**
     * 
     * @param o
     * @return boolean
     */
    public boolean equals(Object o){
        PeanutsCookieFlavor p=(PeanutsCookieFlavor)o; 
        return(p.sizeOfPeanutscookie.equals(this.sizeOfPeanutscookie));
    }
    /**
     * 
     * @return double
     */
    public double price(){
        return(getNumOfPicese()*7.75);
    }
    /**
     * 
     * @return String
     */
    public String IngredientsOfChoco(){
        return ("Suger : "+getAmountOfSugar()+"%"+" | Milk : "+getAmountOfMilk()+"%"+" | PeanutsCookie : "+getSizeOfPeanutscookie()+"%"+" | Fat : "+ getAmountOfFat()+"%"+" | Chocolate :"+getAmountOfChoco()+"%"+ "Protein: " + getProtein() + "%, "+"Carbohydrates: "+getCarbohydrates()+"%, "+"DietaryFiber: "+getDietaryFiber()+"%");
    }
    /**
     * 
     * @return String
     */
    @Override
    String benfitsOfChocolate() {
        return("Benefits Of PeanutscookieFlavor Chocolate:\n1-Very Nutritious\n2-Powerful Source of Antioxidants\n3-May Improve Blood Blood Pressure\n4-Increase Concentration\n");
    }
   
   
   
}
