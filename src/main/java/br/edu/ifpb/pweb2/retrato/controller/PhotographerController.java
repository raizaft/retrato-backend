package br.edu.ifpb.pweb2.retrato.controller;

import br.edu.ifpb.pweb2.retrato.dto.PhotographerDTO;
import br.edu.ifpb.pweb2.retrato.service.PhotographerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/photographers")
public class PhotographerController {
    @Autowired
    private PhotographerService service;

    @GetMapping
    public ResponseEntity<List<PhotographerDTO>> list() {
        List<PhotographerDTO> photographers = this.service.list();
        return ResponseEntity.ok(photographers);
    }
}
