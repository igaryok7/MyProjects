package ua.lviv.lgs.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Igaryok on 30.06.2016.
 */
@Entity
public class Products {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String Brand;
    @OneToMany (fetch = FetchType.LAZY, mappedBy = "Products")
    private List<Models> modelslist;

    public Products(){

    }

    public Products(String Brand){
        this.Brand=Brand;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

}
