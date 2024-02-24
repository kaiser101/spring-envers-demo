package com.example.demo.entity

import jakarta.persistence.*
import org.hibernate.envers.Audited
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate

@Audited
@Entity
@Table(name = "person")
public class Person {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private Character gender;

    @Column
    private int age;

    @Column(name = "created_date", nullable = false, updatable = false)
    @CreatedDate
    private Date createdDate;

    @Column(name = "modified_date")
    @LastModifiedDate
    private Date modifiedDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "modified_by")
    private String modifiedBy;

    //getters and setters

    Long getId() {
        return id
    }

    void setId(Long id) {
        this.id = id
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    Character getGender() {
        return gender
    }

    void setGender(Character gender) {
        this.gender = gender
    }

    int getAge() {
        return age
    }

    void setAge(int age) {
        this.age = age
    }

    Date getCreatedDate() {
        return createdDate
    }

    void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate
    }

    Date getModifiedDate() {
        return modifiedDate
    }

    void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate
    }

    String getCreatedBy() {
        return createdBy
    }

    void setCreatedBy(String createdBy) {
        this.createdBy = createdBy
    }

    String getModifiedBy() {
        return modifiedBy
    }

    void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy
    }
}
