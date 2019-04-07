package com.example.demo;



import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.CompanyRepository;
import repository.UserRepository;

import javax.validation.Valid;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    @Autowired
    private CompanyRepository companyRepository;

    /**
     * Get all users list.
     *
     * @return the list
     */
    @GetMapping("/company")
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    /**
     * Gets users by id.
     *
     * @return the users by id
     * @throws ResourceNotFoundException the resource not found exception
     */
    @GetMapping("/comapany/{id}")
    public ResponseEntity<Company> getUsersById()
            throws ResourceNotFoundException {
        return getUsersById();
    }

    /**
     * Gets users by id.
     *
     * @param companyId the user id
     * @return the users by id
     * @throws ResourceNotFoundException the resource not found exception
     */
    @GetMapping("/comapany/{id}")
    public ResponseEntity<Company> getUsersById(@PathVariable(value = "id") Long companyId)
            throws ResourceNotFoundException {
        Company company =
                companyRepository
                        .findById(companyId)
                        .orElseThrow(() -> new ResourceNotFoundException("User not found on :: " + companyId));
        return ResponseEntity.ok().body(company);
    }

    /**
     * Create company company.
     *
     * @param company the company
     * @return the company
     */
    @PostMapping("/company")
    public Company createCompany(@Valid @RequestBody Company company) {
        return companyRepository.save(company);
    }

    /**
     * Update company response entity.
     *
     * @param CompanyName   the company id
     * @param userDetails the company details
     * @return the response entity
     * @throws ResourceNotFoundException the resource not found exception
     */
    @PutMapping("/company/{id}")
    public ResponseEntity<Company> updateUser(
            @PathVariable(value = "id") Long CompanyName, @Valid @RequestBody Company userDetails)
            throws ResourceNotFoundException {
        Company company =
                companyRepository
                        .findById(companyId)
                        .orElseThrow(() -> new ResourceNotFoundException("User not found on :: " + companyId));
        company.setAddress(userDetails.getAddress());
        company.setDescription(userDetails.getDescription());
        company.setPassword(userDetails.getPassword());
        company.setJobs(userDetails.getJobs());


        final Company updatedUser = companyRepository.save(company);
        return ResponseEntity.ok(updatedUser);
    }

    /**
     * Delete user map.
     *
     * @param companyId the user id
     * @return response
     * @throws Exception the exception
     */
    @DeleteMapping("/company/{id}")
    public boolean deleteUser(@PathVariable(value = "id") Long companyId) throws Exception {
        Company company =
                companyRepository
                        .findById(companyId)
                        .orElseThrow(() -> new ResourceNotFoundException("User not found on :: " + companyId));
        companyRepository.delete(company);
        Boolean response = true;
        return response;
    }
}



