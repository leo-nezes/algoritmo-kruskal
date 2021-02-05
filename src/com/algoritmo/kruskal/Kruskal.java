package com.algoritmo.kruskal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.lista.adjacente.*;

public class Kruskal {
	private Grafo grafo;
	private ArrayList<ArrayList<String>> conjuntos;
	private List<Vertice> listaVertices;
	
	public Kruskal (Grafo grafo) {
		this.grafo = grafo;
		this.conjuntos = new ArrayList<ArrayList<String>>();
		this.listaVertices = new ArrayList<Vertice>();
	}
	
	public void iniciarAlgoritmoKruskal() {
		this.pegarVertices();
		this.organizarArestasOrdemCrescente();
		
		for (Aresta aresta : grafo.getArestas()) {
	    	String nomeOrigem = aresta.getOrigem().getNome();
	    	String nomeDestino = aresta.getDestino().getNome();
	    	
	    	this.conjuntos.forEach(subconjunto -> {
	    	
	    		for(int i = 0; i < subconjunto.size(); i++) {
	    			
	    			if(subconjunto.get(i) == nomeOrigem) {
	    				subconjunto.add(nomeDestino);
	    				break;
	    			}
	    			
	    			if(subconjunto.get(i) == nomeDestino) {
	    				subconjunto.add(nomeOrigem);
	    				break;
	    			}
	    		}
	    		
	    	});
	    }
		
	}
	
	private void pegarVertices() {
		listaVertices.addAll(this.grafo.getVertices());
	}
	
	private void organizarArestasOrdemCrescente() {
	    Collections.sort(grafo.getArestas());
	}
}
