package ioetexercise;

/*
 * La clase arco representa un arco del grafo. Contiene un vertice origen, un vertice destino y una etiqueta.
 * Nota: Para poder exponer los arcos fuera del grafo y que nadie los modifique se hizo esta clase inmutable
 * (Inmutable: una vez creado el arco no es posible cambiarle los valores).
 */
public class Arc {
	private String originVertex;
	private String destinationVertex;
	private int value;

	public Arc(String originVertex, String destinationVertex) {
		this.originVertex = originVertex;
		this.destinationVertex = destinationVertex;
	}
	
	public Arc() {
		value=0;
	}

	public String getOriginVertex() {
		return originVertex;
	}
	
	public String getDestinationVertex() {
		return destinationVertex;
	}
	
	public void setDestinationVertex(String destinationVertex) {
		this.destinationVertex = destinationVertex;
	}

	public void setOriginVertex(String originVertex) {
		this.originVertex = originVertex;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value=value;
	}
	
	@Override
	public String toString() {
		return "Arc [originVertex=" + originVertex + ", destinationVertex=" + destinationVertex + ", value=" + value + "]";
	}

	
	
	
}
