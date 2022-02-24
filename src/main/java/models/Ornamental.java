package models;

import planta.layer.iColor;
import planta.layer.iPlanta;

public class Ornamental extends Planta implements iPlanta,iColor{

private String color;

	public String colorDeFlor(String color) {
		this.color=color;
		return color;
	}

	public String metodoDeCrianza() {
		
		return "uso de macetas con tierra y luz indirecta";
		
	}

	public String getColor() {
		return color;
	}
}
