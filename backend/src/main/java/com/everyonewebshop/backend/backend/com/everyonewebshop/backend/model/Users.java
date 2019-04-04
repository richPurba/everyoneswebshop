package com.everyonewebshop.backend.backend.com.everyonewebshop.backend.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="Users_details")
public class Users extends AbstractModel{



    private String name;
    private String address;

    @NotBlank
    @Column
    private String email;

    @Id
    private Long uuid;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }
}
