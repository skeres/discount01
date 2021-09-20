package com.sks.discount01.model;

import com.sks.discount01.utils.Constants;

import javax.persistence.*;
import java.text.NumberFormat;

/**
 * Abstract Class of components : Product and Discounts
 */
@MappedSuperclass
public abstract class Component {

    @Id
    private int id;

    @Column(name = "nom")
    private String name;

    @Column(name = "prix")
    private double price;


    ///// Constructors
    public Component(){};

    public Component (String name, Double price, int id) {
        this.setName(name);
        this.setPrice(price);
        this.setId(id);
    }


    ///// getters
    public String getName() { return name;  }
    public double getPrice() { return price; };
    public int getId() { return id; };


    ///// setters
    private void setName(String name) { this.name = name; }
    private void setPrice(double price) { this.price = price; }
    private void setId(int id) { this.id = id; }

    /**
     *
     * @return String to display attributes
     */
    public String displayDetails() {
        NumberFormat format=NumberFormat.getInstance();
        format.setMinimumFractionDigits(Constants.MAX_DIGIT);
        return this.id+Constants.TAB+this.name+Constants.SEPARATOR+format.format(getPrice())+"€";
    }

}
