import java.util.Scanner;
class quizxx{
    Scanner scanner=new Scanner(System.in);
     static  String[] questions = {
            "What is the capital of France ?",
            "Which planet is known as the Red Planet ?",
            "What is the chemical symbol for water ?",
            "Who wrote ' To Kill a Mockingbird '?",
            "What is the tallest mammal ?",
    };
     static  String[] answers = {
            "Paris",
            "Mars",
            "H2O",
            "Harper Lee",
            "Giraffe",
    };
      int points=0;
    int amt=0;
    static int x=0;
    static int y=0;
    static int z=0;
    static int z1=0;
    static int z2=0;
    void practiceque(){
        System.out.println("....................Questions....................");
        System.out.println("Questions:                                   points: "+points);
        int c=1;
        for(int i=0;i<questions.length;i++){
            System.out.println(c+++". "+questions[i]+"  40 pts");
        }
        System.out.println("6. Back");
        int choice1=scanner.nextInt();
        switch (choice1) {
            case 1 -> {
                System.out.println(questions[0]);
                scanner.nextLine();
                String ans = scanner.nextLine().trim();
                if (ans.equalsIgnoreCase(answers[0])) {
                    x++;
                    if (x == 1) {
                        points += 40;
                    }
                    System.out.println("Correct!");
                } else {
                    System.out.println("Wrong Answer!");
                }
                practiceque();
            }
            case 2 -> {
                System.out.println(questions[1]);
                scanner.nextLine();
                String ans = scanner.nextLine().trim();
                if (ans.equalsIgnoreCase(answers[1])) {
                    y++;
                    if (y == 1) {
                        points += 40;
                    }
                    System.out.println("Correct!");
                } else {
                    System.out.println("Wrong Answer!");
                }
                practiceque();
            }
            case 3 -> {
                System.out.println(questions[2]);
                scanner.nextLine();
                String ans = scanner.nextLine().trim();
                if (ans.equalsIgnoreCase(answers[2])) {
                    z++;
                    if (z == 1) {
                        points += 40;
                    }
                    System.out.println("Correct!");
                } else {
                    System.out.println("Wrong Answer!");
                }
                practiceque();
            }
            case 4 -> {
                System.out.println(questions[3]);
                scanner.nextLine();
                String ans = scanner.nextLine().trim();
                if (ans.equalsIgnoreCase(answers[3])) {
                    z1++;
                    if (z1 == 1) {
                        points += 40;
                    }
                    System.out.println("Correct!");
                } else {
                    System.out.println("Wrong Answer!");
                }
                practiceque();
            }
            case 5 -> {
                System.out.println(questions[4]);
                scanner.nextLine();
                String ans = scanner.nextLine().trim();
                if (ans.equalsIgnoreCase(answers[4])) {
                    z2++;
                    if (z2 == 1) {
                        points += 40;
                    }
                    System.out.println("Correct!");
                } else {
                    System.out.println("Wrong Answer!");
                }
                practiceque();
            }
            case 6 -> {

            }
            default -> {
                System.out.println("Enter valid input!");
                practiceque();
            }
        }
    }
    void attemptquiz(){
        System.out.println("====================Quiz====================");
        int score = 0;
        scanner.nextLine();
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            String userAnswer = scanner.nextLine().trim();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is: " + answers[i]);
            }
        }

        System.out.println("Quiz completed!");
        System.out.println("Your score is: " + score + "/" + questions.length);

    }
    void searchque(){
        System.out.println("******************** Search ********************");
        System.out.println("1. Search By KeyWord");
        System.out.println("2. Search By Question");
        System.out.println("3. Back");
        int choice=scanner.nextInt();
        switch(choice){
            case 1:{
        System.out.println("Enter keyword related Question:");
        scanner.nextLine();
        String name =scanner.next();
        String[] s=name.split("\\s+");
      //  System.out.println(Arrays.toString(s));
        int a=0;
        for(int i=0;i<s.length;i++){
            for(int j=0;j<questions.length;j++){
                String[] q=questions[j].split("\\s+");
              //  System.out.println(Arrays.toString(q));
                for(int k=0;k<q.length;k++){
                    if(s[i].equalsIgnoreCase(q[k])){
                        a=1;
                        System.out.println(questions[j]);
                    }
                }

            }
        }if(a!=1){
            System.out.println("No question Found!");
        }
                searchque();
            }break;
            case 2:{
                int a=0;
                System.out.println("Enter Question: ");
                scanner.nextLine();
                String que=scanner.nextLine().trim();
                for(int i=0;i<questions.length;i++){
                    if(questions[i].equalsIgnoreCase(que)){
                        System.out.println(questions[i]);
                    }
                    else{
                        a++;
                    }
                }if(a==questions.length){
                    System.out.println("No Question Found!");
                }
                searchque();
            }break;
            case 3:{

            }break;
            default:{
                System.out.println("Enter valid Input!");
                searchque();
            }
        }

    }
    void store(){

        System.out.println("-------------------Store-------------------");
        System.out.println("1. Quiz Mania T-Shirt - 50 pts");
        System.out.println("2. Quiz Mania Bottle - 40 pts");
        System.out.println("3. Quiz Mania Bag Pack - 60 pts");
        System.out.println("4. Quiz Mania Book Set - 30 pts");
        System.out.println("5. Check Out");
        System.out.println("6. Exit");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:{
                System.out.println("Enter Quantity :");
                int q= scanner.nextInt();
                if(q<=0){
                    System.out.println("Enter valid Quantity!");
                    store();
                }
                amt+=(q*50);
                System.out.println("amount: "+amt);
                System.out.println("Successfully added to cart!");
                store();
            }break;
            case 2:{
                System.out.println("Enter Quantity :");
                int q= scanner.nextInt();
                if(q<=0){
                    System.out.println("Enter valid Quantity!");
                    store();
                }
                amt+=(q*40);
                System.out.println("amount: "+amt);
                System.out.println("Successfully added to cart!");
                store();
            }break;
            case 3:{
                System.out.println("Enter Quantity :");
                int q= scanner.nextInt();
                if(q<=0){
                    System.out.println("Enter valid Quantity!");
                    store();
                }
                amt+=(q*60);
                System.out.println("amount: "+amt);
                System.out.println("Successfully added to cart!");
                store();
            }break;
            case 4:{
                System.out.println("Enter Quantity :");
                int q= scanner.nextInt();
                if(q<=0){
                    System.out.println("Enter valid Quantity!");
                    store();
                }
                amt+=(q*30);
                System.out.println("amount: "+amt);
                System.out.println("Successfully added to cart!");
                store();
            }break;
            case 5:{
                System.out.println("Your Total Bill: "+amt+"      Available Points: "+points);
                if(amt<=points){
                    points-=amt;
                    System.out.println("Your item will be delivered within 3-7 days.");
                    System.out.println("Points: "+points);
                    amt=0;
                }else{
                    amt=0;
                    System.out.println("You don't have enough points!");
                }
            }break;
            case 6:{

            }break;
            default:{
                System.out.println("Enter valid Input!");
                store();
            }
        }
    }

}


public class individual {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        quizxx q=new quizxx();
        while(true){
            System.out.println("::::::::::::::::::::Home Page::::::::::::::::::::");
            System.out.println("1. Practice Questions");
            System.out.println("2. Attempt Quiz");
            System.out.println("3. Search Questions");
            System.out.println("4. Store");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    q.practiceque();
                }
                case 2 -> {
                    q.attemptquiz();
                }
                case 3 -> {
                    q.searchque();
                }
                case 4 -> {
                    q.store();
                }
                case 5 -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println("Enter valid Input!");
                }
            }

    }
    }
}
