/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzamachine1;

//import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class mixer {
    
    private dough pizzaDough;
    static int weightDough;
    
    public mixer(){
        this.weightDough=5000;
    }

    public mixer(dough pizzaDough) {
        this.pizzaDough = pizzaDough;
    }

    public dough getPizzaDough() {
        return pizzaDough;
    }
    public void setPizzaDough(dough pizzaDough) {
        this.pizzaDough = pizzaDough;
    }
   
    public void mix(){
        
        
        ingredient oil=new ingredient("oil",257,2268);
        ingredient flour =new ingredient("flour",2394,8721);
        ingredient salt =new ingredient("salt",57,0);
        ingredient sugar=new ingredient("sugar",29,143);
        ingredient yeast=new ingredient("yeast",171,114);
        ingredient water=new ingredient("water",1995,0);
        
        ingredient [] doughIng={oil,flour,salt,sugar,yeast,water};
       
    }
    
    public static void decDough(int i) throws quantityOutException {
        
       
        
       if(weightDough<i){
           
            throw new quantityOutException("The dough has expaired, please supply the ingredients");
         
       } else{
            weightDough = weightDough- i;
       }
               
   }
}
