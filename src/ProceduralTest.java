import tiles.Tile;
import tiles.Tile.TileType;

import java.util.Random;

import graph.Vertex;

public class ProceduralTest {

	static final int MIN_CORRIDORS = 1;
	static final int MAX_CORRIDORS = 6; // UP, DOWN, EAST, WEST, NORTH, SOUTH
	static final int MAX_LEVELS = 5;

	static final int GENERATION_PERCENTAJE = 10;

	private Vertex<Tile> rootVertex = new Vertex<>(new Tile(TileType.ROOM_PORTAL_IN));

	private Random random = new Random();

	private int totalVortex = 1;

	public ProceduralTest() {
		System.out.println("ProceduralTest v0.1");
	}

	public void generateTree() {
		final int total = random.nextInt(MAX_CORRIDORS) + MIN_CORRIDORS;

		System.out.println("Inicial Corridors:" + total);

		for (int i = 0; i < total; i++) {
			generateCorridors(rootVertex, 0);
		}

		System.out.println("Total Size-->" + rootVertex.getNeighbors().size());
		System.out.println("Total totalVortex-->" + totalVortex);
	}

	public void generateCorridors(final Vertex<Tile> parent, int level) {
		//System.out.println("generateCorridors(" + level + ")");

		final Vertex<Tile> room = new Vertex<Tile>(new Tile(TileType.ROOM));
		final int total = random.nextInt(MAX_CORRIDORS + 1);

		//System.out.println("Corridores-->" + total);
		for (int i = 0; i < total; i++) {
			//totalVortex ++;
			final Vertex<Tile> corridor = new Vertex<Tile>(new Tile(TileType.ROOM_CORRIDOR));
			room.addNeighbor(corridor);

			final int percentaje = random.nextInt(100);
			//System.out.println("percentaje-->" + percentaje);
			if (percentaje > (GENERATION_PERCENTAJE) && level <= MAX_LEVELS) {
				generateCorridors(corridor, level + 1);
			}
		}

		String prefix = "\t";
		for (int i = 0; i < level; i++) {
			prefix += "\t";
		}

		System.out.println(prefix + "Corridor (" + level + ") Size-->" + room.getNeighbors().size());
		parent.addNeighbor(room);
		totalVortex ++;
	}

	public static void main(String[] args) {
		final ProceduralTest pt = new ProceduralTest();
		pt.generateTree();
	}

}
