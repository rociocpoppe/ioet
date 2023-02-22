package ioetexercise;

import java.util.ArrayList;

public interface Graph <T>{
    
	    // Adds a vertex 
		public void addVertex(String vertex);

		// Adds an arc with a value connecting an origin vertex with a destination vertex
		public void addArc(String originVertex, String destinationVertex);
		
		// Gets a list of vertexes from the graph
		public ArrayList<String> getVertexes();

		
		
}

