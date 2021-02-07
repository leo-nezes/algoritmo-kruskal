package com.algoritmo.kruskal;

import java.util.ArrayList;
import java.util.Arrays;
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
		
		for (int i = 1; i < grafo.getArestas().size(); i++) {
	    	String nomeOrigem = grafo.getArestas().get(i).getOrigem().getNome();
	    	String nomeDestino = grafo.getArestas().get(i).getDestino().getNome();
	    	
	    	
	    	
	    	this.conjuntos.forEach(subconjunto -> {
	    	
	    		System.out.println(subconjunto.contains(nomeOrigem));
	    		if(subconjunto.contains(nomeOrigem)) {
    				subconjunto.add(nomeDestino);
    				return;
    			}
	    		
	    		System.out.println(subconjunto.contains(nomeDestino));
	    		if(subconjunto.contains(nomeDestino)) {
    				subconjunto.add(nomeOrigem);
    				return;
    			}
	    		
	    		// ArrayList<String> novoSubgrupo = new ArrayList<>(Arrays.asList(nomeOrigem, nomeDestino));
		    	
		    	// this.conjuntos.add(novoSubgrupo);
	    		
	    		/*for(int j = 0; j < subconjunto.size(); j++) {
	    			
	    			System.out.println(subconjunto.get(j));
	    			
	    			if(subconjunto.get(j) == nomeOrigem) {
	    				subconjunto.add(nomeDestino);
	    				break;
	    			}
	    			
	    			if(subconjunto.get(j) == nomeDestino) {
	    				subconjunto.add(nomeOrigem);
	    				break;
	    			}
	    			
	    		}*/
	    		
	    	});
	    	
	    	// ArrayList<String> novoSubgrupo = new ArrayList<>(Arrays.asList(nomeOrigem, nomeDestino));
	    	
	    	// this.conjuntos.add(novoSubgrupo);
	    }
		
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

	    conjuntos.add(primeiroGrupo);
	}
	
	@Override
	public String toString() {
		conjuntos.forEach(subconjunto -> {
			System.out.println(subconjunto);
		});
		return super.toString();
	}
}
