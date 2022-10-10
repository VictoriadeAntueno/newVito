/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.newback.ap.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Usuario
 */
@Getter
@Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 80, message = "no cumple con requisito")
    private String nombre;

    @NotNull
    @Size(min = 1, max = 80, message = "no cumple con requisito")
    private String apellido;

    @Size(min = 1, max = 800, message = "no cumple con requisito")
    private String img;
    
    @Size(min = 1, max = 8000, message = "no cumple con requisito")
    private String prof;
}