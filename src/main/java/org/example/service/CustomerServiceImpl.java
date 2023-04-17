package org.example.service;
import org.example.dto.CustomerDTO;
import org.example.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{
 private CustomerRepository customerRepository;

 public CustomerServiceImpl() {

 }
//Setter injection
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void insertCustomer(CustomerDTO customer) {
        customerRepository.addCustomer(customer);
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerRepository.fetchCustomerData();
    }

    @Override
    public CustomerDTO getCustomer(int id) {

        return customerRepository.getCustomer(id);
    }
}
