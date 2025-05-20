package org.serratec.unifase.Unifase_Jogos_Negocio.repository;

import org.serratec.unifase.Unifase_Jogos_Negocio.entity.EmpresaEmGestao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaEmGestaoRepository extends JpaRepository<EmpresaEmGestao, Long> {

    Page<EmpresaEmGestao> findAll (Pageable pageable);
}