package Lab8;

import Lab7.*;

import java.util.ArrayList;

public class source {
    public static void main(String[] args) {
        ArrayList<GemetricBody> objects = new ArrayList<>();

        Cub cub = new Cub(10);
        Sphere sphere = new Sphere(20);
        Parallelepiped parallelepiped = new Parallelepiped(20,20,20);

        objects.add(cub);
        objects.add(sphere);
        objects.add(parallelepiped);

        GeometricBodyController geometricBodyController = new GeometricBodyController();

        System.out.println(geometricBodyController.biggestVolume(objects));
        System.out.println(geometricBodyController.biggestSurface(objects));
    }
}
