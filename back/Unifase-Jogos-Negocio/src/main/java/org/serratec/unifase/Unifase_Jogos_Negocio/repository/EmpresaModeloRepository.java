package org.serratec.unifase.Unifase_Jogos_Negocio.repository;

import org.serratec.unifase.Unifase_Jogos_Negocio.entity.EmpresaModelo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaModeloRepository extends JpaRepository<EmpresaModelo, Long> {

    Page<EmpresaModelo> findAll (Pageable pageable);
}