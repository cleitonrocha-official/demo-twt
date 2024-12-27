package br.com.twt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.twt.entity.Benefit;
import br.com.twt.repository.BenefitRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BenefitService {

	private final BenefitRepository repository;
	
	public List<Benefit> findAll() {
		return repository.findAll();
	}

	public Benefit create(Benefit benefit) {
		return repository.save(benefit);
	}

	public Benefit desactivate(String id) {
		return repository.findById(id).orElseThrow();
	}

	public Benefit activate(String id) {
//		// TODO Auto-generated method stub
//		 repository.f;
//		 
//		 
//		 
		 return null;
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
