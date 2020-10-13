package com.uguraytekin.customerservice.api.controller;

import com.uguraytekin.customerservice.api.models.request.SaveCustomerRequest;
import com.uguraytekin.customerservice.api.models.response.SaveCustomerResponse;
import com.uguraytekin.customerservice.api.service.CustomerService;
import javassist.NotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;
    private final ModelMapper modelMapper;

    public CustomerController(CustomerService customerService, ModelMapper modelMapper) {
        this.customerService = customerService;
        this.modelMapper = modelMapper;
    }

    @PostMapping("/saveCustomer")
    public ResponseEntity<SaveCustomerResponse> saveCustomer(@Valid @RequestBody SaveCustomerRequest request) {
        return ResponseEntity.ok(modelMapper.map(customerService.saveCustomer(request), SaveCustomerResponse.class));
    }

    @GetMapping("/getCustomerById/{id}")
    public ResponseEntity<SaveCustomerResponse> getCustomerById(@PathVariable Integer id) throws NotFoundException {
        return ResponseEntity.ok(modelMapper.map(customerService.getCustomerById(id), SaveCustomerResponse.class));
    }
}
