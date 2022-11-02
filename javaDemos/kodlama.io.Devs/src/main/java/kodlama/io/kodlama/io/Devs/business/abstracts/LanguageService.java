package kodlama.io.kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll() ;
	Language getById(int id) ;
	void create(Language language) ;
	void update(Language language, int id) ;
	void delete(int id) ;
}
