package br.almoxarifado.saida;

import java.util.Date;

import br.almoxarifado.modelo.Usuario;

public class HistoricoRequisicao 
{
	private Date dataRegistro;
	private StatusRequisicao status;
	private Usuario usuario;
	private String observacoes;
	
	public HistoricoRequisicao(Date dataRegistro, StatusRequisicao status, Usuario usuario, String observacoes) {
		super();
		this.dataRegistro = dataRegistro;
		this.status = status;
		this.usuario = usuario;
		this.observacoes = observacoes;
	}
	public Date getDataRegistro() 
	{
		return dataRegistro;
	}
	public void setDataRegistro(Date dataRegistro) 
	{
		this.dataRegistro = dataRegistro;
	}
	public StatusRequisicao getStatus() 
	{
		return status;
	}
	public void setStatus(StatusRequisicao status) 
	{
		this.status = status;
	}
	public Usuario getUsuario() 
	{
		return usuario;
	}
	public void setUsuario(Usuario usuario) 
	{
		this.usuario = usuario;
	}
	public String getObservacoes() 
	{
		return observacoes;
	}
	public void setObservacoes(String observacoes) 
	{
		this.observacoes = observacoes;
	}
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataRegistro == null) ? 0 : dataRegistro.hashCode());
		result = prime * result + ((observacoes == null) ? 0 : observacoes.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HistoricoRequisicao other = (HistoricoRequisicao) obj;
		if (dataRegistro == null) {
			if (other.dataRegistro != null)
				return false;
		} else if (!dataRegistro.equals(other.dataRegistro))
			return false;
		if (observacoes == null) {
			if (other.observacoes != null)
				return false;
		} else if (!observacoes.equals(other.observacoes))
			return false;
		if (status != other.status)
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}
}
