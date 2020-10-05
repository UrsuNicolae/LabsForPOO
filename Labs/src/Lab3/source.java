package Lab3;

import com.sun.javafx.scene.traversal.SubSceneTraversalEngine;

public class source {
    public static void main(String[] args) {
        HugeText hugeText = new HugeText();
        //System.out.println(hugeText.GetNrOfSentences());
        //System.out.println(hugeText.GetNrOfWord());
        //System.out.println(hugeText.GetNrOfLetters());
        //System.out.println(hugeText.GetNrOfVowels());
        //System.out.println(hugeText.GetNrOfConsonas());
        hugeText.Top5Words();
    }
}
