package co.edu.utp.gia.cdiaz.demomultitenancy.modelo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.utp.gia.cdiaz.demomultitenancy.modelo.entidades.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {

}
