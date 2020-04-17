package br.com.AppEsporteUI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Entity
@Table(name = "TProduto")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "tipoproduto")
@JsonSubTypes({ 
		@JsonSubTypes.Type(value = Skate.class, name = "Skate"),
		@JsonSubTypes.Type(value = Bodyboard.class, name = "Bodyboard"),
		@JsonSubTypes.Type(value = Bicicleta.class, name = "Bicicleta") })
public abstract class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "Descricao", nullable = false, length = 200)
	private String descricao;

	public Produto() {
		
	}

	public Produto(Integer id, String descricao) {
		this();
		this.setId(id);
		this.setDescricao(descricao);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
