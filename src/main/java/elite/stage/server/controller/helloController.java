package elite.stage.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class helloController {
    @GetMapping("")
    public String welcome(){
        return "hello world ";
    }
}
