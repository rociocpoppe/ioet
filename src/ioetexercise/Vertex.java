package ioetexercise;

import java.util.LinkedList;

public class Vertex {

	private String vertex;
	LinkedList<Arc>arcs;
	
	public Vertex() {
	}

	public Vertex(String vertex) {
		this.vertex=vertex;
		arcs = new LinkedList<Arc>();
	}

	public String getVertex() {
		return vertex;
	}

	public void setVertex(String vertex) {
		this.vertex = vertex;
	}

	public LinkedList<Arc> getArcs() {
		return new LinkedList<>(arcs);
	}

	public void addArc(Arc aux) {
		this.arcs.add(aux);
	}
	
	
	public boolean existsArc(String adjacentArc) {
		boolean result= false;
		for (Arc a: arcs ) {
			if (a.getDestinationVertex().equals(adjacentArc)){
				result=true;
				return result;
			}
		}
		return result;
	}
	

	@Override
	public String toString() {
		return " " + vertex ;
	}
	
}
