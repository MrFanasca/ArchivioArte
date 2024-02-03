package org.generation.italy.arte.repository;

import org.generation.italy.arte.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistaReopository extends JpaRepository<Artista, String>{

	
}
