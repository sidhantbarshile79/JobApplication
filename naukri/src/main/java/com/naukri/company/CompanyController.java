package com.naukri.company;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController
{
    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    //get all
    @GetMapping
    public ResponseEntity<List<Company>> getAllCompanies()
    {
        return new ResponseEntity<>(companyService.getAllCompanies(), HttpStatus.OK);
    }

    //update company
    @PutMapping("/{id}")
    public ResponseEntity<String> updateCompany(@PathVariable Long id, @RequestBody Company company)
    {
        companyService.createCompany(company);
        return new ResponseEntity<>("Company Updated Successfully...!", HttpStatus.OK);
    }

    //add company
    @PostMapping
    public ResponseEntity<String> addCompany(@RequestBody Company company)
    {
        companyService.createCompany(company);
        return new ResponseEntity<>("Company added successfully...!", HttpStatus.CREATED);
    }

    //delete company
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteJob(@PathVariable Long id)
    {
        boolean deleted = companyService.deleteCompanyById(id);
        if (deleted)
            return new ResponseEntity<>("Company deleted...!", HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    //get any particular company
    @GetMapping("/{id}")
    public ResponseEntity<Company> getCompanyById(@PathVariable Long id)
    {
        Company company = companyService.getCompanyById(id);
        if (company != null){
            return new ResponseEntity<>(company, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(company, HttpStatus.NOT_FOUND);
        }
    }

}
