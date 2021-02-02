package com.lista.adjacente;

public class Aresta implements Comparable<Aresta> {
	private Vertice origem;
	private Vertice destino;
	private Integer peso; 

    Aresta(Vertice origem, Vertice destino, Integer peso) {
    	this.origem = origem;
        this.destino = destino;
        this.peso = peso;
    }

	public Vertice getDestino() {
		return destino;
	}

	public void setDestino(Vertice destino) {
		this.destino = destino;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	@Override
	public int compareTo(Aresta aresta) {
		return this.peso - aresta.peso;
	}
    
}