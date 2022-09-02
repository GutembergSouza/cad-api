package com.devg.cadcli.security;

import lombok.Data;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Data
public class JWTObject {
    private String subject; //nome do usuario
    private Date issuedAt; //data de criação do token
    private Date expiration; // data de expiração do token
    private List<String> roles; //perfis de acesso

    public void setRoles(List roles){
        this.roles = roles;
    }
}
