package JavaArray;

public class array {
    public static void main(String[] args) {
        // Declaration et construction
        int[] myArray = new int[5];
        // Initialisation
        for (int index = 0; index < myArray.length; index++) {
            myArray[index]=index+1;
        }
        // Affichage
        for (int index = 0; index < myArray.length; index++) {
            System.out.println("item"+index+" = "+myArray[index]);
        }
    }
}
