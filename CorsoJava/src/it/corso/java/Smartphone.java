package it.corso.java;

public class Smartphone {
	
	private String display;
	private String cpu;
	private String ram;
	private String marca;
	private String modello;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Smartphone di marca " + getMarca() + " e modello " + getModello();
	}
	public Smartphone(String marca, String modello) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.cpu = "Z80";
		this.display = "14\"";
				
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	
	
	

}
