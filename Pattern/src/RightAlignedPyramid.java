void main() {
    int count = 5;

    for (int i = 0; i <count ; i++) {

        for (int j = 0; j <count; j++) {

            if(j < (count-(i+1))){
                System.out.print(" ");
            }
            else{
                System.out.print("*");
            }

        }
        System.out.println();

    }

    //other logic
    int rows = 5;

    for (int i = 0; i < rows; i++) {
        // Print leading spaces
        for (int j = 0; j < rows - i - 1; j++) {
            System.out.print(" ");
        }
        // Print stars
        for (int k = 0; k <= i; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}