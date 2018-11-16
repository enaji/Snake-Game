import javax.swing.JFrame;
public class Main extends JFrame
{
	private static final long serialVersionUID = 1L;
public Main()
  {
    GamePanel gamepanel = new GamePanel();
    add(gamepanel);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("THE SNAKE GAME");
    pack();
    setVisible(true);
    setLocationRelativeTo(null);
  }
  public static void main(String[] args)
  {
    new Main();
  }
}
