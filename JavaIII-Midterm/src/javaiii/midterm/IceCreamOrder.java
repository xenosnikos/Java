
package javaiii.midterm;

import java.util.ArrayList;
import java.util.Date;


public class IceCreamOrder {

    public IceCreamOrder(String name, Date delivDate, ArrayList flavList) {
        setName(name);
        setDelivDate(delivDate);
        setFlavList(flavList);
    }
    public IceCreamOrder(String fileInsert) {
        setName(name);
        setDelivDate(delivDate);
        setFlavList(flavList);
    }
  
    
    String name;
    Date delivDate;
    ArrayList<Flavour> flavList= new ArrayList<>();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDelivDate() {
        return delivDate;
    }

    public void setDelivDate(Date delivDate) {
        this.delivDate = delivDate;
    }

    public ArrayList<Flavour> getFlavList() {
        return flavList;
    }

    public void setFlavList(ArrayList<Flavour> flavList) {
        this.flavList = flavList;
    }
    
    

    enum Flavour{
        VANILLA, CHOCOLATE,STRAWBERRY,ROCKYROAD
    }
    
    
    
}
