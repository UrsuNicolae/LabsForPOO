package Lab2.Ex1_3;

import java.util.WeakHashMap;

public class Box {
    int Heigth;
    int Width;
    int depth;

    public Box()
    {
        this.Heigth = 1;
        this.Width = 1;
        this.depth = 1;
    }

    public Box(int value)
    {
        this.Heigth = value;
        this.Width = value;
        this.depth = value;
    }

    public Box(int val1, int val2, int val3)
    {
        this.Heigth = val1;
        this.Width = val2;
        this.depth = val3;
    }

    public void Print()
    {
        System.out.printf(String.valueOf(this.Heigth) + " ");
        System.out.printf(String.valueOf(this.Width) + " ");
        System.out.printf(String.valueOf(this.depth) + "\n");
    }

    public int Volum(){
        return Width * Heigth * depth;
    }

    public int Area(){
        return Width * Heigth * 2 + depth * Heigth * 2 + Width * depth * 2;
    }
}
