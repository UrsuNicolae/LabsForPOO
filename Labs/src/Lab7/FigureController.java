package Lab7;

import java.util.ArrayList;

public class FigureController {
    Figure biggestArea(ArrayList<Figure> figures){
        Figure maxArea = figures.get(0);

        for(Figure figure : figures){
            if(figure.getArea() > maxArea.getArea()){
                maxArea = figure;
            }
        }

        return maxArea;
    }

    Figure biggestPerimeter(ArrayList<Figure> figures){
        Figure maxPerimeter = figures.get(0);

        for(Figure figure : figures){
            if(figure.getPerimeter() > maxPerimeter.getPerimeter()){
                maxPerimeter = figure;
            }
        }

        return maxPerimeter;
    }
}
