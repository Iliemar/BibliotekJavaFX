/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableCell;
import javafx.scene.control.TextField;

/**
 *
 * @author Marius
 */
public class TableDemo {
    
    private final SimpleStringProperty Title;
    private final SimpleStringProperty Quality;
    private final SimpleStringProperty Quantity;
    private final SimpleStringProperty Price;
    
    public TableDemo(String name,String antal,String pris,String kvalitet){
        this.Title=new SimpleStringProperty(name);
        this.Quality=new SimpleStringProperty(antal);
        this.Quantity=new SimpleStringProperty(pris);
        this.Price=new SimpleStringProperty(kvalitet);
        
        
    }

    

public String getTitle() 
    {
        return Title.get();
    }

public void setTitle(String n)
    {
        Title.set(n);
    }
     
  

public String getQuantity() 
    {
        return Quantity.get();
    }

public void setQuantity(String a) 
    {
	Quantity.set(a);
    }


    public String getPrice()
    {
        return Price.get();
    }

    public void setPrice(String p) 
    {
    	Price.set(p);
    }
    
    public String getQuality()
    {
        return Quality.get();
    }
    public void setQuality(String i)
    {
    	Quality.set(i);
    }
     
       public String toString() {
        return (Quality.get() + " " + Quantity.get()+" "+Title.get() + " " + Price.get());
                
                }
    

    }
