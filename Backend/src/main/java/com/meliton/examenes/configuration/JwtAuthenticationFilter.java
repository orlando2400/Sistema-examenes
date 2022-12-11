package com.meliton.examenes.configuration;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.ExpiredJwtException;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

	//Inyectamos la clase JwtUtils
	@Autowired
	JwtUtils jwtUtils; 
	@Override
	/*Comprueba la existencia del token y lo desencripta, además si está OK todo lo agrega al contexto de Spring 
	para autorizar la petición que solicite */
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String requestTokenHeader = request.getHeader("Authorization");
		String username = null;
		String jwtToken = null;
		//Todo token tiene inicializa con la palabra "Bearer "
		if(requestTokenHeader != null && requestTokenHeader.startsWith("Bearer ")){
			//Se implementa una lógica para obtener el token sin la palabra "Bearer "
			jwtToken = requestTokenHeader.substring(7);
			try {
				username = this.jwtUtils.extractUsername(jwtToken);
			}
			catch(ExpiredJwtException expiredJwtException){
				System.out.println("El token ha expirado");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Token inválido porque no empiezar con \"Bearer\" ");
		}
		if(username != null && SecurityContextHolder.getContext().getAuthentication()==null) {
			
		}
	}

}
