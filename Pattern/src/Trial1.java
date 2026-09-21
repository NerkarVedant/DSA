void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Height:");
    int num1 = scanner.nextInt();

//    for (int i = 1; i <= num1; i++) {
//        for (int j = 0; j < i ; j++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//    }
//*
//* *
//* * *
//* * * *
//* * * * *

//    for (int i = 0; i < num1; i++) {
//        for (int j = 0; j <= num1 ; j++) {
//            if (j < num1 - i) {
//                System.out.print(" ");
//            } else {
//                System.out.print("* ");
//            }
//        }
//        System.out.println();
//    }
//     *
//    * *
//   * * *
//  * * * *
// * * * * *

    //numbers pyramid
//    for (int i = 0; i < num1 ; i++) {
//        for (int j = 0; j <= num1; j++) {
//            if (j < num1 - i) {
//                System.out.print(" ");
//            } else {
//                System.out.print(i + 1 + " ");
//            }
//        }
//        System.out.println();
//    }
//    1
//   2 2
//  3 3 3
// 4 4 4 4
//5 5 5 5 5
    for (int i = 0; i < num1; i++) {
        for (int j = 0; j <= num1; j++) {
            if (j < num1 - i){
                System.out.print(" ");
            }
            else {
                System.out.print(Math.abs((j+1) - (num1 -i))+" ");
            }
        }
        System.out.println();
    }

}


