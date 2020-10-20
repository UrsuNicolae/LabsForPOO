package Lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.channels.SelectableChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class source {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("one_expression.txt");
        Scanner scan = new Scanner(file);
        String oneExpresion = scan.nextLine();

        checkParentheses check = new checkParentheses();
        System.out.println("Single expresion : " + check.Check(oneExpresion));

        File fileWithThreeExpressions = new File("three_expressions.txt");
        Scanner scan2 = new Scanner(fileWithThreeExpressions);
        List<String> expressions = new ArrayList<String>();
        while (scan2.hasNextLine()){
            expressions.add(scan2.nextLine());
        }
        Iterator i = expressions.iterator();
        int nr = 1;
        while (i.hasNext())
        {

            System.out.println("Expresion nr " + nr + " is : " + check.Check(i.next().toString()));
            nr++;
        }
    }
}
