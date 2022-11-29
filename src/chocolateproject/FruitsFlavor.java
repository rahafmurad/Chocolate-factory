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

public class FruitsFlavor extends chocolateFactory {
    /**
     * attribute
     */
    private String kindOfFruits;
    /**
     * 
     */
    public FruitsFlavor (){
    kindOfFruits="unknown";
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
     * @param kindOfFruits 
     */
    public FruitsFlavor (int productnum, Date productionDate, double amountOfSugar, double amountOfChoco, double amountOfMilk, double amountOfFat, int numOfPieces,  double protein, double Carbohydrates, double DietaryFiber, String kindOfFruits){
        super(productnum,productionDate,amountOfSugar,amountOfChoco,amountOfMilk,amountOfFat,numOfPieces,protein,Carbohydrates,DietaryFiber);
        this.kindOfFruits=kindOfFruits;
    }
    /**
     * 
     * @param kindOfFruits 
     */
    public void setKindOfFruits(String kindOfFruits){
        this.kindOfFruits= kindOfFruits;
    }
    /**
     * 
     * @return String
     */
    public String getKindOfFruits(){
        return kindOfFruits;
    } 
    /**
     * 
     * @return String
     */
    public String toString (){
        return "FruitsFlavor{"+super.toString()+",kind of fruit is:"+kindOfFruits+"}";
    }
    /**
     * 
     * @param o
     * @return boolean
     */
    public boolean equals(Object o){
        FruitsFlavor f=(FruitsFlavor)o; 
        return (f.kindOfFruits.equals(this.kindOfFruits));
    }
    /**
     * 
     * @return double
     */
    public double price(){
        return(getNumOfPicese()*1.75);
    }
    /**
     * 
     * @return String
     */
    @Override
    String benfitsOfChocolate() {
        return("Benefits Of Coffee Chocolate:\n1-Increase Cognitive Function\n2-Reduce Heart Disease\n3increase Athletic Performance\n");
    
        }
    /**
     * 
     * @return String
     */
    public String IngredientsOfChoco(){
        return ("Suger : "+getAmountOfSugar()+"%"+" | chocolate : "+getAmountOfChoco()+"%"+" | Milk : "+getAmountOfMilk()+"%"+" | Fat : "+ getAmountOfFat()+"%"+" | Kind Of Fruit : "+getKindOfFruits()+ "Protein: " + getProtein() + "%, "+"Carbohydrates: "+getCarbohydrates()+"%, "+"DietaryFiber: "+getDietaryFiber()+"%");
    }


    
    
}

