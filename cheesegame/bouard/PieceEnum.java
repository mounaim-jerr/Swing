package ma.jerroudi.cheesegame.bouard;

import ma.jerroudi.cheesegame.bouard.gui.TeretoryEnum;

import static ma.jerroudi.cheesegame.bouard.gui.TeretoryEnum.*;


public enum PieceEnum {

    BISHOP_WHITE(HIGH, "src/main/java/ma/jerroudi/cheesegame/images/BishopW.png",2),
    BISHOP_BLACK(LOW, "src/main/java/ma/jerroudi/cheesegame/images/BishopB.png",8),

    KING_WHITE(HIGH, "src/main/java/ma/jerroudi/cheesegame/images/KingW.png",6),
    KING_BLACK(LOW, "src/main/java/ma/jerroudi/cheesegame/images/KingB.png",12),

    KNIGHT_WHITE(HIGH, "src/main/java/ma/jerroudi/cheesegame/images/KnightW.png",3),
    KNIGHT_BLACK(LOW, "src/main/java/ma/jerroudi/cheesegame/images/KnightB.png",9),

    PAWN_WHITE(HIGH, "src/main/java/ma/jerroudi/cheesegame/images/PawnW.png",1),
    PAWN_BLACK(LOW, "src/main/java/ma/jerroudi/cheesegame/images/PawnB.png",7),

    QUEEN_WHITE(HIGH, "src/main/java/ma/jerroudi/cheesegame/images/QueenW.png",5),
    QUEEN_BLACK(LOW, "src/main/java/ma/jerroudi/cheesegame/images/QueenB.png",11),

    ROCK_WHITE(HIGH, "src/main/java/ma/jerroudi/cheesegame/images/RockW.png",4),
    ROCK_BLACK(LOW, "src/main/java/ma/jerroudi/cheesegame/images/RockB.png",10);

    private String path;
    private TeretoryEnum teretory;
    private int index;

    PieceEnum(TeretoryEnum teretory, String path , int index) {
        this.teretory = teretory;
        this.path = path;
        this.index= index;

    }

    public TeretoryEnum getTeretory() {
        return teretory;
    }

    public String getPath() {
        return this.path;
    }

    public int getIndex() {
        return this.index;
    }
    public static String getPathByIndex(int index){
        PieceEnum[] values = values();
        for (int j = 0; j< values.length; j++)
           if (values[j].getIndex()==index){
               return values[j].path;
           }
        return "";
    }
}
