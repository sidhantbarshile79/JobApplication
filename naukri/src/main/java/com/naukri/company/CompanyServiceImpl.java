package com.naukri.company;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService{

    private CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public boolean updateCompany(Company company, Long id) {
        return false;
    }

    @Override
    public void createCompany(Company company) {

    }

    @Override
    public boolean deleteCompanyById(Long id) {
        return false;
    }

    @Override
    public Company getCompanyById(Long id) {
        return null;
    }
}
