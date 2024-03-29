package quadribolapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import quadribolapi.domain.Jogo;

@Repository
public interface JogoRepository extends JpaRepository<Jogo, Long> {
	List<Jogo> FindByFinalizado(boolean finalizado);

}
