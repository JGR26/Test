package models;

import planta.layer.iColor;
import planta.layer.iPlanta;

public class Cactus extends Planta implements iPlanta,iColor{


	public String colorDeFlor(String color) {
		
		return "No tienen Flor.";
	}

	public String metodoDeCrianza() {
		
		return "uso de sustrato y luz directa";
	}
}
