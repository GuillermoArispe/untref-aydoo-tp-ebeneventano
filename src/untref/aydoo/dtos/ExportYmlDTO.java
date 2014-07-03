package untref.aydoo.dtos;

import java.util.ArrayList;
import java.util.List;

import untref.aydoo.dominio.Bicicleta;
import untref.aydoo.dominio.Trayectoria;

public class ExportYmlDTO {
	private List<Bicicleta> bicicletaMasUsada = new ArrayList<Bicicleta>();
	private List<Bicicleta> bicicletaMenosUsada = new ArrayList<Bicicleta>();
	private Integer promedioUso;
	private List<Trayectoria> mayorRecorridoRealizado = new ArrayList<Trayectoria>();
	private Integer tiempoBicicletaMasUtilizada;
	private List<Bicicleta> bicicletaUtilizadaMasTiempo = new ArrayList<Bicicleta>();

	public void setBicicletaMasUsada(List<Bicicleta> bicicletaMasUsada) {
		this.bicicletaMasUsada = bicicletaMasUsada;
	}

	public List<Bicicleta> getBicicletaMasUsada() {
		return bicicletaMasUsada;
	}

	public void setPromedioUso(Integer promedioUso) {
		this.promedioUso = promedioUso;
	}

	public Integer getPromedioUso() {
		return promedioUso;
	}

	public void setMayorRecorridoRealizado(
			List<Trayectoria> mayorRecorridoRealizado) {
		this.mayorRecorridoRealizado = mayorRecorridoRealizado;
	}

	public List<Trayectoria> getMayorRecorridoRealizado() {
		return mayorRecorridoRealizado;
	}

	public void setBicicletaMenosUsada(List<Bicicleta> bicicletaMenosUsada) {
		this.bicicletaMenosUsada = bicicletaMenosUsada;
	}

	public List<Bicicleta> getBicicletaMenosUsada() {
		return bicicletaMenosUsada;
	}

	public void addBicicletaMasUsada(Bicicleta bicicleta) {
		this.bicicletaMasUsada.add(bicicleta);
	}

	public void addBicicletaMenosUsada(Bicicleta bicicleta) {
		this.bicicletaMenosUsada.add(bicicleta);
	}

	public void addTrayectoriaMasRealizada(Trayectoria trayectoria) {
		this.mayorRecorridoRealizado.add(trayectoria);
	}

	public Integer getTiempoBicicletaMasUtilizada() {
		return tiempoBicicletaMasUtilizada;
	}

	public void setTiempoBicicletaMasUtilizada(Integer tiempoBicicletaMasUtilizada) {
		this.tiempoBicicletaMasUtilizada = tiempoBicicletaMasUtilizada;
	}

	public List<Bicicleta> getBicicletaUtilizadaMasTiempo() {
		return bicicletaUtilizadaMasTiempo;
	}

	public void setBicicletaUtilizadaMasTiempo(
			List<Bicicleta> bicicletaUtilizadaMasTiempo) {
		this.bicicletaUtilizadaMasTiempo = bicicletaUtilizadaMasTiempo;
	}
	
	public void addBicicletaUtilizadaMasTiempo(Bicicleta bicicleta){
		this.bicicletaUtilizadaMasTiempo.add(bicicleta);
	}
	
}
