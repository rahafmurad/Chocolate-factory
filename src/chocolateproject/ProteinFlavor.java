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
public class ProteinFlavor extends chocolateFactory implements Comparable<ProteinFlavor>{
    /**
     * Attribute
     */
    public double amountOfExtraProtein;

    public ProteinFlavor() {
        super();
        this.amountOfExtraProtein = 0;
    }

    
    /**
     * 
     * @param amountOfExtraProtein
     * @param productnum
     * @param productionDate
     * @param amountOfSugar
     * @param amountOfChoco
     * @param amountOfMilk
     * @param amountOfFat
     * @param numOfPicese
     * @param protein
     * @param Carbohydrates
     * @param DietaryFiber 
     */
    public ProteinFlavor(int productnum, Date productionDate, double amountOfSugar, double amountOfChoco, double amountOfMilk, double amountOfFat, int numOfPicese, double protein, double Carbohydrates, double DietaryFiber,double amountOfExtraProtein) {
        super(productnum, productionDate, amountOfSugar, amountOfChoco, amountOfMilk, amountOfFat, numOfPicese, protein, Carbohydrates, DietaryFiber);
        this.amountOfExtraProtein = amountOfExtraProtein;
    }

   

    /**
     *
     * @return amountOfProtein
     */
    public double getAmountOfExtraProtein() {
        return amountOfExtraProtein;
    }

    /**
     *
     * @param amountOfProtein
     */
    public void setAmountOfExtraProtein(double amountOfExtraProtein) {
        this.amountOfExtraProtein = amountOfExtraProtein;
    }

    @Override
    /**
     * @return price
     */
    public double price() {
        if(getNumOfPicese()>5)
        return (getNumOfPicese())-(getNumOfPicese()*0.1);
        else
            return getNumOfPicese();
    }


    @Override
    /**
     * @return benfits Of Chocolate
     */
    public String benfitsOfChocolate() {
        return "benfits Protein Flavor:\n"
                + "*Extra protein per bar\n"
                + "*Made with minimum 54% cocoa solids\n"
                + "*62% less sugar than standard supermarket alternatives\n"
                + "*Suitable for vegetarians\n";
    }

    @Override
    /**
     * @return Ingredients Of Choco
     */
    public String IngredientsOfChoco() {
        return "Milk " + getAmountOfMilk() + "%, " + "Fat " + getAmountOfFat() + "%, " + "Chocolate" + getAmountOfChoco() + "%, " + "Sugar " + getAmountOfSugar() + "%, " + "Protein " + (getAmountOfExtraProtein()+getProtein()) + "%, "+"Carbohydrates "+getCarbohydrates()+"%, "+"DietaryFiber "+getDietaryFiber()+"%";
    }

    

    @Override
    /**
     * @param obj
     * @return equality
     */
    public boolean equals(Object obj) {
        ProteinFlavor o=(ProteinFlavor)obj;
        return (this.amountOfExtraProtein == o.amountOfExtraProtein); 
                
            
    }
    
    

    @Override
    /**
     * @return state of object
     */
    public String toString() {
        
        return "ProteinFlavor{ " +super.toString()+  " amountOfExtraProtein= " + amountOfExtraProtein+" }";
    }

    
    /**
     * 
     * @param t
     * @return result of comparator
     */
    @Override
    public int compareTo(ProteinFlavor t) {
        if( this.getProductnum()> t.getProductnum())
      return 1;
    else if(this.getProductnum()< t.getProductnum())
      return -1;
    else
      return 0;}
    
    
    
    

}

