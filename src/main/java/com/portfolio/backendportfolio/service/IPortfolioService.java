
package com.portfolio.backendportfolio.service;

import com.portfolio.backendportfolio.model.Persona;


public interface IPortfolioService {
    public Persona login(String user, String password);
    public Persona getUser();
    public void actulizar(Persona pers);
    
}
