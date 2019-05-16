package entities.dungeon;

import entities.dungeon.Room.RoomType;

public class Level {

	public enum LevelType {
		FIELD, DESERT, TUNDRA, BEACH, CAVERN, JUNGLE, MOUNTAIN, RUINS, DUNGEON
	};

	private int id;
	private LevelType type;

	private int width;
	private int heigth;

	private Room startRoom;
	private Room endRoom;

	public Level() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LevelType getType() {
		return type;
	}

	public void setType(LevelType type) {
		this.type = type;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public Room getStartRoom() {
		return startRoom;
	}

	public void setStartRoom(Room startRoom) {
		this.startRoom = startRoom;
	}

	public Room getEndRoom() {
		return endRoom;
	}

	public void setEndRoom(Room endRoom) {
		this.endRoom = endRoom;
	}
	
	
	public String toString() {
		final StringBuilder stringBuilder = new StringBuilder("\n Level Id: " + getId());
		stringBuilder.append("\n Type: " + getType());
		stringBuilder.append("\n Size: " + getWidth() + " x " + getHeigth());
		stringBuilder.append("\n Type: " + getType());
		// TODO : Complete definition
		return stringBuilder.toString();
	}
	

	/*****************************************/

	public static final Level createLevel() {

		final Level level = new Level();
		level.setType(LevelType.CAVERN);
		level.setWidth(100);
		level.setHeigth(100);

		final Room startRoom = Room.createRoom();
		startRoom.setType(RoomType.START);
		level.setStartRoom(startRoom);

		final Room endRoom = Room.createRoom();
		endRoom.setType(RoomType.EXIT);
		level.setStartRoom(endRoom);
		// Connect both rooms

		return level;
	}

}
