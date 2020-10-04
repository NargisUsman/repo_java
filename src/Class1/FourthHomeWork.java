package Class1;

public class FourthHomeWork {
    public static void main(String[] args) {

        // in class exercise *if
        String name = "Happy";
        boolean result = true;
        int number = 22;
        if (name.length() > 10 && number > 5) {
            System.out.println(name.toUpperCase());
            System.out.println(name.replace('p', 'b'));
        } else {
            result = false;
        }
        System.out.println(result);

        // in class exercise *switch
        String month = "December";
        switch (month) {
            case "December", "January", "February":
                System.out.println("Winter");
                break;
            case "March", "April", "May":
                System.out.println("Spring");
                break;
            case "June", "July", "August":
                System.out.println("Summer");
                break;
            case "September", "October", "November":
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }

        //#1
        double studentScore = 85;
        double maxScore = 100;
        if ((95/100)*100>=studentScore) {
            System.out.println("Grade-A");
        } else if ((85.0/100)*100>=studentScore) {
            System.out.println("Grade-B");
        } else if ((75.0/100)*100>=studentScore) {
            System.out.println("Grade-C");
        } else if ((65.0/100)*100>=studentScore) {
            System.out.println("Grade-E");
        } else if ((50<=studentScore)) {
            System.out.println("Grade-F");
        }

            //#2
            int numBer = 30;
        if (numBer%3==0 && number%5==0) {
            System.out.println("Divisible by 3 and 5");
        } else if (numBer%3==0) {
            System.out.println("Divisible by 3");
        } else if (numBer%5==0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println(numBer);
        }



        //#3
        char gear = 'D';
        String cMode = "Eco";
        switch (gear) {
            case 'P':
                System.out.println("You can park the car");
                break;
            case 'N':
                System.out.println("Put the car in a car wash");
                break;
            case 'R':
                System.out.println("Put the car in reverse");
                break;
            case 'D':
                if (cMode=="Eco") {
                    System.out.println("You are on 'Eco' mode");
                } else if (cMode=="Sport") {
                    System.out.println("You are on 'Sport' mode");
                } else if (cMode=="Snow") {
                    System.out.println("You are on 'Snow' mode");
                }
        }


         String[] names = {"Happy","Peace","Joy","Laugh"};
         for (int i=0 ; i<=names.length-1 ; i++) {
            if (i%2==0) {
                System.out.println(names[i]);
            }


            int [] numbers = {10,9,8,7,6,5,4,3,2,1};
            for (int ab : numbers ) {
                System.out.println(ab);
            }


            for (int d=10; d<1; d--) {
                 System.out.println(names[d]);
             }

            char [] alphabets = {'A','B','C','D','E','F','G'};
            for ( int a=0; a<=alphabets.length-1; a++) {
                System.out.println(alphabets[a]);

                for (char letter : alphabets) {
                    System.out.println(letter);
                }
            }
            int j=0;

            while (j< alphabets.length) {
                System.out.println(alphabets[j]);
                j++;
            }



        }
    }
}
