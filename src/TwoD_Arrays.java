
public class TwoD_Arrays {

    public static void main(String[] args){

        String[][] cats = new String[3][3];

        cats[0][0] = "Siamese";
        cats[0][1] = "Persian";
        cats[0][2] = "Bengal";
        cats[1][0] = "Sphynx";
        cats[1][1] = "Serval";
        cats[1][2] = "Caracal";
        cats[2][0] = "Maine Coon";
        cats[2][1] = "Shorthair";
        cats[2][2] = "Ragdoll";

        for(int i=0; i<cats.length; i++){
            System.out.println();
            for(int j=0 ; j< cats[i].length; j++){
                System.out.println(cats[i][j]+" ");

            }
        }


    }
}
// 2d Arrays - an array of arrays like having rows and columns
// in the 2nd "new String" the first square braces will be the rows and 2nd will be columns