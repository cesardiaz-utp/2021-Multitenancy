package co.edu.utp.gia.cdiaz.demomultitenancy.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.edu.utp.gia.cdiaz.demomultitenancy.modelo.entidades.Carro;
import co.edu.utp.gia.cdiaz.demomultitenancy.modelo.repositorios.CarroRepository;

@RestController
@RequestMapping("/api/cars")
public class CarroController {

    private CarroRepository repository;

    public CarroController(CarroRepository repository) {
        this.repository = repository;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.CREATED)
    public Carro insert(@RequestBody Carro car) {
        return repository.save(car);
    }

    @GetMapping
    public List<Carro> posts() {
        return repository.findAll();
    }

}
