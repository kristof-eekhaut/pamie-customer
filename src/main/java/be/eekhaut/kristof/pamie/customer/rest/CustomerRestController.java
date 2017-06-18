package be.eekhaut.kristof.pamie.customer.rest;

import be.eekhaut.kristof.pamie.customer.domain.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customers")
public class CustomerRestController {

    @RequestMapping("/{customerId}")
    public Customer getCustomer(String customerId) {
        return Customer.CUSTOMER;
    }
}
