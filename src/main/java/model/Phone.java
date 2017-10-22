package model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: d.marynych
 * Date: 09.10.17
 * Time: 19:27
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "phones")
public class Phone implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Phone() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Pattern(regexp = "^[А-Я-Ё][а-я-ё]{1,}$")
    @Column(name = "name")
    private String name;

    @Pattern(regexp = "^([+][0-9]{11,12})([,][+][0-9]{11,12})*$")
    @Column(name = "phone")
    private String phone;

}
