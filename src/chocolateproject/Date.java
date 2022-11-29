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
public class Date {
    public int productionYear;

    public Date() {
        productionYear = 0;
    }

    /**
     *
     * @param productionYear
     */
    public Date(int productionYear) {
        this.productionYear = productionYear;
    }

    /**
     *
     * @param productionYear
     */
    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    /**
     *
     * @return productionYear
     */
    public int getProductionYear() {
        return productionYear;
    }

    /**
     *
     * @param obj
     * @return true or false
     */
    @Override
    public boolean equals(Object obj) {
        Date o=(Date)obj;
        return (this.productionYear == o.productionYear);
       
    }

    @Override
    public String toString() {
        return  "productionYear=" + productionYear ;
    }

}
