package com.lista.adjacente;

public class ListaAdjacencia {

	public static void main(String[] args) {
		Grafo grafo = new Grafo();
        
		Vertice A = grafo.addVertice("A");
		Vertice B = grafo.addVertice("B");
		Vertice C = grafo.addVertice("C");
		Vertice D = grafo.addVertice("D");
		Vertice E = grafo.addVertice("E");
		
	    Aresta AB = grafo.addAresta(A, B, 4);
	    Aresta AC = grafo.addAresta(A, C, 8);
	    Aresta CB = grafo.addAresta(C, B, 11);
	    Aresta CD = grafo.addAresta(C, D, 9);
	    Aresta DE = grafo.addAresta(D, E, 7);
	    
        System.out.println(grafo);
	}

}
