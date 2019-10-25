public class Game{
    public Game() {
    Piece[][] board = new Piece[8][8];
    }
    public static void main(String[] args) {
        // Game g = new Game();
        Queen q = new Queen();
        Position p = new Position(4,7);
        if (q.isValidMove(p) == true) {
            System.out.println("ok, done");
        } else {
            System.out.println("do it again");
        }
        System.out.println(q.position.row);
    }
}