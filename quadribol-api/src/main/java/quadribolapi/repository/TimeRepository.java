package quadribolapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import quadribolapi.domain.Time;

@Repository
public interface TimeRepository extends JpaRepository<Time, Long> {

}
