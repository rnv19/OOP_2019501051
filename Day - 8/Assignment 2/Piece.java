public class Piece{
    Position position;
    Piece() {
        position = new Position(0, 0);
    }
    boolean isValidMove(Position newPosition) {
        if (newPosition.row > 0 && newPosition.column > 0 && newPosition.row < 8 && newPosition.column < 8) {
            return true;
        }
        return false;
    }
    void move(Position position){
        this.position.row = position.row;
        this.position.column = position.column;
    }
}
