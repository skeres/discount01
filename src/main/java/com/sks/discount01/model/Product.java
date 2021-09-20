package com.sks.discount01.model;


import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * create a simple product
 */
@Entity
@Table(name = "table_product")
public class Product extends Component {

    public Product(){

    }

    public Product(String name, Double price, int id, String productName){
        super(name,price, id);
    }


}
