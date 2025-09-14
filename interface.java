interface Chess{
    void moves();
}
class King implements Chess{
    public void moves(){
        System.out.println("vertical,diagonal,horizontal");
    }
}
class Rook implements  Chess{
    public void moves(){
        System.out.println("vertical,horizontal");
    }
}
class Queen implements Chess{
    public void moves(){
        System.out.println("vertical,horizontal,diagonal");
    }
}


public class interface {
    public static void main(String args[]){
        Queen q=new Queen();
        q.moves();

    }
}
