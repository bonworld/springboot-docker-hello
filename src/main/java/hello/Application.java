package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@SpringBootApplication
@RestController
public class Application {

    private AtomicLong counter = new AtomicLong();
    private String template = "Hello Docker World %s";
    @RequestMapping("/greeting")
    public String home(@RequestParam(value="name",defaultValue = "world") String name) {

        return "No."+counter.incrementAndGet()+ " "+ String.format(template,name);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
