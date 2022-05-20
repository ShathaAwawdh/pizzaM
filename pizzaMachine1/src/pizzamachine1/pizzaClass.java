/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzamachine1;
//import java.util.ArrayList;



/**
 *
 * @author hp
 */
public class pizzaClass {

    private pan pan;
    private dough dough;
  //  static ArrayList<ingredient> ingredientArr=new ArrayList<>();
    
    //public static void topEngredient(){
        
   private  ingredient mozzarella1=new ingredient("mozzarella",10);
    // ingredientArr.add(mozzarella);
   private  ingredient tomatoes1 =new ingredient("tomatoes",5);
      //ingredientArr.add(tomatoes);
   private  ingredient garlic1 =new ingredient("garlic",1000);
        //ingredientArr.add(garlic);
   private  ingredient onion1=new ingredient("onion",1000);
    //  ingredientArr.add(onion);
   private  ingredient sauce1=new ingredient("sauce",1000);
     // ingredientArr.add(sauce);
   private  ingredient oregano1=new ingredient("oregano",1000);
     // ingredientArr.add(oregano);
   private  ingredient chicken1=new ingredient("chicken",1000);
     // ingredientArr.add(chicken);
   private  ingredient meat1 =new ingredient("meat",1000);
     // ingredientArr.add(meat);
   private  ingredient peppirone1 =new ingredient("peppirone",1000);
     // ingredientArr.add(peppirone);
    //}

    public ingredient getMozzarella1() {
        return mozzarella1;
    }

    public ingredient getTomatoes1() {
        return tomatoes1;
    }

    public ingredient getGarlic1() {
        return garlic1;
    }

    public ingredient getOnion1() {
        return onion1;
    }

    public ingredient getSauce1() {
        return sauce1;
    }

    public ingredient getOregano1() {
        return oregano1;
    }

    public ingredient getChicken1() {
        return chicken1;
    }

    public ingredient getMeat1() {
        return meat1;
    }

    public ingredient getPeppirone1() {
        return peppirone1;
    }

    
     
    public pizzaClass() {
        
    }

    public pizzaClass(pan pan, dough dough) {
   
        this.pan = pan;
        this.dough = dough;
    }

    public pizzaClass(dough dough) {
        this.dough = dough;
    }
    
    
    public dough getDough() {
        return dough;
    }

    public pan getPan() {
        return pan;
    }

    public void addEngredient(){
        
    }

    public String pizzaFinal(double engCal,int engWeight,int numOfSlice){
        
        return "Total Weight in your pizza="+(engWeight+dough.getWeight())+"gram"+
                "\nTotal Calories in your pizza="+(engCal+dough.getDoughCal())+"calorie"+
                "\nCalories in each slice="+((engCal+dough.getDoughCal())/numOfSlice)+"calorie";
    }
}
