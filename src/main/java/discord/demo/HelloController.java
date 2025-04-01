package discord.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.servlet.function.ServerResponse.status;

@RestController
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @PostMapping("/hello")
    public ResponseEntity<Data> getConsentPolicy(@RequestBody Data data) {

        log.info(data.getData());
        return ResponseEntity.status(HttpStatus.OK).body(data);
    }
    @GetMapping("/hello")
    public String hello()   {
        return "Hello wwwwwww";
    }
}
