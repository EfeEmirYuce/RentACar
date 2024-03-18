package kodlama.io.rentacar.business.abstracts;

import kodlama.io.rentacar.business.requests.CreateBrandRequest;
import kodlama.io.rentacar.business.requests.UpdateBrandRequest;
import kodlama.io.rentacar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentacar.business.responses.GetByIdBrandResponse;
import kodlama.io.rentacar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);
    void update(UpdateBrandRequest updateBrandRequest);
    void delete(int id);
    GetByIdBrandResponse getById(int id);
}
