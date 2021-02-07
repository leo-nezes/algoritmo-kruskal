package com.algoritmo.kruskal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.lista.adjacente.*;

public class Kruskal {
	private Grafo grafo;
	private ArrayList<ArrayList<String>> conjuntos;
	private ArrayList<String> newConjuntos;
	private List<Vertice> listaVertices;
	
	public Kruskal (Grafo grafo) {
		this.grafo = grafo;
		this.conjuntos = new ArrayList<ArrayList<String>>();
		this.newConjuntos = new ArrayList<String>();
		this.listaVertices = new ArrayList<Vertice>();
	}
	
	public void iniciarAlgoritmoKruskal() {
		this.pegarVertices();
		this.organizarArestasOrdemCrescente();
		
		for (int i = 1; i < grafo.getArestas().size(); i++) {
	    	String nomeOrigem = grafo.getArestas().get(i).getOrigem().getNome();
	    	String nomeDestino = grafo.getArestas().get(i).getDestino().getNome();
	    	
	    	this.conjuntos.forEach(subconjunto -> {
	    	
	    		
	    		boolean isVerticeOrigemExiste = newConjuntos.contains(nomeOrigem);
	    		boolean isVerticeDestinoExiste = newConjuntos.contains(nomeDestino);
	    		
	    		if (isVerticeOrigemExiste == false && isVerticeDestinoExiste == false) {
	    			this.newConjuntos.add(nomeDestino);
		    		this.newConjuntos.add(nomeOrigem);
		    		
	    			return;
	    		}
	    		
	    		
	    		if (isVerticeOrigemExiste == true && isVerticeDestinoExiste == false) {
	    			this.newConjuntos.add(nomeDestino);
		    		
	    			return;
	    		}
	    		
	    		if (isVerticeDestinoExiste == true && isVerticeOrigemExiste == false) {
		    		this.newConjuntos.add(nomeOrigem);
		    		
	    			return;
	    		}
	    		
	    	});
	    }
		
		this.conjuntos.clear();
		this.conjuntos.add(newConjuntos);
	}
	
	private void pegarVertices() {
		listaVertices.addAll(this.grafo.getVertices());
	}
	
	private void organizarArestasOrdemCrescente() {
	    Collections.sort(grafo.getArestas());
	
	    ArrayList<String> primeiroGrupo = new ArrayList<>(Arrays.asList(
	    									grafo.getArestas().get(0).getOrigem().getNome(), 
	    									grafo.getArestas().get(0).getDestino().getNome()
	    								));

	    this.conjuntos.add(primeiroGrupo);

	    this.newConjuntos.add(grafo.getArestas().get(0).getOrigem().getNome());
	    this.newConjuntos.add(grafo.getArestas().get(0).getDestino().getNome()); 
		
	}
	
	@Override
	public String toString() {
		conjuntos.forEach(subconjunto -> {
			System.out.println("Conjuntos: " + subconjunto);
		});
		
		return "";
	}
}
