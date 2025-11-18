package vehiculos.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import jakarta.validation.Valid;
import vehiculos.demo.models.Vehicle;
import vehiculos.demo.services.VehicleService;

import java.util.List;

@RestController
@RequestMapping("/vehiculos")
@CrossOrigin(origins = "*")
public class VehicleController {
    
    @Autowired
    private VehicleService vehicleService;

    /**
     * GET /vehiculos - Obtiene todos los vehículos
     */
    @GetMapping
    public ResponseEntity<List<Vehicle>> obtenerTodos() {
        List<Vehicle> vehiculos = vehicleService.obtenerTodos();
        return ResponseEntity.ok(vehiculos);
    }

    /**
     * GET /vehiculos/{id} - Obtiene un vehículo por ID
     */
    @GetMapping("/{id}")
    public ResponseEntity<Vehicle> obtenerPorId(@PathVariable String id) {
        Vehicle vehicle = vehicleService.obtenerPorId(id)
            .orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, 
                "Vehículo con ID " + id + " no encontrado"
            ));
        return ResponseEntity.ok(vehicle);
    }

    /**
     * POST /vehiculos - Crea un nuevo vehículo
     */
    @PostMapping
    public ResponseEntity<Vehicle> crear(@Valid @RequestBody Vehicle vehicle) {
        Vehicle nuevoVehicle = vehicleService.crear(vehicle);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoVehicle);
    }

    /**
     * PUT /vehiculos/{id} - Actualiza un vehículo existente
     */
    @PutMapping("/{id}")
    public ResponseEntity<Vehicle> actualizar(
            @PathVariable String id, 
            @Valid @RequestBody Vehicle vehicle) {
        Vehicle vehicleActualizado = vehicleService.actualizar(id, vehicle);
        return ResponseEntity.ok(vehicleActualizado);
    }

    /**
     * DELETE /vehiculos/{id} - Elimina un vehículo
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable String id) {
        vehicleService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
