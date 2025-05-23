package org.serratec.unifase.Unifase_Jogos_Negocio.controller;

import org.serratec.unifase.Unifase_Jogos_Negocio.dto.empresaEmGestao.EmpresaEmGestaoResDTO;
import org.serratec.unifase.Unifase_Jogos_Negocio.service.EmpresaEmGestaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empresa-em-gestao")
public class EmpresaEmGestaoController {

    @Autowired
    EmpresaEmGestaoService empresaEmGestaoService;

    @PostMapping("/{id}")
    public ResponseEntity<String> createEmpresaEmGestao (@PathVariable Long id, @RequestParam ("nomeEmpresa") String nomeEmpresa){
        return ResponseEntity.status(HttpStatus.CREATED).body(empresaEmGestaoService.createEmpresaEmGestao(id, nomeEmpresa));
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpresaEmGestaoResDTO> getEmpresaComDre (@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(empresaEmGestaoService.findEmpresaEmGestaoComDre(id));
    }
}
