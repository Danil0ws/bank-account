package buff.dev.bank.controllers;

import java.util.List;
import java.util.Optional;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import buff.dev.bank.repository.AddressRepository;
import buff.dev.bank.repository.models.Address;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class AddressController {

    private AddressRepository repository;
    
    @RequestMapping(method = RequestMethod.GET, value = "/address")
    public List<Address> getAllAddresses(){
        return repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/address/{id}")
    public Optional<Address> getAddressById(@PathVariable Long id){
        return repository.findById(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/address")
    public Address saveAddress(@RequestBody Address Address){
        return repository.save(Address);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/address/{id}")
    public void deleteAddress(@PathVariable Long id){
        repository.deleteById(id);
    }
}
