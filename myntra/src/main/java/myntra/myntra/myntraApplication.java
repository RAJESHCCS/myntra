package myntra.myntra;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class myntraApplication {

    public static void main(String[] args) {

        SpringApplication.run(myntraApplication.class, args);

//        Weatherclient weathertemplate = new Weatherclient();
//        weathertemplate.getWeatherInfo("http://localhost:8092/weather/getWeatherInfo",string.class);
//        RestTemplate restTemplate = new RestTemplate();
//        String weatherInfo = restTemplate.getForObject("http://localhost:8080/weather/getWeatherInfo", String.class);
//        System.out.println("Weather Info: " + weatherInfo);

    }
}
