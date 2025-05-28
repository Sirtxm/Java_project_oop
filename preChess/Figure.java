package PreChessV2;

/**
 * Represents a general figure on a chess-like board.
 * Stores the figure's symbol, color, and position.
 */
public class Figure {
    public char name;       // The symbol representing the figure (e.g., 'K' for King)
    public String color;    // Color of the figure ("white" or "black")
    public String position; // Current position in algebraic notation (e.g., "e4")

    /**
     * Constructor to initialize a figure with a name, color, and position.
     *
     * @param name     Character symbol of the figure
     * @param color    Color of the figure
     * @param position Initial board position (e.g., "d2")
     */
    public Figure(char name, String color, String position) {
        this.name = name;
        this.color = color;
        this.position = position;
    }

    /**
     * Moves the figure to a new position if the input is within board bounds.
     *
     * @param position New target position (e.g., "e5")
     */
    public void freeMove(String position) {
        int row = position.charAt(0) - 'a';                  // Convert file (a–h) to 0–7
        int column = 8 - Character.getNumericValue(position.charAt(1)); // Convert rank (1–8) to 0–7

        if (row < 0 || row >= 8 || column < 0 || column >= 8) {
            System.out.println("Position is out of bounds");
            return;
        }

        this.position = position;
    }
}
