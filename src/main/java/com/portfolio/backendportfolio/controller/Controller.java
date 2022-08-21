package com.portfolio.backendportfolio.controller;

import com.portfolio.backendportfolio.model.LoginResponse;
import com.portfolio.backendportfolio.model.Persona;
import com.portfolio.backendportfolio.service.IPortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private IPortfolioService servPort;
    
    @CrossOrigin()
    @GetMapping("/user/login")
    @ResponseBody
    public LoginResponse login (@RequestParam String user, @RequestParam String password){
          Persona persona = servPort.login(user, password);
          if (persona != null){
              return new LoginResponse(true);
          } 
          return new LoginResponse(false);
    }
    
    @CrossOrigin()
    @GetMapping("/user")
    @ResponseBody
    public Persona getUser(){
        return servPort.getUser();
    }
    
    @CrossOrigin()
    @PutMapping("/user")
    public void actualizar(@RequestBody Persona pers){
        servPort.actulizar(pers);
    }
}
