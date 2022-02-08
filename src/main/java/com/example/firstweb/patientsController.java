package com.example.firstweb;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/hospital/p")

public class patientsController {

	@Autowired
	patientsRepository repo;
	@Autowired
	medicineRepository repo1;
	
	@GetMapping("/patients")
	public List<patients> getAllpatients()
	{
		return repo.findAll();
	}
	@GetMapping("/medicines")
	public List<medicines> getAllmedicines()
	{
		return repo1.findAll();
	}
	@PostMapping("/medicines")
	public medicines createmedicines(@RequestBody medicines p)
	{
		return repo1.save(p);
	}
	@GetMapping("/medicines/{id}")
	public ResponseEntity <medicines> getmedicinesByid(@PathVariable(value="id") String mid)
	
		throws ResourceNotFoundException
		{
			medicines m = repo1.findById(mid).orElseThrow(()-> new ResourceNotFoundException("patient not found with this id :: "+ mid));
			return ResponseEntity.ok().body(m);
		}

	@GetMapping("/patients/{id}")
	public ResponseEntity <patients> getpatientByid(@PathVariable(value="id") String eid)
	
		throws ResourceNotFoundException
		{
			patients pa = repo.findById(eid).orElseThrow(()-> new ResourceNotFoundException("patient not found with this id :: "+ eid));
			return ResponseEntity.ok().body(pa);
		}
	@PutMapping("/medicines/{id}")
	public ResponseEntity<medicines> Updatemedicines(@PathVariable(value="id") String mid,@RequestBody medicines m)
	throws ResourceNotFoundException
	{
		medicines mm=repo1.findById(mid).orElseThrow(()-> new ResourceNotFoundException("patient not found with this id :: "+mid));
		mm.setMED_NAME(m.getMED_NAME() );
		mm.setMED_COMP(m.getMED_COMP());
		mm.setEXP_DATE(m.getEXP_DATE() );
		mm.setMED_COST(m.getMED_COST());
		mm.setCOUNT(m.getCOUNT());
		
		final medicines updatedmedicine= repo1.save(mm);
		return ResponseEntity.ok(updatedmedicine);
		
	}
	@DeleteMapping("/medicines/{id}")
    public Map < String, Boolean > deleteMedicines(@PathVariable(value = "id") String mid)
    throws ResourceNotFoundException {
        medicines m = repo1.findById(mid)
            .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + mid));

        repo1.delete(m);
        Map < String, Boolean > response = new HashMap < > ();
        response.put("deleted", Boolean.TRUE);
        return response;
	}
	
	@PostMapping("/patients")
	public patients createpatients(@RequestBody patients p)
	{
		return repo.save(p);
	}
	
	@PutMapping("/patients/{id}")
	public ResponseEntity<patients> UpdatePatients(@PathVariable(value="id") String eid,@RequestBody patients p)
	throws ResourceNotFoundException
	{
		patients pp=repo.findById(eid).orElseThrow(()-> new ResourceNotFoundException("patient not found with this id :: "+eid));
		pp.setPID(p.getPID());
		pp.setPNAME(p.getPNAME());
		pp.setDISEASE(p.getDISEASE());
		pp.setSEX(p.getSEX());
		pp.setADMIT_STATUS(p.getADMIT_STATUS());
		pp.setAGE(p.getAGE());
		final patients updatedpatient= repo.save(pp);
		return ResponseEntity.ok(updatedpatient);
		
	}
	  @DeleteMapping("/patients/{id}")
	    public Map < String, Boolean > deleteEmployee(@PathVariable(value = "id") String eid)
	    throws ResourceNotFoundException {
	        patients p = repo.findById(eid)
	            .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + eid));

	        repo.delete(p);
	        Map < String, Boolean > response = new HashMap < > ();
	        response.put("deleted", Boolean.TRUE);
	        return response;
	
}}
