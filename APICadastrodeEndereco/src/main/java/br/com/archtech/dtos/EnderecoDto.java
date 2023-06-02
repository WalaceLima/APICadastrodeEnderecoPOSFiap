package br.com.archtech.dtos;

import br.com.archtech.entities.Endereco;

public class EnderecoDto {
	
	private Long codigo;
	private String rua;
	private Integer numero;
	private String bairro;
	private String cidade;
	private String estado;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

		public Endereco toEntity(EnderecoDto enderecoDto) {
			Endereco endereco = new Endereco();
			endereco.setCodigo(enderecoDto.getCodigo());
			endereco.setRua(enderecoDto.getRua());
			endereco.setNumero(enderecoDto.getNumero());
			endereco.setBairro(enderecoDto.getBairro());
			endereco.setCidade(enderecoDto.getCidade());
			endereco.setEstado(enderecoDto.getEstado());

			return endereco;
		}
}
