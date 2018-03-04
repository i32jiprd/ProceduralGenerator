package tiles;

public class Tile {

	public enum TileType {
		ROOM_PORTAL_IN, ROOM_PORTAL_OUT, ROOM_CORRIDOR, ROOM, ROOM_TYPE
	};

	private TileType type;

	private String name;

	private int posX;
	private int posY;

	public Tile(TileType tileType) {
		this.type = tileType;

	}

	public TileType getRoomType() {
		return type;
	}

	public void setRoomType(final TileType tileType) {
		this.type = tileType;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(final int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(final int posY) {
		this.posY = posY;
	}

	public void setPos(final int posX, final int posY) {
		this.posX = posX;
		this.posY = posY;
	}

}
