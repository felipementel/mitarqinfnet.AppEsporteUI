package br.com.AppEsporteUI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TSkate")
@PrimaryKeyJoinColumn(name = "idProduto")
public class Skate extends Produto {

	@Column(name = "MaterialShape", nullable = false, length = 200)
	private String materialshape;

	@Column(name = "TamanhoShape", nullable = false)
	private double tamanhoshape;

	@Column(name = "Fabricante", nullable = false, length = 200)
	private String fabricante;

	@Column(name = "Preco", nullable = false)
	private float preco;

	public Skate() {
		super();
	}

	public Skate(String materialShape, double tamanhoShape, String fabricante, float preco) {
		super();
		this.setMaterialshape(materialShape);
		this.setTamanhoshape(tamanhoShape);
		this.setFabricante(fabricante);
		this.setPreco(preco);
	}

	public String getMaterialshape() {
		return materialshape;
	}

	public void setMaterialshape(String materialshape) {
		this.materialshape = materialshape;
	}

	public double getTamanhoshape() {
		return tamanhoshape;
	}

	public void setTamanhoshape(double tamanhoshape) {
		this.tamanhoshape = tamanhoshape;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {

		return String.format("%s - %s - %s - %f - %f \n", this.getDescricao(), this.getFabricante(),
				this.getMaterialshape(), this.getTamanhoshape(), this.getPreco());
	}
}