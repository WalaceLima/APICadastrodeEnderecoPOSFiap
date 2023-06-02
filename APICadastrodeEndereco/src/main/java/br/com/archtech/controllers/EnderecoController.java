package br.com.archtech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.archtech.dtos.EnderecoDto;
import br.com.archtech.entities.Endereco;
import br.com.archtech.event.RecursoCriadoEvent;
import br.com.archtech.repositores.EnderecoRepository;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping
	public ResponseEntity<Endereco> criar(@Valid @RequestBody EnderecoDto enderecoDto, HttpServletResponse response) {
		Endereco enderecoSalvo = enderecoRepository.save(enderecoDto.toEntity(enderecoDto));
		publisher.publishEvent(new RecursoCriadoEvent(this, response, enderecoSalvo.getCodigo()));
			return ResponseEntity.status(HttpStatus.CREATED).body(enderecoSalvo);
	}
}
