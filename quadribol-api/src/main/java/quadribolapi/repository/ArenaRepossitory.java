package quadribolapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import quadribolapi.domain.Arena;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {
	
	public Equipe getEquipeByNome(String nome);	
	
}
