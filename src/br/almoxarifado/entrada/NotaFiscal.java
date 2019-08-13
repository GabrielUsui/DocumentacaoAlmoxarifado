package br.almoxarifado.entrada;

import java.math.BigDecimal;
import java.util.Date;

import br.rh.PessoaJuridica;

public class NotaFiscal 
{
	private int serieNF;
	private int numeroNF;
	private PessoaJuridica transportadora;
	private String motorista;
	private String placaVeiculo;
	private Date dataEmissao;
	private PessoaJuridica emitente;
	private PessoaJuridica destinatário;
	private BigDecimal valorTotal;
	
	public NotaFiscal(int serieNF, int numeroNF, PessoaJuridica transportadora, String motorista, String placaVeiculo,
			Date dataEmissao, PessoaJuridica emitente, PessoaJuridica destinatário, BigDecimal valorTotal) {
		super();
		this.serieNF = serieNF;
		this.numeroNF = numeroNF;
		this.transportadora = transportadora;
		this.motorista = motorista;
		this.placaVeiculo = placaVeiculo;
		this.dataEmissao = dataEmissao;
		this.emitente = emitente;
		this.destinatário = destinatário;
		this.valorTotal = valorTotal;
	}

	public int getSerieNF() {
		return serieNF;
	}

	public void setSerieNF(int serieNF) {
		this.serieNF = serieNF;
	}

	public int getNumeroNF() {
		return numeroNF;
	}

	public void setNumeroNF(int numeroNF) {
		this.numeroNF = numeroNF;
	}

	public PessoaJuridica getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(PessoaJuridica transportadora) {
		this.transportadora = transportadora;
	}

	public String getMotorista() {
		return motorista;
	}

	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}

	public String getPlacaVeiculo() {
		return placaVeiculo;
	}

	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public PessoaJuridica getEmitente() {
		return emitente;
	}

	public void setEmitente(PessoaJuridica emitente) {
		this.emitente = emitente;
	}

	public PessoaJuridica getDestinatário() {
		return destinatário;
	}

	public void setDestinatário(PessoaJuridica destinatário) {
		this.destinatário = destinatário;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataEmissao == null) ? 0 : dataEmissao.hashCode());
		result = prime * result + ((destinatário == null) ? 0 : destinatário.hashCode());
		result = prime * result + ((emitente == null) ? 0 : emitente.hashCode());
		result = prime * result + ((motorista == null) ? 0 : motorista.hashCode());
		result = prime * result + numeroNF;
		result = prime * result + ((placaVeiculo == null) ? 0 : placaVeiculo.hashCode());
		result = prime * result + serieNF;
		result = prime * result + ((transportadora == null) ? 0 : transportadora.hashCode());
		result = prime * result + ((valorTotal == null) ? 0 : valorTotal.hashCode());
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
		NotaFiscal other = (NotaFiscal) obj;
		if (dataEmissao == null) {
			if (other.dataEmissao != null)
				return false;
		} else if (!dataEmissao.equals(other.dataEmissao))
			return false;
		if (destinatário == null) {
			if (other.destinatário != null)
				return false;
		} else if (!destinatário.equals(other.destinatário))
			return false;
		if (emitente == null) {
			if (other.emitente != null)
				return false;
		} else if (!emitente.equals(other.emitente))
			return false;
		if (motorista == null) {
			if (other.motorista != null)
				return false;
		} else if (!motorista.equals(other.motorista))
			return false;
		if (numeroNF != other.numeroNF)
			return false;
		if (placaVeiculo == null) {
			if (other.placaVeiculo != null)
				return false;
		} else if (!placaVeiculo.equals(other.placaVeiculo))
			return false;
		if (serieNF != other.serieNF)
			return false;
		if (transportadora == null) {
			if (other.transportadora != null)
				return false;
		} else if (!transportadora.equals(other.transportadora))
			return false;
		if (valorTotal == null) {
			if (other.valorTotal != null)
				return false;
		} else if (!valorTotal.equals(other.valorTotal))
			return false;
		return true;
	}
	
}
