package br.com.igor.consumerapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import br.com.igor.consumerapi.request.UsuarioRequest;
import br.com.igor.consumerapi.response.UsuarioResponse;

@RestController
@RequestMapping("/usuarios/{usuario}")
public class GithubController {

	
	@GetMapping
	public ResponseEntity<UsuarioResponse> listaUsuario(@PathVariable("usuario") String usuario) {
		
		String url = "https://api.github.com/users/";
		
		UsuarioRequest request = new UsuarioRequest();
		request.setNome(usuario);
		String endpoint = url+request.getNome();
		
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> jsonResponse = restTemplate.getForEntity(endpoint,String.class);
		
		
		//Converto json em um objeto response Java
		Gson gson = new Gson();
		UsuarioResponse response = gson.fromJson(jsonResponse.getBody(), UsuarioResponse.class);
		
		if(response == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(response);
	}
	
	
}
