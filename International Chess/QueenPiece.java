import java.awt.*;
import javax.swing.*;

/*represent a GuardPiece*/
public class QueenPiece extends Piece{
  /*create a GuardPiece*/
  public QueenPiece(ChessBoard board, Color color, String label, IChess.Side side, Icon icon){
    super(board, color, label, side, icon);
  }
  
  
  /*check whether the piece can move to input position
   * while there is an empty square*/
  public boolean isLegalNonCaptureMove(int x, int y){
    boolean result = true;
    
    if(this.getSide()== IChess.Side.NORTH){
      if(x>2||y<3||y>5){
        result=false;
      }
      else{
        if(Math.abs(this.getRow()-x)==1&&Math.abs(this.getColumn()-y)==1){
          result = true;
        }
        else{
          result = false;
        }
      }
    }
    else{
      if(x<7||y<3||y>5){
        result=false;
      }
      else{
        if(Math.abs(this.getRow()-x)==1&&Math.abs(this.getColumn()-y)==1){
          result = true;
        }
        else{
          result = false;
        }
      }
    }
    return result;
  }
  
}
        