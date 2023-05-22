/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uwilljo
 */
public class ShoppingCart implements java.io.Serializable {
    private String pdt;
    private String model;
    private int size;
    private int quantity;
    private double price;

    public ShoppingCart(String pdt, String Model, int size, int quantity, double price) {
        this.pdt = pdt;
        this.model = Model;
        this.price =price;
        this.quantity = quantity;
        this.size = size;
    }

    public String getPdt() {
        return pdt;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
