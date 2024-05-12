package myntra.myntra;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/weather")
public class API {

    @GetMapping("getWeatherInfo")
    public String getWeatherInfo(){

        return "The temp is 23 and humidity is 54%, the wind speeds" +
                " are running at 10kmph feels like  25";

    }
}