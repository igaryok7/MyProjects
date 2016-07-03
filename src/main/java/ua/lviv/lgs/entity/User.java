package ua.lviv.lgs.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Igaryok on 30.06.2016.
 */
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
    private String UserName;
    @Column
    private String password;
    @OneToMany (fetch = FetchType.LAZY, mappedBy = "User")
    private List<Barrings> barringsList;

    public User(){

    }

    public User(String Lastname, String FirstName, int age, String UserName, String password){
        this.LastName = Lastname;
        this.FirstName=FirstName;
        this.age=age;
        this.UserName=UserName;
        this.password=password;
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
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
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
                ", UserName='" + UserName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
