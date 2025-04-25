package org.serratec.unifase.Unifase_Jogos_Negocio.controller;

import org.serratec.unifase.Unifase_Jogos_Negocio.dto.empresaModelo.EmpresaModeloReqDTO;
import org.serratec.unifase.Unifase_Jogos_Negocio.dto.empresaModelo.EmpresaModeloResDTO;
import org.serratec.unifase.Unifase_Jogos_Negocio.service.EmpresaModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/empresa-modelo")
public class EmpresaModeloController {

    @Autowired
    EmpresaModeloService empresaModeloService;

    @GetMapping
    public ResponseEntity<Page<EmpresaModeloResDTO>> getAllEmpresasModelo(
            @PageableDefault(page = 0, size = 10, direction = Sort.Direction.ASC)Pageable pageable
            ) {
        Page<EmpresaModeloResDTO> empresasModeloResDTO = empresaModeloService.getAllEmpresasModelo(pageable);
        return ResponseEntity.ok(empresasModeloResDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpresaModeloResDTO> findEmpresaModeloById(@PathVariable Long id){
        return ResponseEntity.ok().body(empresaModeloService.findEmpresaModeloById(id));
    }

    @PostMapping
    public ResponseEntity<EmpresaModeloReqDTO> createEmpresaModelo(@RequestBody EmpresaModeloReqDTO empresaModeloReqDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(empresaModeloService.createEmpresaModelo(empresaModeloReqDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmpresaModeloResDTO> updateEmpresaModelo(@PathVariable Long id, @RequestBody EmpresaModeloReqDTO empresaModeloDTO){
        EmpresaModeloResDTO empresaModeloAtualizada = empresaModeloService.updateEmpresaModelo(id, empresaModeloDTO);
        return empresaModeloAtualizada != null ? ResponseEntity.ok(empresaModeloAtualizada) : ResponseEntity.notFound().build();
    }
}
