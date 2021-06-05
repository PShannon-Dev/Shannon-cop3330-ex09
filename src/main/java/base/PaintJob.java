package base;

public class PaintJob {
    //conversion factor
    public final double conversion = 350.0;
    public int length, width, flag = 0;//flag for showing if input is correct.

    //setter and getter for instance variables
    public int getLength() {
        return length;
    }

    //setter will state that the
    public void setLength(int length) {
        if (length > 0)
            this.length = length;
        else {
            System.out.println("Enter valid length...");
            flag = 1;
        }

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0)
            this.width = width;
        else {
            System.out.println("Enter valid width...");
            flag = 1;
        }
    }

    public void calculateJob(int length, int width)
    {
        int area = squareFootage(length, width);
        int buckets = (int) Math.ceil(area/conversion);

        paintBuckets(buckets, area);

    }
    //methods
    public int squareFootage(int length, int width){
        return length * width;
    }

    public void paintBuckets(int buckets, int area) {
        if (flag == 0) {
            System.out.println("You will need " + buckets + " gallons of paint to cover " + area + " square feet.");
        }
        else
            ;
    }
}
