package com.micorserve.course.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Crea los metodos getter y setter, toString, hashCode y equals para todos los atributos
@Entity // Se vinculará oo se convertira en una tabla de base de datos.
@Builder // Permite que uses el patrón Builder para crear instancias de la clase.
@Table(name = "course") // Especifica el nombre que llevará esta tabla en la base de datos.
@AllArgsConstructor // Crea un constructor con todos los atributos
@NoArgsConstructor // Crea un constructor vacio
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String teacher;


}
