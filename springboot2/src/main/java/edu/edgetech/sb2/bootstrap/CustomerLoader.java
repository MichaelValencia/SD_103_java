package edu.edgetech.sb2.bootstrap;

import edu.edgetech.sb2.domain.Customer;
import edu.edgetech.sb2.domain.Product;
import edu.edgetech.sb2.services.CustomerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class CustomerLoader implements ApplicationListener<ContextRefreshedEvent> {
        @Autowired
    private CustomerService CustomerService;

    private static final Logger log = LogManager.getLogger(CustomerLoader.class);

    /*
     *		 onApplicationEvent
     *			This method will be called when the application gets loaded
     *			It is a handler for the start up event
     */
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        //	see down below we have a small method to create Products for us
        createCustomer("michael","irving, tx","9728986087");
    }

    private void createCustomer(String name, String address, String phoneNum) {
        Customer customer;
        customer = new Customer(name,address, phoneNum);
        CustomerService.savecustomer(customer);
        log.info(customer);

    }
}
