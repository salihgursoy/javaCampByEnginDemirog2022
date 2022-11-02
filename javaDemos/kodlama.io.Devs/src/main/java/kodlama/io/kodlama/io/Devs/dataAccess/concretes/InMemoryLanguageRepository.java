package kodlama.io.kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.Language;

@Repository // "Bu sınıf bir dataAccess nesnesidir" diyoruz spring'e
public class InMemoryLanguageRepository implements LanguageRepository {
	List<Language> languageList;
	
	public InMemoryLanguageRepository() {
		languageList= new ArrayList<>() ;
		languageList.add(new Language(1,"Pyhton"));
		languageList.add(new Language(2,"Java"));
		languageList.add(new Language(3,"JavaScript"));
		languageList.add(new Language(4,"C++"));
	}

	@Override
	public List<Language> getAll() {
		return languageList;
	}

	@Override
	public Language getById(int id) {
        for (Language language : languageList) {
            if (language.getId() == id) return language;
        }
        return null;
	}

	@Override
	public void create(Language language) {
		languageList.add(language);
	}

	@Override
	public void update(Language language, int id) {
		Language newLanguage = getById(id) ;
		newLanguage.setName(language.getName()) ;
	}

	@Override
	public void delete(int id) {
		Language language = getById(id) ;
		languageList.remove(language) ;
	}
	
}
