package com.proyectointegrador.TamyOshiro.Security.jwt;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public abstract class JwtEntryPoint implements AuthenticationEntryPoint{
    private final static Logger logger = LoggerFactory.getLogger(JwtEntryPoint.class);
    
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException{
        logger.error("Falló al metodo commence");
        response.sendError (HttpServletResponse.SC_UNAUTHORIZED);
    }    
}