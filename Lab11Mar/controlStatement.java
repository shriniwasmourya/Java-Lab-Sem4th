import java.util.Scanner;

class controlStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("if else using scanner class\n");
        System.out.println("Enter ur age ");
        int age = sc.nextInt();

        // if(age > 18){
        // System.out.println("You can vote ");
        // }else{
        // System.out.println("You cannot vote ");
        // }

        // //Nested if..else using scanner class
        if (age >= 1 && age <= 46) {
            if (age >= 1 && age < 5) {
                System.out.println("You are child ");
            }

            else if (age <= 18 && age >= 5) {
                System.out.println("You are Teenager ");
            } else if (age > 18 && age <= 45) {
                System.out.println("You are Middle age ");
            }
        } else {
            System.out.println(" You are to Old");
        }

        // Switch Case
        System.out.println(" Enter 1 for red \n Enter 2 for yellow \n Enter 3 for green ");
        int color = sc.nextInt();
        switch (color) {
            case 1:
                System.out.println(" You can't Go");
                break;
            case 2:
                System.out.println(" Wait");
                break;
            case 3:
                System.out.println(" You can Go");
                break;
            default:
            System.out.println(("You entered wrong input"));
                break;
        }

        // java Array
        

        // for(int i=1 ; i<=4 ; i++){
        // for(int j=1 ; j<=i ; j++){
        // System.out.printf("%d",j);
        // }
        // System.out.println();
        // }
        // int count = 1;
        // for(int i=0 ; i<=4 ; i++){
        // for(int j=0 ; j<=i ; j++){
        // System.out.printf("%d",count);
        // }
        // count += 2;
        // System.out.println();
        // }

        // for(int i=0 ; i<=4 ; i++){
        // for(int j=0 ; j<4-i ; j++){
        // System.out.printf(" ");
        // }

        // for(int j=0 ; j<=i ; j++){
        // System.out.printf("*");
        // }
        // System.out.println();
        // }

        //

    }
}