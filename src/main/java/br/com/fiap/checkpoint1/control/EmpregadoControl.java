package br.com.fiap.checkpoint1.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint1.banco.Empregado;
import br.com.fiap.checkpoint1.serv.EmpServ;

//talvez seja isso


@RestController
@RequestMapping("/empregados")

public class EmpregadoControl {

	@Autowired
	EmpServ empServi;
	
	@GetMapping
	public List<Empregado> get(){
		return empServi.get();
	}
	
	@PutMapping
	public Empregado put(Empregado empr) {
		return empServi.put(empr);
	}
	
	@PostMapping
	public Empregado post(Empregado empr) {
		return empServi.post(empr);
	}

}
