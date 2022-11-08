package kodlama.io.kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.requests.DeleteLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.responses.GetAllLanguageResponse;
import kodlama.io.kodlama.io.Devs.business.responses.GetByIdLanguageResponse;

public interface LanguageService {
	
	List<GetAllLanguageResponse> getAll();

    GetByIdLanguageResponse getById(int id);
    void add(CreateLanguageRequest createSoftwareLanguageRequest);
    void delete(DeleteLanguageRequest deleteSoftwareLanguageRequest);

    void update(int id,UpdateLanguageRequest updateSoftwareLanguageRequest);
}
