package jan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController

public class Rakendus{

    @RequestMapping("/ring")
    public String ring(double raadius){
        kujundid r1 = new ring(raadius);
        return "Ringi pindala on "+ r1.kujundiPindala();

    }

    @RequestMapping("/silinder")
    public String ring(double raadius, double k6rgus){
        silinder s1 = new silinder(raadius, k6rgus);
        return "Silindri ruumala on "+ s1.kujundiRuumala();

    }


    public static void main(String[] arg){
        SpringApplication.run(Rakendus.class, arg);
    }
}