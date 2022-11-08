package kodlama.io.kodlama.io.Devs.webApi.controllers;

import kodlama.io.kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.requests.DeleteLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.responses.GetAllLanguageResponse;
import kodlama.io.kodlama.io.Devs.business.responses.GetByIdLanguageResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	
	private LanguageService languageService;
    @Autowired
    public void LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }
    @GetMapping("/getAll")
    public List<GetAllLanguageResponse> getAll(){
        return languageService.getAll();
    }

    @GetMapping("/{id}")
        public GetByIdLanguageResponse getById(int id){
        return languageService.getById(id);
        }
    @PostMapping("/add")
    public void add(CreateLanguageRequest createLanguageRequest){
    this.languageService.add(createLanguageRequest);
    }

    @DeleteMapping("/delete")
    public void delete(DeleteLanguageRequest deleteLanguageRequest){
    this.languageService.delete(deleteLanguageRequest);
    }
    @PutMapping("/update")
    public void update(int id,UpdateLanguageRequest updateLanguageRequest){
        this.languageService.update(id,updateLanguageRequest);
    }
	
}
