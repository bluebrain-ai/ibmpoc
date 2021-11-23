package com.ibm.poc.demo;

import com.ibm.poc.demo.repository.GenAccount;
import com.ibm.poc.demo.repository.IgenerateAccountRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController

@RequestMapping("/gena")
@ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 400, message = "This is a bad request, please follow the API documentation for the proper request format"),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Due to security constraints, your access request cannot be authorized"),
        @io.swagger.annotations.ApiResponse(code = 500, message = "The server/Application is down. Please contact support team.") })
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class GenerateAccountController {
    private IgenerateAccountRepository genAccountRepo;

    @GetMapping(value = "/genacustnum")
    public ResponseEntity<Long> GenerateAccount() {

        GenAccount genAccount = genAccountRepo.saveAndFlush(null);
        genAccount.getCustomerNumer();

        return new ResponseEntity<>(genAccount.getCustomerNumer(), HttpStatus.OK);

    }
}
