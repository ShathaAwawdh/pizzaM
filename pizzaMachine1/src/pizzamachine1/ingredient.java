/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzamachine1;

/**
 *
 * @author hp
 */
public class ingredient {
    private String name;
    private int weight;
    private double amountOfcalories;

    
    public ingredient(String name,int weight) {
       this.name = name;
       this.weight = weight;
    }
    
    public static void decrease (int InitialWeight,int i,String name) throws quantityOutException1{
        InitialWeight=InitialWeight-i;
        if(InitialWeight<i){
            throw new quantityOutException1(name+"has expired, please refill");
        }
    }
            
    
    public ingredient(String name, int weight, double amountOfcalories) {
        this.name = name;
        this.weight = weight;
        this.amountOfcalories = amountOfcalories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getAmountOfcalories() {
        return amountOfcalories;
    }

    public void setAmountOfcalories(double amountOfcalories) {
        this.amountOfcalories = amountOfcalories;
    }

    
    public String getInfo() {
        return "ingredient:\n" + "name:" + name + "\nweight=" + weight + "\n amountOfcalories=" + amountOfcalories;
    }
    
    
}
