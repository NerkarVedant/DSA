void main() {
    int count = 5;

    for (int i = 1; i <=count ; i++) {

        for (int j = 1; j <=count; j++) {

            if(j < (i)){
                System.out.print(" ");
            }
            else{
                System.out.print("*");
            }

        }
        System.out.println();

    }




}