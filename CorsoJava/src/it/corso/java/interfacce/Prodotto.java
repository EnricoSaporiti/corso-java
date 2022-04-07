package it.corso.java.interfacce;

public class Prodotto implements GeneraDati {
	private long id;
	private String nome;
	private String codice;
	private double prezzo;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public String generaXML() {
		String xml = "" +
		"<prodotto>" +
		"	<codice></codice>" +
		"	<nome></nome>" +
		"	<prezzo></prezzo>" +			
		"</prodotto>";
		

		return xml;
	}
	
	

	
}
