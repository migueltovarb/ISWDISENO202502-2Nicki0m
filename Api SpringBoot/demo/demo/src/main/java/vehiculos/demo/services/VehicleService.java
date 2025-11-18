package vehiculos.demo.services;

import vehiculos.demo.models.Vehicle;
import java.util.List;
import java.util.Optional;

public interface VehicleService {
    
    /**
     * Obtiene todos los vehículos
     * @return Lista de todos los vehículos
     */
    List<Vehicle> obtenerTodos();
    
    /**
     * Obtiene un vehículo por su ID
     * @param id ID del vehículo
     * @return Optional con el vehículo si existe
     */
    Optional<Vehicle> obtenerPorId(String id);
    
    /**
     * Crea un nuevo vehículo
     * @param vehicle Vehículo a crear
     * @return Vehículo creado
     */
    Vehicle crear(Vehicle vehicle);
    
    /**
     * Actualiza un vehículo existente
     * @param id ID del vehículo a actualizar
     * @param vehicle Datos actualizados del vehículo
     * @return Vehículo actualizado
     */
    Vehicle actualizar(String id, Vehicle vehicle);
    
    /**
     * Elimina un vehículo por su ID
     * @param id ID del vehículo a eliminar
     */
    void eliminar(String id);
}
