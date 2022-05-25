package main;

import java.util.ArrayList;

import structures.Edge;
import structures.Graph;
import structures.Tree;
import structures.Vertex;

public class Main {

	public static void main(String[] args) {
		Graph<String> routes = new Graph<>();
			
		routes.addVertex("Chiminangos");
		routes.addVertex("Flora Industrial");
		routes.addVertex("Salomia");
		routes.addVertex("Torre de Cali");
		routes.addVertex("Estadio");
		routes.addVertex("Universidades");
		routes.addVertex("Unidad Deportiva");
		
		routes.addEdge("Chiminangos", "Flora Industrial", 10);
		routes.addEdge("Chiminangos", "Flora Industrial", 10);
		routes.addEdge("Flora Industrial", "Salomia", 12);
		routes.addEdge("Salomia", "Torre de Cali", 13);
		routes.addEdge("Torre de Cali", "Estadio", 15);
		routes.addEdge("Estadio", "Universidades", 15);
		routes.addEdge("Torre de Cali", "Unidad Deportiva", 5);
		routes.addEdge("Unidad Deportiva", "Universidades", 5);
		
		
		
		System.out.println("-----------------------");
		
		
		routes.initPrim(routes.search("Chiminangos"));
		Tree<String> arbolGeneradorMinimo = routes.getArbolGeneradorMinimo();
		ArrayList<String> preOrder = arbolGeneradorMinimo.preOrder();
		
		for(String s : preOrder) {
			System.out.println(s);
		}
		
	}

}
