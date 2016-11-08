package ua.lviv.lgs.entity;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;


@Entity
public class Barrings {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String model;
    @Column
    private String payment;
    @ManyToOne (fetch = FetchType.LAZY)
    private User user;

    public Barrings(){

    }

    public Barrings(String model, String payment){
        this.model=model;
        this.payment=payment;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
}
