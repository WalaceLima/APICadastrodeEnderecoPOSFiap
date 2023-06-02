package br.com.archtech.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.archtech.entities.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{


}
