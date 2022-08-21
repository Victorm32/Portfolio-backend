
package com.portfolio.backendportfolio.service;

import com.portfolio.backendportfolio.model.Persona;
import com.portfolio.backendportfolio.repository.IPersonaRepository;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortfolioService implements IPortfolioService{
    
    @Autowired
    private IPersonaRepository persoRepo;

    @Override
    public Persona login(String user, String password) {
        List<Persona> personas= persoRepo.findAll();
        personas = personas.stream()
                           .filter(p -> p.getUser().equals(user) && p.getPassword().equals(password))
                           .collect(Collectors.toList());
        if(personas.size() > 0){
            return personas.get(0);
        }
        return null;   
    }

    @Override
    public Persona getUser() {
        List<Persona> personas= persoRepo.findAll();
        if(personas.size() > 0){
            return personas.get(0);
        }
        return null;
    }

    @Override
    public void actulizar(Persona pers) {
       List<Persona> per = persoRepo.findAll();
       Persona p = per.get(0);
        p = pers;
       
       persoRepo.save(p);
    }
    
    
    
}
