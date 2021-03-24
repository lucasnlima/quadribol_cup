package quadribolapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import quadribolapi.domain.Acomodacao;

@Repository
public interface AcomodacaoRepository extends JpaRepository<Acomodacao, Long> {

}
