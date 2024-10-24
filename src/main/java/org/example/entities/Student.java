package org.example.entities;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Student")
public class Student {
    private int id;
    private String nom;
    private String prenom;
    private Genre genre;

    // Constructeur sans argument (constructeur par défaut)
    public Student() {
    }

    // Constructeur avec arguments
    public Student(int id, String nom, String prenom, Genre genre) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
    }

    // Getters et Setters avec Annotations JAXB
    @XmlElement
    public int getId() {
        return id;
    }

    @XmlElement
    public String getNom() {
        return nom;
    }

    @XmlElement
    public String getPrenom() {
        return prenom;
    }

    @XmlElement
    public Genre getGenre() {
        return genre;
    }
}
