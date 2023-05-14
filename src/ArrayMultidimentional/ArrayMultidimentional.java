package ArrayMultidimentional;

public class ArrayMultidimentional {
    public static void main(String[] args) {
        // Déclaration et Construction
        int twoD[][] = new int[2][3];
        // Initialisation
        twoD[0][0]=0;
        twoD[0][1]=1;
        twoD[0][2]=2;
        twoD[1][0]=10;
        twoD[1][1]=10;
        twoD[1][2]=12;
        // Affichage
        for (int i = 0; i <twoD.length; i++) {
            System.out.println("Tab"+i);
            for (int j = 0; j < twoD[0].length; j++) {
                System.out.println(twoD[i][j]);
            }
        }
    }
}
