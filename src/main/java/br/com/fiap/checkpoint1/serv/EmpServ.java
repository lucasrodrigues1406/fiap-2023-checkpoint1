package br.com.fiap.checkpoint1.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint1.banco.Empregado;
import br.com.fiap.checkpoint1.repository.EmpRespository;

@Service
public class EmpServ {

	
	@Autowired
	EmpRespository empRep;
	
	public List<Empregado> get(){
		return empRep.findAll();
	}
	
	public Empregado put(Empregado empr) {
		return empRep.save(empr);
	}
	
	public Empregado post(Empregado empr) {
		return empRep.save(empr);
	}
}
