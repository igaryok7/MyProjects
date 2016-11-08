package ua.lviv.lgs.entity;

import javax.persistence.*;
import java.util.List;


@Entity
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String  LastName;
    @Column
    private String FirstName;
    @Column
    private int age;
    @Column
    private String email;
    @Column
    private String password;
    @OneToMany (fetch = FetchType.LAZY)
    private List<Barrings> barringsList;


    public User(){

    }

    public User(String Lastname, String FirstName, int age, String email, String password){
        this.LastName = Lastname;
        this.FirstName=FirstName;
        this.age=age;
        this.email=email;
        this.password=password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return email;
    }

    public void setUserName(String email) {
        email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", LastName='" + LastName + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", age=" + age +
                ", UserName='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
