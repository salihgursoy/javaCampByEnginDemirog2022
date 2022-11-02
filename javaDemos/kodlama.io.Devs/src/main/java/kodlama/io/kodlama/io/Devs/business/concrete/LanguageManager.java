package kodlama.io.kodlama.io.Devs.business.concrete;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.Language;

@Service // "Bu sınıf bir business nesnesidir" diyoruz spring'e
public class LanguageManager implements LanguageService {
    LanguageRepository languageRepository;

	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository ;
	}

	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public Language getById(int id) {
		return languageRepository.getById(id);
	}

	@Override
	public void create(Language language) {
		if(isLanguageExists(language)) {
			throw new RuntimeException("Bu dil zaten mevcut.") ;
		}
		if(checkLanguageNameValid(language)) {
			throw new RuntimeException("Geçersiz dil girildi.") ;
		}
		
		languageRepository.create(language);
	}

	@Override
	public void update(Language language, int id) {
		if(languageRepository.getById(id) == null) {
			throw new RuntimeException("Geçersiz bir dil ismi girdiniz.") ;
		}
		if(isLanguageExists(language)) {
			throw new RuntimeException("Bu dil zaten mevcut.") ;
		}
		if(checkLanguageNameValid(language)) {
            throw new RuntimeException("Language name is not valid") ;
		}
		
        languageRepository.update(language, id);
	}

	@Override
	public void delete(int id) {
		languageRepository.delete(id);
	}
	
	public boolean isLanguageExists(Language language) {
		return languageRepository.getAll().stream().anyMatch(l -> l.getName()
                .equals(language.getName()));
	}
	
	public boolean checkLanguageNameValid(Language language) {
		return language.getName().isEmpty() || language.getName().isBlank() || language.getName()
                .length() < 2;
	}
	
}
