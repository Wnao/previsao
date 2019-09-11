package br.usjt.hellospringboot.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="previsoes")
public class Previsao implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String dia;
	
	private Double Min;
	
	private Double Max;
	
	private Double hum;
	
	private String des;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public Double getMin() {
		return Min;
	}

	public void setMin(Double min) {
		Min = min;
	}

	public Double getMax() {
		return Max;
	}

	public void setMax(Double max) {
		Max = max;
	}

	public Double getHum() {
		return hum;
	}

	public void setHum(Double hum) {
		this.hum = hum;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}
	
	
	
	
}
