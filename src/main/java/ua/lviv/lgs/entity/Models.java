package ua.lviv.lgs.entity;

import javax.persistence.*;
import java.util.List;


@Entity
public class Models {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String model;
    @Column
    private int memory;
    @Column
    private int price;
    @ManyToOne (fetch = FetchType.EAGER)
    private Products products;
    @OneToMany (fetch = FetchType.EAGER)
    private List<Specification> speclist;

    public Models(){

    }

    public Models(String model, int memory, int price ){
        this.model=model;
        this.memory=memory;
        this.price=price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Models{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", memory=" + memory +
                ", price=" + price +
                '}';
    }
}


