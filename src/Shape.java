import java.util.ArrayList;
public class Shape{
    private ArrayList<Point> points;
    public Shape(ArrayList<Point> points){
      this.points  = points;
    }
    public void addPoints(Point point){
        points.add(point);
    }
    public double calculateperimeter(){
        double perimeter = 0.0;
        int numPoints = points.size();
        for(int i = 0; i < numPoints; i++){
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % numPoints);
            perimeter += currentPoint.distanceTo(nextPoint);
        }
        return perimeter;
    }
    public double findlongestSide() {
        double longestSide = 0.0;

        for (int i = 0; i < points.size(); i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size());
            double currentSide = currentPoint.distanceTo(nextPoint);
            if (currentSide > longestSide) {
                longestSide = currentSide;
            }
        }

        return longestSide;
    }

    public double calculateAverageSide() {
        double totalSideLength = 0.0;
        int numSides = points.size();

        for (int i = 0; i < numSides; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % numSides);
            totalSideLength += currentPoint.distanceTo(nextPoint);
        }

        return totalSideLength / numSides;
    }
}

