
package com.portfolio.backendportfolio.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LoginResponse {
    private boolean IsUser;

    public LoginResponse() {
    }

    public LoginResponse(boolean IsUser) {
        this.IsUser = IsUser;
    }
    
}
