package JavaArrayPassByReference;

public class PassByReference {
    public static void passMethod(String a[]){
        a[0] = "Changed";
    }
    public static void main(String[] args) {
        String[] tab = {"un","deux","trois"}; 

        // Avant le changement
        for (int index = 0; index < tab.length; index++) {
            System.out.println(tab[index]);
        }
        //Apres le changement
        PassByReference.passMethod(tab);
        for (int index = 0; index < tab.length; index++) {
            System.out.println(tab[index]);
        }
    }
}
