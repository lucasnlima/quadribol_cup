package quadribolapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import quadribolapi.domain.Jogador;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Long> {

}
