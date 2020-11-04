package works.mia.deployment;


import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/breeds")
public class DogController {


//    Restful endpoint
    @GetMapping("/image/random")
    public JSONObject getDog(){
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("message", "https://images.dog.ceo/breeds/pointer-germanlonghair/hans2.jpg");
        jsonobject.put("status", "success");
        return jsonobject;
//        return "{\"message\":\"https:\\/\\/images.dog.ceo\\/breeds\\/pointer-germanlonghair\\/hans2.jpg\",\"status\":\"success\"}\n" ;
    };
}
