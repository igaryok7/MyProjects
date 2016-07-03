package ua.lviv.lgs.entity;

import javax.persistence.*;

/**
 * Created by Igaryok on 30.06.2016.
 */
@Entity
public class Specification {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String display;
    @Column
    private int expansion;
    @Column
    private String procesor;
    @Column
    private int camera;
    @Column
    private String  country;

    public Specification(){

    }

    public Specification(String display, int expansion, String procesor, int camera, String country){
        this.display=display;
        this.expansion=expansion;
        this.procesor=procesor;
        this.camera=camera;
        this.country=country;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public int getExpansion() {
        return expansion;
    }

    public void setExpansion(int expansion) {
        this.expansion = expansion;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }


}
