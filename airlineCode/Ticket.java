/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlineCode;

/**
 *
 * @author mia
 */
public class Ticket {
    private String toPlace;
    private String fromPlace;
    private double price;
    private String gate;
    
    void setToPlace(String place){
        this.toPlace = place;
    }
    
    String getToPlace(){
        return toPlace;
    }
    
    void setFromPlace(String place){
        this.fromPlace = place;
    }
    
    String setFromPlace(){
        return fromPlace;
    }
    
    void setPrice(double price_){
        this.price = price_;
    }
    
    double getPrice(){
        return price;
    }
    
    void setGate(String gate_){
        this.gate = gate_;
    }
    
    String getGate(){
        return gate;
    }
}
