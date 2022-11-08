package kodlama.io.kodlama.io.Devs.business.concrete;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.requests.DeleteTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.responses.GetAllTechnologyResponse;
import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.Language;
import kodlama.io.kodlama.io.Devs.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {
	
	private TechnologyRepository technologyRepository;
    private LanguageRepository languageRepository;

    @Autowired
    public TechnologyManager(TechnologyRepository technologyRepository,LanguageRepository languageRepository){
        this.technologyRepository = technologyRepository;
        this.languageRepository = languageRepository;
    }

    @Override
    public List<GetAllTechnologyResponse> getAll() {
        List<Technology> technologies = technologyRepository.findAll();
        List<GetAllTechnologyResponse> responses = new ArrayList<>();
        for (Technology technology: technologies) {
            GetAllTechnologyResponse response = new GetAllTechnologyResponse();

            response.setName(technology.getName());
            response.setLanguageName(technology.getLanguage().getName());

            responses.add(response);
        }
        return responses;
    }

    @Override
    public void add(CreateTechnologyRequest createTechnologyRequest) {
        Technology technology = new Technology();
        Language language = languageRepository.findById(createTechnologyRequest.getLanguageId()).get();
        technology.setName(createTechnologyRequest.getName());
        technology.setLanguage(language);
        technologyRepository.save(technology);

    }

    @Override
    public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
        technologyRepository.deleteById(deleteTechnologyRequest.getId());

    }

    @Override
    public void update(int id, UpdateTechnologyRequest updateTechnologyRequest) {
        Technology technology = technologyRepository.findById(id).get();
        Language language = languageRepository.findById(updateTechnologyRequest.getLanguageId()).get();
        technology.setName(updateTechnologyRequest.getName());
        technology.setLanguage(language);
        technologyRepository.save(technology);
    }

}
