package com.projectPrimer.rest.Model;

import jakarta.persistence.*;

@Entity
@Table(schema = "Taskcrud")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @Column
    private  String title;
    @Column
    private String descripcion;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
