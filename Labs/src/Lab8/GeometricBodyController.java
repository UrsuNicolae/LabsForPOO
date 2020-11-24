package Lab8;

import Lab7.Figure;

import java.util.ArrayList;

public class GeometricBodyController {
    GemetricBody biggestVolume(ArrayList<GemetricBody> objects){
        GemetricBody maxVolume = objects.get(0);

        for(GemetricBody obj : objects){
            if(obj.getVolume() > maxVolume.getVolume()){
                maxVolume = obj;
            }
        }

        return maxVolume;
    }

    GemetricBody biggestSurface(ArrayList<GemetricBody> objects){
        GemetricBody maxSurface = objects.get(0);

        for(GemetricBody obj : objects){
            if(obj.getSurface() > maxSurface.getSurface()){
                maxSurface = obj;
            }
        }

        return maxSurface;
    }
}
