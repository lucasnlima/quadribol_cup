package quadribolapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import quadribolapi.domain.Arbitro;

@Repository
public interface ArbitroRepository extends JpaRepository<Arbitro, Long> {

}
