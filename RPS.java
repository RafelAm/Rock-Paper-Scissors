import static org.junit.Assert.*;
import org.junit.Test;

public class KataTest {
    
    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", Kata.rps("rock", "scissors"));
        assertEquals("Player 1 won!", Kata.rps("scissors", "paper"));
        assertEquals("Player 1 won!", Kata.rps("paper", "rock"));
    }
    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", Kata.rps("scissors", "rock"));
        assertEquals("Player 2 won!", Kata.rps("paper", "scissors"));
        assertEquals("Player 2 won!", Kata.rps("rock", "paper"));
    }
    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", Kata.rps("scissors", "scissors"));
        assertEquals("Draw!", Kata.rps("paper", "paper"));
        assertEquals("Draw!", Kata.rps("rock", "rock"));
    }
    
}


public class Kata {
  public static String rps(String p1, String p2) {
    
    if(p1 == "scissors" && p2 == "paper" || p1 == "paper" && p2 == "rock" || p1 == "rock" && p2 == "scissors"){
      return "Player 1 won!";
    }else if(p1 == "scissors" && p2 == "rock" || p1 == "paper" && p2 == "scissors" || p1 == "rock" && p2 == "paper"){
      return "Player 2 won!";
    }else if(p1 == p2){
      return "Draw!";
    }
    
    
    return "";
  }
}
