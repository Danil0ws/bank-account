package buff.dev.bank.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import buff.dev.bank.repository.ConsumerRepository;
import buff.dev.bank.repository.models.Consumer;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ConsumerController {

    private ConsumerRepository repository;
    
    /**
     * @return List<Consumer>
     */
    @RequestMapping(method = RequestMethod.GET, value = "/consumer")
    public List<Consumer> getAllConsumers(){
        return repository.findAll();
    }

    /**
     * @param id
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/consumer/{id}")
    public Optional<Consumer> getConsumerById(@PathVariable Long id){
        return repository.findById(id);
    }
    /**
     * @param Consumer
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/consumer")
    public Consumer saveConsumer(@RequestBody Consumer Consumer){
        return repository.save(Consumer);
    }

    /**
     * @param id
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/consumer/{id}")
    public void deleteConsumer(@PathVariable Long id){
        repository.deleteById(id);
    }
}
