package org.serratec.unifase.Unifase_Jogos_Negocio.repository;

import org.serratec.unifase.Unifase_Jogos_Negocio.entity.DemonstrativoDoResultadoDoExercicio;
import org.serratec.unifase.Unifase_Jogos_Negocio.entity.EmpresaEmGestao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DemonstrativoDoResultadoDoExercicioRepository extends JpaRepository<DemonstrativoDoResultadoDoExercicio, Long> {
    Optional<DemonstrativoDoResultadoDoExercicio> findTopByEmpresaOrderByDataCalculoDesc(EmpresaEmGestao empresa);
}