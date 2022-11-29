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
public class DarkChocoFlavor extends chocolateFactory  {
    
    /**
     * Attribute
     */
    public double amountOfDarkChoco;

    /**
     *
     */
    public DarkChocoFlavor() {
        super();
        amountOfDarkChoco = 0;
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
     * @param amountOfDarkChoco
     */
    public DarkChocoFlavor(int productnum, Date productionDate, double amountOfSugar, double amountOfChoco, double amountOfMilk, double amountOfFat, int numOfPieces, double protein, double Carbohydrates, double DietaryFiber, double amountOfDarkChoco) {
        super(productnum, productionDate, amountOfSugar, amountOfChoco, amountOfMilk, amountOfFat, numOfPieces, protein, Carbohydrates, DietaryFiber);
        this.amountOfDarkChoco = amountOfDarkChoco;
    }

    /**
     *
     * @return amountOfDarkChoco
     */
    public double getAmountOfDarkChoco() {
        return amountOfDarkChoco;
    }

    /**
     *
     * @param amountOfDarkChoco
     */
    public void setAmountOfDarkChoco(double amountOfDarkChoco) {
        this.amountOfDarkChoco = amountOfDarkChoco;
    }

    /**
     *
     * @return String
     */
    public String toString() {
        return "DarkChocoFlavor{ "+super.toString() + "  Amount Of Dark Chocolate : " + amountOfDarkChoco+" }";
    }

    /**
     *
     * @param o
     * @return
     */
    public boolean equals(Object o) {
        DarkChocoFlavor d = (DarkChocoFlavor) o;
        return (this.amountOfDarkChoco == d.amountOfDarkChoco);
    }

    /**
     *
     * @return price of chocolate
     */
    public double price() {
        return getNumOfPicese() * 7.5;
    }

    /**
     *
     * @return Benefits of Dark chocolate
     */
    public String benfitsOfChocolate() {
        return ("Benefits Of Dark Chocolate:\n1.High in Antioxidants\n2.Reduces Cholesterol\n3.prevents Cancer\n4.Healthy Heart\n5.Control blood Pressure\n");
    }

    /**
     *
     * @return Ingredients of chocolate
     */
    public String IngredientsOfChoco() {
        return ("Suger : " + getAmountOfSugar() + "%" + " | Milk : " + getAmountOfMilk() + "%" + " | Dark Chocolate : " + getAmountOfDarkChoco() + "%" + " | Fat : " + getAmountOfFat() + "%" + " | Protein: " + +getProtein() + "%" + " | Carbohydrates: " + getCarbohydrates() + "%" + " | DietaryFiber: " + getDietaryFiber()+"%");
    }
    
    

}

