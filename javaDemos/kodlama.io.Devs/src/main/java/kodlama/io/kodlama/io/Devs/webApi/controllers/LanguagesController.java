package kodlama.io.kodlama.io.Devs.webApi.controllers;

import kodlama.io.kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.kodlama.io.Devs.entities.concretes.Language;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private final LanguageService languageService;

    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<Language> getAll() {
        return languageService.getAll();
    }

    @GetMapping("/{id}")
    public Language getById(@PathVariable int id) {
        return languageService.getById(id);
    }

    @PostMapping("/create")
    public void create(@RequestBody Language language) {
        languageService.create(language);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Language language, @PathVariable int id) {
        languageService.update(language, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        languageService.delete(id);
    }
}
