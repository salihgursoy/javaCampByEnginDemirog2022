package kodlama.io.kodlama.io.Devs.business.concrete;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.requests.DeleteLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.responses.GetAllLanguageResponse;
import kodlama.io.kodlama.io.Devs.business.responses.GetByIdLanguageResponse;
import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	
	private LanguageRepository languageRepository;
    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<GetAllLanguageResponse> getAll() {
    	
        List<Language> languages = languageRepository.findAll();
        List<GetAllLanguageResponse> languageResponse = new ArrayList<GetAllLanguageResponse>();

        for (Language language: languages ) {
            GetAllLanguageResponse responseItem = new GetAllLanguageResponse();
            responseItem.setId(language.getId());
            responseItem.setName(language.getName());
            languageResponse.add(responseItem);
        }
        // İş Kuralları

        return languageResponse;
    }

    @Override
    public GetByIdLanguageResponse getById(int id) {
        Language language = languageRepository.findById(id).get();
        GetByIdLanguageResponse response = new GetByIdLanguageResponse();
        response.setName(language.getName());
        return response;
    }

    @Override
    public void add(CreateLanguageRequest createLanguageRequest) {
        Language language = new Language();
        language.setName(createLanguageRequest.getName());
        this.languageRepository.save(language);
    }

    @Override
    public void delete(DeleteLanguageRequest deleteLanguageRequest) {
        languageRepository.deleteById(deleteLanguageRequest.getId());
    }

    @Override
    public void update(int id, UpdateLanguageRequest updateLanguageRequest) {
        if(!updateLanguageRequest.getName().isEmpty()){
            Language language = languageRepository.findById(id).get();
            language.setName(updateLanguageRequest.getName());
            languageRepository.save(language);
        }
    }
}
