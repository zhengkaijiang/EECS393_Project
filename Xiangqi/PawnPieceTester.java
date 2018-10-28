import org.junit.*;
import static org.junit.Assert.*;
import java.awt.*;
import javax.swing.*;

/*a test class for PawnPiece*/
public class PawnPieceTester{
  
  /*test isLegalNonCaptureMove method*/
  public void testIsLegalNonCaptureMove(){
    ChessBoard test = new ChessBoard(10,9,new XiangqiDisplay(), new Xiangqi());
    Piece a = new PawnPiece(test,Color.RED, "P", Xiangqi.Side.NORTH,null);
    test.addPiece(a,3,0);
    
    assertTrue(a.isLegalNonCaptureMove(4,0));
    assertFalse(a.isLegalNonCaptureMove(3,1));
    assertFalse(a.isLegalNonCaptureMove(2,0));
  }
  
  /*test moveDone method*/
  public void testMoveDone(){
    ChessBoard test = new ChessBoard(10,9,new XiangqiDisplay(), new Xiangqi());
    Piece a = new PawnPiece(test,Color.RED, "P", Xiangqi.Side.NORTH,null);
    test.addPiece(a,5,0);
    
    a.moveDone();
    assertFalse(a.isLegalNonCaptureMove(4,0));
    assertTrue(a.isLegalNonCaptureMove(6,0));
    assertTrue(a.isLegalNonCaptureMove(5,1));
  }
  
}
    