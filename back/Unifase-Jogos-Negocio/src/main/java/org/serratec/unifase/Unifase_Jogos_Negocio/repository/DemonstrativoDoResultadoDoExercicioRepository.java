package org.serratec.unifase.Unifase_Jogos_Negocio.repository;

import org.serratec.unifase.Unifase_Jogos_Negocio.entity.DemonstrativoDoResultadoDoExercicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemonstrativoDoResultadoDoExercicioRepository extends JpaRepository<DemonstrativoDoResultadoDoExercicio, Long> {
}