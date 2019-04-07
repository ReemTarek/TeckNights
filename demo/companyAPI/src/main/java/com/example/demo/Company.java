package com.example.demo;


import javax.persistence.*;
import java.util.Set;


import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="model.Company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @Column(name = "C_Name", nullable = false)
    private String C_Name;

    @Column(name = "address", nullable = false)
    private String address;


    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "pass", nullable = false)
    private String pass;

    @Column(name = "Jobs", nullable = false)
    private String Jobs;

   /* @Column(name = "created_at", nullable = false)
    @CreatedDate
    private Date createdAt;
    @Column(name = "created_by", nullable = false)
    @CreatedBy
    private String createdBy;
    @Column(name = "updated_at", nullable = false)
    @LastModifiedDate
    private Date updatedAt;
    @Column(name = "updated_by", nullable = false)
    @LastModifiedBy
    private String updatedBy;*/

    /**
     * Gets id.
     *
     * @return the id
     */
    public long getId() {
        return id;
    }

    public String getJobs() {
        return Jobs;
    }

    public void setJobs(String jobs) {
        Jobs = jobs;
    }

    public String getC_Name() {
        return C_Name;
    }

    public void setC_Name(String c_Name) {
        C_Name = c_Name;
    }

    public String getPassword() {
        return pass;
    }

    public void setPassword(String password) {
        this.pass = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(long id) {
        this.id = id;
    }


}


