package kodlama.io.kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import kodlama.io.kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.requests.DeleteTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.responses.GetAllTechnologyResponse;

@RestController
@RequestMapping("/api/technologies")
public class TechnologyController {
	 private TechnologyService technologyService;
    @Autowired
    public TechnologyController(TechnologyService technologyService){
        this.technologyService = technologyService;
    }

    @GetMapping("/getall")
    public List<GetAllTechnologyResponse> getAll(){
        return technologyService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateTechnologyRequest createTechnologyRequest){
        this.technologyService.add(createTechnologyRequest);
    }

    @DeleteMapping("/delete")
    public void deleteById(DeleteTechnologyRequest deleteTechnologyRequest){
        this.technologyService.delete(deleteTechnologyRequest);
    }

    @PutMapping("/update")
    public void updateById(int id, UpdateTechnologyRequest updateTechnologyRequest){
        this.technologyService.update(id,updateTechnologyRequest);
    }

}
