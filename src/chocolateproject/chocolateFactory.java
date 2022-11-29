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

    public abstract class chocolateFactory implements Factory {

    public int productnum;
    public Date productionDate;
    public double amountOfSugar;
    public double amountOfChoco;
    public double amountOfMilk;
    public double amountOfFat;
    public int numOfPicese;
    public double protein;
    public double Carbohydrates;
    public double DietaryFiber;

    
    
    public chocolateFactory() {
        productnum = 0;
        productionDate = null;
        amountOfSugar = 0;
        amountOfChoco = 0;
        amountOfMilk = 0;
        amountOfFat = 0;
        numOfPicese = 0;
        protein = 0;
        Carbohydrates = 0;
        DietaryFiber = 0;

    }

    /**
     *
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
    public chocolateFactory(int productnum, Date productionDate, double amountOfSugar, double amountOfChoco, double amountOfMilk, double amountOfFat, int numOfPicese, double protein, double Carbohydrates, double DietaryFiber) {
        this.productnum = productnum;
        this.productionDate = productionDate;
        this.amountOfSugar = amountOfSugar;
        this.amountOfChoco = amountOfChoco;
        this.amountOfMilk = amountOfMilk;
        this.amountOfFat = amountOfFat;
        this.numOfPicese = numOfPicese;
        this.protein = protein;
        this.Carbohydrates = Carbohydrates;
        this.DietaryFiber = DietaryFiber;
    }

    /**
     *
     * @param productnum
     */
    public void setProductnum(int productnum) {
        this.productnum = productnum;
    }

    /**
     *
     * @param productionDate
     */
    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    /**
     *
     * @param amountOfSugar
     */
    public void setAmountOfSugar(double amountOfSugar) {
        this.amountOfSugar = amountOfSugar;
    }

    /**
     *
     * @param amountOfChoco
     */
    public void setAmountOfChoco(double amountOfChoco) {
        this.amountOfChoco = amountOfChoco;
    }

    /**
     *
     * @param amountOfMilk
     */
    public void setAmountOfMilk(double amountOfMilk) {
        this.amountOfMilk = amountOfMilk;
    }

    /**
     *
     * @param amountOfFat
     */
    public void setAmountOfFat(double amountOfFat) {
        this.amountOfFat = amountOfFat;
    }

    /**
     *
     * @param numOfPicese
     */
    public void setNumOfPicese(int numOfPicese) {
        this.numOfPicese = numOfPicese;
    }

    /**
     *
     * @param protein
     */
    public void setProtein(double protein) {
        this.protein = protein;
    }

    /**
     *
     * @param Carbohydrates
     */
    public void setCarbohydrates(double Carbohydrates) {
        this.Carbohydrates = Carbohydrates;
    }

    /**
     *
     * @param DietaryFiber
     */
    public void setDietaryFiber(double DietaryFiber) {
        this.DietaryFiber = DietaryFiber;
    }

    /**
     *
     * @return productnum
     */
    public int getProductnum() {
        return productnum;
    }

    /**
     *
     * @return productionDate
     */
    public Date getProductionDate() {
        return productionDate;
    }

    /**
     *
     * @return amountOfSugar
     */
    public double getAmountOfSugar() {
        return amountOfSugar;
    }

    /**
     *
     * @return amountOfChoco
     */
    public double getAmountOfChoco() {
        return amountOfChoco;
    }

    /**
     *
     * @return amountOfMilk
     */
    public double getAmountOfMilk() {
        return amountOfMilk;
    }

    /**
     *
     * @return amountOfFat
     */
    public double getAmountOfFat() {
        return amountOfFat;
    }

    /**
     *
     * @return numOfPicese
     */
    public int getNumOfPicese() {
        return numOfPicese;
    }

    /**
     *
     * @return protein
     */
    public double getProtein() {
        return protein;
    }

    /**
     *
     * @return Carbohydrates
     */
    public double getCarbohydrates() {
        return Carbohydrates;
    }

    /**
     *
     * @return DietaryFiber
     */
    public double getDietaryFiber() {
        return DietaryFiber;
    }

    /**
     *
     * @return theExpiryDate
     */
    public int theExpiryDate() {

        return (productionDate.productionYear + 2);

    }

    /**
     *
     * @return calculateCalories
     */
    public double calculateCalories() {
        return ((protein * 4) + (amountOfFat * 9) + ((Carbohydrates - DietaryFiber) * 4));
    }

    /**
     *
     * @return price
     */
    abstract double price();

    /**
     *
     * @return benfitsOfChocolate
     */
    abstract String benfitsOfChocolate();

    @Override
    public String toString() {
        return "productnum=" + productnum + ", productionDate=" + productionDate + ", amountOfSugar=" + amountOfSugar + ", amountOfChoco=" + amountOfChoco + ", amountOfMilk=" + amountOfMilk + ", amountOfFat=" + amountOfFat + ", numOfPicese=" + numOfPicese + ", protein=" + protein + ", Carbohydrates=" + Carbohydrates + ", DietaryFiber=" + DietaryFiber ;
    }

}
