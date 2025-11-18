package vehiculos.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import vehiculos.demo.models.Vehicle;
import vehiculos.demo.repository.VehicleRepository;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {
    
    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public List<Vehicle> obtenerTodos() {
        return vehicleRepository.findAll();
    }

    @Override
    public Optional<Vehicle> obtenerPorId(String id) {
        return vehicleRepository.findById(id);
    }

    @Override
    public Vehicle crear(Vehicle vehicle) {
        // El ID se genera automáticamente por MongoDB
        vehicle.setId(null);
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle actualizar(String id, Vehicle vehicle) {
        // Verificar si el vehículo existe
        if (!vehicleRepository.existsById(id)) {
            throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, 
                "Vehículo con ID " + id + " no encontrado"
            );
        }
        
        // Establecer el ID del vehículo a actualizar
        vehicle.setId(id);
        return vehicleRepository.save(vehicle);
    }

    @Override
    public void eliminar(String id) {
        // Verificar si el vehículo existe
        if (!vehicleRepository.existsById(id)) {
            throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, 
                "Vehículo con ID " + id + " no encontrado"
            );
        }
        
        vehicleRepository.deleteById(id);
    }
}
