package med.voll.api.controller;


import med.voll.api.medic.CreateMedicData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medics")
public class MedicController {

    @PostMapping
    public void CreateMedics(@RequestBody CreateMedicData data){
        System.out.println(data);
    }
}
