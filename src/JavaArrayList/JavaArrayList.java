package JavaArrayList;
import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {
        // Déclaration et construction
        ArrayList<String> nameList=new ArrayList<>();

        System.out.println("Taille initial :"+nameList.size());

        nameList.add("KA");
        nameList.add("NDIAYE");
        nameList.add(1,"FALL");
        for (String item : nameList) {
            System.out.println(item);
        }

        System.out.println("Taille :"+nameList.size());
        nameList.remove("FALL");
        System.out.println(nameList.contains("FALL"));

    }
}
