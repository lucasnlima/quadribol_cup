package quadribolapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import quadribolapi.domain.Time;

@Repository
public interface TimeRepository extends JpaRepository<Time, Long> {
<<<<<<< HEAD:quadribol-api/src/main/java/quadribolapi/repository/TimeRepository.java

=======
	
	public Time getEquipeByNome(String nome);	
	
>>>>>>> lucas-branch:quadribol-api/src/main/java/quadribolapi/repository/EquipeRepository.java
}
