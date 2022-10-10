/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.newback.ap.service;

import com.newback.ap.dto.dtoPersona;
import com.newback.ap.entity.Persona;
import com.newback.ap.repository.RPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class SPersona implements dtoPersona  {
    @Autowired RPersona rPersona;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = rPersona.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        rPersona.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
         rPersona.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
       Persona persona = rPersona.findById(id).orElse(null);
       return persona;
    }

    
    
}
