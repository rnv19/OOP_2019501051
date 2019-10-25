public class Queen extends Piece {
    Queen(){
        this.position.row = 0;
        this.position.column = 3;
    }

    boolean isValidMove(Position newPosition) {
        if (super.isValidMove(newPosition) == true) {
        if (newPosition.row == this.position.row || newPosition.column == this.position.column ||
        Math.abs(newPosition.row - this.position.row) == Math.abs(newPosition.column - this.position.column)) {
            move(newPosition);
            return true;
        }
     }
     return false;
    }
    // void move(Position position) {

    // }
}