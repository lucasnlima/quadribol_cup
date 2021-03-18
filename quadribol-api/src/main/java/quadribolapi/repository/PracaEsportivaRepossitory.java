package quadribolapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import quadribolapi.domain.PracaEsportiva;

@Repository
public interface PracaEsportivaRepossitory extends JpaRepository<PracaEsportiva, Long> {

}
