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
 public class CookieFlavor extends chocolateFactory {
    /**
     * attribute
     */
   private String sizeOfcookie;
    /**
     * 
     */
   public CookieFlavor(){
       super();
       sizeOfcookie="unknown";
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
     * @param sizeOfcookie 
     */
    public CookieFlavor (int productnum, Date productionDate, double amountOfSugar, double amountOfChoco, double amountOfMilk, double amountOfFat, int numOfPieces,  double protein, double Carbohydrates, double DietaryFiber, String sizeOfcookie){
        super(productnum,productionDate,amountOfSugar,amountOfChoco,amountOfMilk,amountOfFat,numOfPieces,protein,Carbohydrates,DietaryFiber);
        this.sizeOfcookie=sizeOfcookie;
    }
    /**
     * 
     * @param sizeOfcookie
     */
    
    public void setsizeOfcookie(String sizeOfcookie){
        this.sizeOfcookie=sizeOfcookie;
    }
     /**
     * 
     * @return String
     */
    public String getsizeOfcookie(){
        return sizeOfcookie;
    }
     /**
     * 
     * @return String
     */
    @Override
    public String toString() {
        return (super.toString()+", Size Of Cookie="+sizeOfcookie);
    }
    /**
     * 
     * @param o
     * @return boolean
     */
    public boolean equals(Object o){
        CookieFlavor c=(CookieFlavor)o; 
        return(c.sizeOfcookie.equals(this.sizeOfcookie) );
    }
    /**
     * 
     * @return double
     */
    public double price(){
        return(getNumOfPicese()*6.75);
    }
    /**
     * 
     * @return String
     */
    @Override
    String benfitsOfChocolate() {
        return("Benefits Of cookieFlavor Chocolate:\n1-Very Nutritious\n2-Powerful Source of Antioxidants\n3-May Improve Blood Blood Pressure\n4-Increase Concentration\n");
    }
    /**
     * 
     * @return String
     */
    @Override
    public String IngredientsOfChoco() {
        return("Suger : "+getAmountOfSugar()+"%"+" | Milk : "+getAmountOfMilk()+"%"+" | Cookie : "+getsizeOfcookie()+"%"+" | Fat : "+ getAmountOfFat()+"%"+" | Chocolate :"+getAmountOfChoco()+"%"+ "Protein: " + getProtein() + "%, "+"Carbohydrates: "+getCarbohydrates()+"%, "+"DietaryFiber: "+getDietaryFiber()+"%");
    }    
}
