package br.com.archtech.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EntityScan
public class Endereco {
	
	private Integer idEndereco;
	private String rua;
	private Integer numero;
	private String bairro;
	private String cidade;
	private String estado;

}
