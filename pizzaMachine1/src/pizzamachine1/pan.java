/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzamachine1;

/**
 *
 * @author hp
 */
public class pan {
    
    private String size;

    public pan(String size) {
        this.size = size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    
    public String getInfo() {
        return "pan " + "size:" + size;
    }
    
    
}
