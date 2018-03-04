package graph;

import java.util.ArrayList;

public class Vertex<T> {

	private ArrayList<Vertex<T>> neighbors;
	private T value;

	/**
	 * 
	 * @param label
	 *            The unique label associated with this Vertex
	 */
	public Vertex(final T label) {
		this.value = label;
		this.neighbors = new ArrayList<Vertex<T>>();
	}

	/**
	 * This method adds an Edge to the incidence neighborhood of this graph iff the
	 * edge is not already present.
	 * 
	 * @param edge
	 *            The edge to add
	 */
	public void addNeighbor(final Vertex<T> edge) {
		if (neighbors.contains(edge)) {
			return;
		}

		neighbors.add(edge);
	}

	/**
	 * 
	 * @param other
	 *            The edge for which to search
	 * @return true iff other is contained in this.neighborhood
	 */
	public boolean containsNeighbor(final Vertex<T> other) {
		return neighbors.contains(other);
	}

	/**
	 * 
	 * @param index
	 *            The index of the Edge to retrieve
	 * @return Edge The Edge at the specified index in this.neighborhood
	 */
	public Vertex<T> getNeighbor(final int index) {
		return neighbors.get(index);
	}

	/**
	 * 
	 * @param index
	 *            The index of the edge to remove from this.neighborhood
	 * @return Edge The removed Edge
	 */
	Vertex<T> removeNeighbor(final int index) {
		return neighbors.remove(index);
	}

	/**
	 * 
	 * @param e
	 *            The Edge to remove from this.neighborhood
	 */
	public void removeNeighbor(final Vertex<T> e) {
		neighbors.remove(e);
	}

	/**
	 * 
	 * @return String The label of this Vertex
	 */
	public T getValue() {
		return value;
	}

	/**
	 * 
	 * @return String A String representation of this Vertex
	 */
	public String toString() {
		return value.toString();
	}

	/**
	 * 
	 * @return ArrayList<Edge> A copy of this.neighborhood. Modifying the returned
	 *         ArrayList will not affect the neighborhood of this Vertex
	 */
	public ArrayList<Vertex<T>> getNeighbors() {
		return new ArrayList<Vertex<T>>(neighbors);
	}

}
