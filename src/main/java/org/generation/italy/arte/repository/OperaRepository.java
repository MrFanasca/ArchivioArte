package org.generation.italy.arte.repository;

import org.generation.italy.arte.model.Opera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperaRepository extends JpaRepository<Opera, Integer>{

	
}
