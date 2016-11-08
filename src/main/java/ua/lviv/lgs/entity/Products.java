package ua.lviv.lgs.entity;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;
import java.util.List;


@Entity
public class Products {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String Brand;
    @OneToMany (fetch = FetchType.EAGER, mappedBy = "products")
    private List<Models> modelslist;


    public Products(){

    }

    public Products(String Brand){
        this.Brand=Brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public List<Models> getModelslist() {
        return modelslist;
    }

    public void setModelslist(List<Models> modelslist) {
        this.modelslist = modelslist;
    }


    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", Brand='" + Brand + '\'' +
                '}';
    }
}
