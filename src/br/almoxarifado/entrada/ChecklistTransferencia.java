package br.almoxarifado.entrada;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import br.rh.Endereco;
import br.almoxarifado.modelo.Documento;
import br.almoxarifado.modelo.Material;

public class ChecklistTransferencia 
{
	private Material material;
	private BigDecimal qtd;
	private Endereco local;
	private Date dataConferencia;
	private String observacoes;
	private List<Documento> anexoFotos;
	private boolean aprovado;
	public ChecklistTransferencia(Material material, BigDecimal qtd, Endereco local, Date dataConferencia,
			String observacoes, List<Documento> anexoFotos, boolean aprovado) {
		super();
		this.material = material;
		this.qtd = qtd;
		this.local = local;
		this.dataConferencia = dataConferencia;
		this.observacoes = observacoes;
		this.anexoFotos = anexoFotos;
		this.aprovado = aprovado;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public BigDecimal getQtd() {
		return qtd;
	}
	public void setQtd(BigDecimal qtd) {
		this.qtd = qtd;
	}
	public Endereco getLocal() {
		return local;
	}
	public void setLocal(Endereco local) {
		this.local = local;
	}
	public Date getDataConferencia() {
		return dataConferencia;
	}
	public void setDataConferencia(Date dataConferencia) {
		this.dataConferencia = dataConferencia;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public List<Documento> getAnexoFotos() {
		return anexoFotos;
	}
	public void setAnexoFotos(List<Documento> anexoFotos) {
		this.anexoFotos = anexoFotos;
	}
	public boolean isAprovado() {
		return aprovado;
	}
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anexoFotos == null) ? 0 : anexoFotos.hashCode());
		result = prime * result + (aprovado ? 1231 : 1237);
		result = prime * result + ((dataConferencia == null) ? 0 : dataConferencia.hashCode());
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((observacoes == null) ? 0 : observacoes.hashCode());
		result = prime * result + ((qtd == null) ? 0 : qtd.hashCode());
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
		ChecklistTransferencia other = (ChecklistTransferencia) obj;
		if (anexoFotos == null) {
			if (other.anexoFotos != null)
				return false;
		} else if (!anexoFotos.equals(other.anexoFotos))
			return false;
		if (aprovado != other.aprovado)
			return false;
		if (dataConferencia == null) {
			if (other.dataConferencia != null)
				return false;
		} else if (!dataConferencia.equals(other.dataConferencia))
			return false;
		if (local == null) {
			if (other.local != null)
				return false;
		} else if (!local.equals(other.local))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (observacoes == null) {
			if (other.observacoes != null)
				return false;
		} else if (!observacoes.equals(other.observacoes))
			return false;
		if (qtd == null) {
			if (other.qtd != null)
				return false;
		} else if (!qtd.equals(other.qtd))
			return false;
		return true;
	}
	
}
