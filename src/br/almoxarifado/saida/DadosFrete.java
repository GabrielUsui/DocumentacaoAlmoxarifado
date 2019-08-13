package br.almoxarifado.saida;

import java.util.Date;

public class DadosFrete 
{
	private Date dataSaida;
	private String nomeTransportador;
	private String dataVeiculo;
	private String municipio;
	private String uf;
	private boolean fretePagoPorEmitente;
	public DadosFrete(Date dataSaida, String nomeTransportador, String dataVeiculo, String municipio, String uf,
			boolean fretePagoPorEmitente) {
		super();
		this.dataSaida = dataSaida;
		this.nomeTransportador = nomeTransportador;
		this.dataVeiculo = dataVeiculo;
		this.municipio = municipio;
		this.uf = uf;
		this.fretePagoPorEmitente = fretePagoPorEmitente;
	}
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	public String getNomeTransportador() {
		return nomeTransportador;
	}
	public void setNomeTransportador(String nomeTransportador) {
		this.nomeTransportador = nomeTransportador;
	}
	public String getDataVeiculo() {
		return dataVeiculo;
	}
	public void setDataVeiculo(String dataVeiculo) {
		this.dataVeiculo = dataVeiculo;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public boolean isFretePagoPorEmitente() {
		return fretePagoPorEmitente;
	}
	public void setFretePagoPorEmitente(boolean fretePagoPorEmitente) {
		this.fretePagoPorEmitente = fretePagoPorEmitente;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataSaida == null) ? 0 : dataSaida.hashCode());
		result = prime * result + ((dataVeiculo == null) ? 0 : dataVeiculo.hashCode());
		result = prime * result + (fretePagoPorEmitente ? 1231 : 1237);
		result = prime * result + ((municipio == null) ? 0 : municipio.hashCode());
		result = prime * result + ((nomeTransportador == null) ? 0 : nomeTransportador.hashCode());
		result = prime * result + ((uf == null) ? 0 : uf.hashCode());
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
		DadosFrete other = (DadosFrete) obj;
		if (dataSaida == null) {
			if (other.dataSaida != null)
				return false;
		} else if (!dataSaida.equals(other.dataSaida))
			return false;
		if (dataVeiculo == null) {
			if (other.dataVeiculo != null)
				return false;
		} else if (!dataVeiculo.equals(other.dataVeiculo))
			return false;
		if (fretePagoPorEmitente != other.fretePagoPorEmitente)
			return false;
		if (municipio == null) {
			if (other.municipio != null)
				return false;
		} else if (!municipio.equals(other.municipio))
			return false;
		if (nomeTransportador == null) {
			if (other.nomeTransportador != null)
				return false;
		} else if (!nomeTransportador.equals(other.nomeTransportador))
			return false;
		if (uf == null) {
			if (other.uf != null)
				return false;
		} else if (!uf.equals(other.uf))
			return false;
		return true;
	}
}
