package br.com.ecommerce.controller;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecommerce.modelo.Usuario;
import br.com.ecommerce.modelo.UsuarioJSON;
import br.com.ecommerce.service.LoginService;

@Controller
@RestController
@EnableAutoConfiguration
@CrossOrigin("http://localhost:4200")
@RequestMapping(path = "/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@CrossOrigin("http://localhost:4200")
	@RequestMapping(path = "/user/verify", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Response login(String usuario) {
		/*Usuario usuarioBD = loginService.login(usuario);
		if (usuarioBD == null) {
			return Response.status(Status.UNAUTHORIZED).build();
		}
		return Response.ok(usuarioBD).build();*/
		return Response.status(Status.OK).build();
		
	}

}