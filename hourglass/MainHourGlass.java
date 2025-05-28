package hourglass;

public class MainHourGlass {
    
    public static void main(String[] args) {
        // Create a new HourGlass object
        HourGlass hg = new HourGlass();

        // Display initial recommendation about the hourglass
        hg.recommend();

        // Simulate sand flowing from side A to B while standing upright
        hg.sand();

        // Rotate the hourglass 180 degrees (B becomes the top)
        hg.rotateRight180();

        // Simulate sand flowing back from side B to A
        hg.sand();

        // Rotate again 180 degrees (A becomes the top again)
        hg.rotateRight180();

        // Simulate sand flowing from A to B again
        hg.sand();
    }
}
