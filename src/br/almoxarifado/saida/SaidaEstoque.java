package br.almoxarifado.saida;

import java.util.Date;
import java.util.List;

import br.almoxarifado.modelo.StatusMovimentacao;
import br.almoxarifado.estoque.MovimentacaoEstoque;
import br.almoxarifado.modelo.Documento;
import br.almoxarifado.modelo.Usuario;
import br.rh.PessoaJuridica;

public class SaidaEstoque 
{
	private Usuario responsavel;
	private Date dataEnvio;
	private Date dataCriacao;
	private List<MovimentacaoEstoque> itens;
	private StatusMovimentacao status;
	private String observacoes;
	private PessoaJuridica transpotadora;
	private List<Documento> anexos;
	private GuiaRemessa guiaRemessa;
	private PessoaJuridica pjDestinarario;
	private String justicativa;
	
	public SaidaEstoque(Usuario responsavel, Date dataEnvio, Date dataCriacao, List<MovimentacaoEstoque> itens,
			StatusMovimentacao status, String observacoes, PessoaJuridica transpotadora, List<Documento> anexos,
			GuiaRemessa guiaRemessa, PessoaJuridica pjDestinarario, String justicativa) {
		super();
		this.responsavel = responsavel;
		this.dataEnvio = dataEnvio;
		this.dataCriacao = dataCriacao;
		this.itens = itens;
		this.status = status;
		this.observacoes = observacoes;
		this.transpotadora = transpotadora;
		this.anexos = anexos;
		this.guiaRemessa = guiaRemessa;
		this.pjDestinarario = pjDestinarario;
		this.justicativa = justicativa;
	}

	public Usuario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}

	public Date getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public List<MovimentacaoEstoque> getItens() {
		return itens;
	}

	public void setItens(List<MovimentacaoEstoque> itens) {
		this.itens = itens;
	}

	public StatusMovimentacao getStatus() {
		return status;
	}

	public void setStatus(StatusMovimentacao status) {
		this.status = status;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public PessoaJuridica getTranspotadora() {
		return transpotadora;
	}

	public void setTranspotadora(PessoaJuridica transpotadora) {
		this.transpotadora = transpotadora;
	}

	public List<Documento> getAnexos() {
		return anexos;
	}

	public void setAnexos(List<Documento> anexos) {
		this.anexos = anexos;
	}

	public GuiaRemessa getGuiaRemessa() {
		return guiaRemessa;
	}

	public void setGuiaRemessa(GuiaRemessa guiaRemessa) {
		this.guiaRemessa = guiaRemessa;
	}

	public PessoaJuridica getPjDestinarario() {
		return pjDestinarario;
	}

	public void setPjDestinarario(PessoaJuridica pjDestinarario) {
		this.pjDestinarario = pjDestinarario;
	}

	public String getJusticativa() {
		return justicativa;
	}

	public void setJusticativa(String justicativa) {
		this.justicativa = justicativa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anexos == null) ? 0 : anexos.hashCode());
		result = prime * result + ((dataCriacao == null) ? 0 : dataCriacao.hashCode());
		result = prime * result + ((dataEnvio == null) ? 0 : dataEnvio.hashCode());
		result = prime * result + ((guiaRemessa == null) ? 0 : guiaRemessa.hashCode());
		result = prime * result + ((itens == null) ? 0 : itens.hashCode());
		result = prime * result + ((justicativa == null) ? 0 : justicativa.hashCode());
		result = prime * result + ((observacoes == null) ? 0 : observacoes.hashCode());
		result = prime * result + ((pjDestinarario == null) ? 0 : pjDestinarario.hashCode());
		result = prime * result + ((responsavel == null) ? 0 : responsavel.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((transpotadora == null) ? 0 : transpotadora.hashCode());
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
		SaidaEstoque other = (SaidaEstoque) obj;
		if (anexos == null) {
			if (other.anexos != null)
				return false;
		} else if (!anexos.equals(other.anexos))
			return false;
		if (dataCriacao == null) {
			if (other.dataCriacao != null)
				return false;
		} else if (!dataCriacao.equals(other.dataCriacao))
			return false;
		if (dataEnvio == null) {
			if (other.dataEnvio != null)
				return false;
		} else if (!dataEnvio.equals(other.dataEnvio))
			return false;
		if (guiaRemessa == null) {
			if (other.guiaRemessa != null)
				return false;
		} else if (!guiaRemessa.equals(other.guiaRemessa))
			return false;
		if (itens == null) {
			if (other.itens != null)
				return false;
		} else if (!itens.equals(other.itens))
			return false;
		if (justicativa == null) {
			if (other.justicativa != null)
				return false;
		} else if (!justicativa.equals(other.justicativa))
			return false;
		if (observacoes == null) {
			if (other.observacoes != null)
				return false;
		} else if (!observacoes.equals(other.observacoes))
			return false;
		if (pjDestinarario == null) {
			if (other.pjDestinarario != null)
				return false;
		} else if (!pjDestinarario.equals(other.pjDestinarario))
			return false;
		if (responsavel == null) {
			if (other.responsavel != null)
				return false;
		} else if (!responsavel.equals(other.responsavel))
			return false;
		if (status != other.status)
			return false;
		if (transpotadora == null) {
			if (other.transpotadora != null)
				return false;
		} else if (!transpotadora.equals(other.transpotadora))
			return false;
		return true;
	}
}
