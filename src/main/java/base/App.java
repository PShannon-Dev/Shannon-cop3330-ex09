package base;

import java.util.Scanner;

public class App {
    //class scanner
    public Scanner in = new Scanner(System.in);
    public int counter = 0;

    public static void main(String[] args) {
        //creating class instances
        App manageJobs = new App();
        PaintJob firstJob = new PaintJob();

        //set length for a  paint job
        firstJob.setLength(manageJobs.takeInput());
        firstJob.setWidth(manageJobs.takeInput());

        //use class to calculate job
        firstJob.calculateJob(firstJob.length, firstJob.width);
    }

    public int takeInput()
    {
        //starts by asking length
        if(counter == 0) {
            System.out.print("What is the length? ");
            counter ++;
            return in.nextInt();
        }

        //width will be taken if length has already been taken
        else
            System.out.print("What is the width? ");
            counter = 0;
            return in.nextInt();
    }

}
