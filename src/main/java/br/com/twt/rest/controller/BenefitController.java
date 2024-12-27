package br.com.twt.rest.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.twt.entity.Benefit;
import br.com.twt.service.BenefitService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/benefits")
@AllArgsConstructor
public class BenefitController {
	
	
	  private final BenefitService benefitService;

	    @GetMapping
	    public ResponseEntity<List<Benefit>> findAll() {
	        List<Benefit> benefits = benefitService.findAll();
	        return ResponseEntity.ok(benefits);
	    }

	    @PostMapping
	    public ResponseEntity<Benefit> create(@RequestBody Benefit benefit) {
	        Benefit createdBenefit = benefitService.create(benefit);
	        return ResponseEntity.status(HttpStatus.CREATED).body(createdBenefit);
	    }

	    @PutMapping("/{id}/deactivate")
	    public ResponseEntity<Benefit> deactivate(@PathVariable String id) {
	        Benefit updatedBenefit = benefitService.desactivate(id);
	        return ResponseEntity.ok(updatedBenefit);
	    }

	    @PutMapping("/{id}/activate")
	    public ResponseEntity<Benefit> activate(@PathVariable String id) {
	        Benefit updatedBenefit = benefitService.activate(id);
	        return ResponseEntity.ok(updatedBenefit);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> delete(@PathVariable String id) {
	        benefitService.delete(id);
	        return ResponseEntity.noContent().build();
	    }

}
