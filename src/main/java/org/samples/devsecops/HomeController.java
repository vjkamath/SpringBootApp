package org.samples.devsecops;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class HomeController {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private CustomerDao customerDao;

    @GetMapping("/")
    public List<Customer> customers() {
        List<Customer> customers = customerDao.findAll();
        customers.forEach(c -> logger.info("Found a customer: {}"));
        return customers;
    }

}
