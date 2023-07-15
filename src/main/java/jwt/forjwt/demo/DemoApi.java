package jwt.forjwt.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-api")
public class DemoApi {

    @GetMapping("/user")
    @PreAuthorize("hasAnyAuthority('USER')")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hi! I'm User");
    }

    @GetMapping("/admin")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public ResponseEntity<String> sayHelloAdmin(){
        return ResponseEntity.ok("Hi! I'm Admin");
    }

}
