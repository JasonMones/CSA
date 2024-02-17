package Unit5.Lesson21;


public class KnightTourTest
{
    public static void main(String[] args)
    {
        KnightsTour2 tour = new KnightsTour2(1,1);
        tour.loadReferenceBoard();
        tour.createBoard();
        while (true) {
          if (tour.canMoveKnight()) {
              tour.moveKnight();
          } else {
              tour.printBoard();
              tour.printReferenceBoard();
              if (tour.getMoveNumber() < 65) {
                  System.out.println("No more possible moves!");
              } else {
                  System.out.println("All squares traveled to!");
              }
              System.out.println(tour.getMoveNumber()-1 + " squares were visted");
              break;
          }
        }
    } //make leftmost column and uppermost row different than zero
}
