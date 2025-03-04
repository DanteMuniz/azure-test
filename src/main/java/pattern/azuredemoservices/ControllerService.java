package pattern.azuredemoservices;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerService {

    @GetMapping("/hola")
    public String getController(){
        return "hello world";
    }
}
