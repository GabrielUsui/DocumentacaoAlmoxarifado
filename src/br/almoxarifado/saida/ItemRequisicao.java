package br.almoxarifado.saida;

import java.math.BigDecimal;

import br.almoxarifado.modelo.UnidadeMedida;

public class ItemRequisicao 
{
	private String material;
	private BigDecimal qtdRequisitada;
	private BigDecimal qtdAtendida;
	private UnidadeMedida unidadeMedida;
	
	public ItemRequisicao(String material, BigDecimal qtdRequisitada, BigDecimal qtdAtendida,
			UnidadeMedida unidadeMedida) {
		super();
		this.material = material;
		this.qtdRequisitada = qtdRequisitada;
		this.qtdAtendida = qtdAtendida;
		this.unidadeMedida = unidadeMedida;
	}
	public String getMaterial() 
	{
		return material;
	}
	public void setMaterial(String material) 
	{
		this.material = material;
	}
	public BigDecimal getQtdRequisitada() 
	{
		return qtdRequisitada;
	}
	public void setQtdRequisitada(BigDecimal qtdRequisitada) 
	{
		this.qtdRequisitada = qtdRequisitada;
	}
	public BigDecimal getQtdAtendida() 
	{
		return qtdAtendida;
	}
	public void setQtdAtendida(BigDecimal qtdAtendida) 
	{
		this.qtdAtendida = qtdAtendida;
	}
	public UnidadeMedida getUnidadeMedida() 
	{
		return unidadeMedida;
	}
	public void setUnidadeMedida(UnidadeMedida unidadeMedida) 
	{
		this.unidadeMedida = unidadeMedida;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((qtdAtendida == null) ? 0 : qtdAtendida.hashCode());
		result = prime * result + ((qtdRequisitada == null) ? 0 : qtdRequisitada.hashCode());
		result = prime * result + ((unidadeMedida == null) ? 0 : unidadeMedida.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemRequisicao other = (ItemRequisicao) obj;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (qtdAtendida == null) {
			if (other.qtdAtendida != null)
				return false;
		} else if (!qtdAtendida.equals(other.qtdAtendida))
			return false;
		if (qtdRequisitada == null) {
			if (other.qtdRequisitada != null)
				return false;
		} else if (!qtdRequisitada.equals(other.qtdRequisitada))
			return false;
		if (unidadeMedida == null) {
			if (other.unidadeMedida != null)
				return false;
		} else if (!unidadeMedida.equals(other.unidadeMedida))
			return false;
		return true;
	}
	
	
}
