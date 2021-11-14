package tn.esprit.spring.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.repository.EmployeRepository;

@Service
public class EmployeServiceImpl implements IEmployeService {
	
	@Autowired
	EmployeRepository employeRepository;

	private static final Logger L = LogManager.getLogger(EmployeServiceImpl.class);

	@Override
	public List<Employe> retrieveAllEmployes() {
		List<Employe> employes = null; 
		try {
			L.info("In Method retrieveAllEmployes :");
			employes = (List<Employe>) employeRepository.findAll();
			L.debug("Connexion à la BD Ok :");
			
			L.info("Out of Method retrieveAllEmployes with Success");
		}catch (Exception e) {
			L.error("Out of Method retrieveAllEmployes withh Errors :" + e);
		}
		return employes;
	}

	@Override
	public Employe addEmploye(Employe e) {
				L.info("In Method addUSer :");
				Employe u_saved = employeRepository.save(e); 
				L.info("Out of Method addEmploye with Success");
				return u_saved; 
	}

	@Override
	public void deleteEmploye(String id) {
		L.info("In Method deleteEmploye :");
		employeRepository.deleteById(Long.parseLong(id));
		L.info("Out of Method deleteEmploye with Success");				
	}

	@Override
	public Employe updateEmploye(Employe e) {
		
		L.info("In Method updateEmploye :");
		boolean u_saved = employeRepository.existsById(e.getId()); 
		if (u_saved)
		{
			String prenom = e.getPrenom();
			String nom = e.getNom();
			String email = e.getEmail();
			Long idd = e.getId();
			String password = e.getPassword();
			Boolean act = e.isActif();
			Role role = e.getRole();
		e.setNom(prenom);
		e.setPrenom(prenom);
		e.setId(idd);
		e.setEmail(email);
		e.setPassword(password);
		e.setActif(act);
		e.setRole(role);
		}
		Employe u = employeRepository.save(e);
		L.info("Out of Method updateEmploye with Success");
		return u; 
	}

	@Override
	public Employe retrieveEmploye(String id) {
		L.info("In Method retrieveEmployes :");
		Employe u =  employeRepository.findById(Long.parseLong(id)).get(); 
		L.info("Out of Method retrieveEmployes with Success");
		return u; 
	}

}
