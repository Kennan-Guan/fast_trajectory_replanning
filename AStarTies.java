//Shows the effects of different tiebreak versions
public class AStarTies {
    public static void main(String[] args) {
        Grid gridworld = new Grid(0, 0, 19, 19, false);
        System.out.println("Original Grid:");
        gridworld.printGrid();
        System.out.println();

        AStar favor_small_g = new AStar(gridworld, true, false, false);
        if (favor_small_g.search()) {
            System.out.println("Path Found!");
        } else {
            System.out.println("Path not found!");
        }
        System.out.println("Smaller G-Values Number of expansions: " + favor_small_g.numExpansions);
        

        AStar favor_largeg = new AStar(gridworld, false, false, false);
        if (favor_largeg.search()) {
           System.out.println("Path Found!");
        } else {
           System.out.println("Path not found!");
        }
        System.out.println("Larger G-Values Number of expansions: " +   favor_largeg.numExpansions);

    }
}