package br.com.projeto.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.model.Client;
import br.com.projeto.repository.ClientRepository;

@RestController
@CrossOrigin(origins = "*")
public class Controller {

	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping("/")
	public Iterable<Client> clientList(){
		return clientRepository.findAll();
	}
	
	@PostMapping("/")
	public Client register(@RequestBody Client client) {
		return clientRepository.save(client);
	}
	
	@PutMapping("/")
	public Client edit(@RequestBody Client client) {
		return clientRepository.save(client);
	}
	
	@DeleteMapping("/{id}")
	public void remove(@PathVariable Long id) {
		clientRepository.deleteById(id);
		
	}
}