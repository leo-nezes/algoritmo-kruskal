package com.lista.adjacente;

import java.util.ArrayList;
import java.util.List;

public class Vertice {
    private String nome;
    private List<Aresta> adjacencias;
    
    Vertice(String nome) {
        this.nome = nome;
        this.adjacencias = new ArrayList<Aresta>();
    }

    void addAdjacencia(Aresta e) {
    	adjacencias.add(e);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aresta> getAdjacencias() {
		return adjacencias;
	}

	public void setAdjacencias(List<Aresta> adjacencias) {
		this.adjacencias = adjacencias;
	}

}
