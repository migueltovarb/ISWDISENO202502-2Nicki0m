package vehiculos.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import vehiculos.demo.models.Vehicle;

@Repository
public interface VehicleRepository extends MongoRepository<Vehicle, String> {
    // MongoRepository ya proporciona métodos como:
    // - save()
    // - findById()
    // - findAll()
    // - deleteById()
    // - existsById()
    
    // Aquí puedes agregar métodos de consulta personalizados si los necesitas
    // Por ejemplo:
    // List<Vehicle> findByMarca(String marca);
    // List<Vehicle> findByAño(Integer año);
}
