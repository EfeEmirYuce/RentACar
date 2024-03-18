package kodlama.io.rentacar.business.rules;

import kodlama.io.rentacar.core.utilities.exceptions.BusinessException;
import kodlama.io.rentacar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BrandBusinessRules {
    private BrandRepository brandRepository;
    public void checkIfBrandNameExists(String name){
        if(this.brandRepository.existsByName(name)){
            throw new BusinessException("Brand name already exists");  //Java exception types
        }
    }
}
