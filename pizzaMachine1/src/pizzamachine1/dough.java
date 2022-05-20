/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzamachine1;

/**
 *
 * @author hp
 */
public class dough {
   private String size;
   private int weight;
   private String thikness;
   private double doughCal;

    public dough() {
    }
   
    public dough(String size, int weight, String thikness) {
        this.size = size;
        this.weight = weight;
        this.thikness = thikness;
    }

    public double getDoughCal() {
        return weight*2.5;
    }
    
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getThikness() {
        return thikness;
    }

    public void setThikness(String thikness) {
        this.thikness = thikness;
    }

    public String getInfo() {
        return "dough\n" + "size:" + size + "\nweight=" + weight + "\nthikness:" + thikness;
    }
   
   
}
