package io.confluent;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.function.aws.MicronautRequestHandler;
import java.util.UUID;

@Introspected
public class CustomerRequestHandler extends MicronautRequestHandler<Customer, CustomerSaved> {

    @Override
    public CustomerSaved execute(Customer input) {
        CustomerSaved customerSaved = new CustomerSaved();
        customerSaved.setFirstName(input.getFirstName());
        customerSaved.setLastName(input.getLastName());
        customerSaved.setEmail(input.getEmail());
        customerSaved.setCustomerId(UUID.randomUUID().toString());
        return customerSaved;
    }
}
