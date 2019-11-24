//package ru.imitation.culturemap.model;
//
//import lombok.Data;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Data
//@Entity(name = "Person")
//@Table(name = "persons")
//public class Person {
//    @Id
//    @Column(name = "id")
//    private String id;
//
//    @Column(name = "firstname")
//    private String firstname;
//
//    @Column(name = "lastname")
//    private String lastname;
//
//    @Column(name = "pseudonym")
//    private String pseudonym;
//
//    @Column(name = "profession")
//    private String profession;
//
//    @Column(name = "description")
//    private String description;
//
//    @Column(name = "birthdate")
//    private String birthdate;
//
//    @Column(name = "deathdate")
//    private String deathdate;
//
//
//    public Person(String id, String firstname, String lastname, String pseudonym, String profession, String description, String birthdate, String deathdate) {
//        this.id = id;
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.pseudonym = pseudonym;
//        this.profession = profession;
//        this.description = description;
//        this.birthdate = birthdate;
//        this.deathdate = deathdate;
//    }
//
//    public String getBirthdate() {
//        return birthdate;
//    }
//
//    public String getDeathdate() {
//        return deathdate;
//    }
//
//    public String getPseudonym() {
//        return pseudonym;
//    }
//
//    public String getProfession() {
//        return profession;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//}
