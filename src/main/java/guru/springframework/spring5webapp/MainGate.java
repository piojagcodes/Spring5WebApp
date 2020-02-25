package guru.springframework.spring5webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // komunikacja z interface REST
public class MainGate {
    /**
     * Wzorzec Builder, stream, lambda
     *
     * @return
     */

    @GetMapping("/MainGate")
    public String MainGate() {
        return  "MainGate";
    }
}