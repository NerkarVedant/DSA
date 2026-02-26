void main() {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the  height: ");
    int num1 = scanner.nextInt();

    System.out.print("Enter the width: ");
    int num2 = scanner.nextInt();

    scanner.close();

    for (int i = 0; i<num1; i++){
        for(int j = 0; j<num2; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
