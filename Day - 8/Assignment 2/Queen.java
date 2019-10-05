class piece{



    public boolean isValidMove(int x, int y){
        if ((x > 0 && y > 0) && (x < 8 &&y < 8 )){
            return true;
        }else return false;
    }

    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }

}


class Queen extends piece {
    int x;
    int y;
    public isValidMove(int x, int y){
        super.isValidMove(x, y);
        if (this.x == x) System.out.println("valid move");
        else if (this.y == y) System.out.println("valid move");
        else if ((x - this.x) == (y - this.y)) System.out.println("valid move");
        else if ((x + y) == (this.x + this.y)) System.out.println("valid move");
        else System.out.println("not valid");
    }

    public move(int x,int y){
        this.x = x;
        this.y = y;
    }
}