package ioetexercise;

import java.util.ArrayList;

public class DirectedGraph <T>implements Graph <T>{

	ArrayList<String> vertexes=new ArrayList<>();

	@Override
	public void addVertex(String vertex) {
		vertexes.add(vertex);
	}

	@Override
	public void addArc(String originVertex, String destinationVertex) {
		Vertex v= new Vertex();
		v.setVertex(originVertex);
		if(!v.existsArc(destinationVertex)){
			Arc arco= new Arc(originVertex, destinationVertex);
		}
	}

	@Override
	public ArrayList<String> getVertexes() {
		ArrayList<String> aux = new ArrayList<String>();
		for(String v: this.vertexes){
			aux.add(v);
		}
		return aux;
	}

}