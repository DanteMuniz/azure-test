package pattern.azuredemoservices;

import api.HelloApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerOpenApi implements HelloApi {

    @Override
    public ResponseEntity<String> searchRequirements() {
        return new ResponseEntity<>("hello world from open api", HttpStatus.OK);
    }
}
