package com.micorserve.student.microservice_student.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Crea los metodos getter y setter, toString, hashCode y equals para todos los atributos
@Entity // Se vinculará oo se convertira en una tabla de base de datos.
@Builder // Permite que uses el patrón Builder para crear instancias de la clase.
@Table(name = "student") // Especifica el nombre que llevará esta tabla en la base de datos.
@AllArgsConstructor // Crea un constructor con todos los atributos
@NoArgsConstructor // Crea un constructor vacio
public class Student {

    @Id // Marca el atributo como la clave primaria de la tabla.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica como se genera los valores de la clave primaria
    // GenerationType.IDENTITY --> La base de datos es la responsable de generar el valor de la clave primaria.
    private Long id;

    private String name;
    private String lastname;

    // Para establecer la relación con los courses
    @Column(name = "course_id") // Indica cómo se mapeará este atributo a una columna específica en la tabla
    private Long courseId;
}

