package quadribolapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import quadribolapi.domain.Equipe;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {

}
