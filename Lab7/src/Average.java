/* Average.java */

import java.util.Scanner;

public class Average

{

    /* declaring variables */

    /* array data */

    private int[] data;

    /* mean value */

    private double mean;

    /* total value */

    private int total = 0;

    /* constructor */

    public Average()

    {

        /* defining array */

        data = new int[5];

        /* scanner object for getting input from user to fill the array */

        Scanner scObj = new Scanner(System.in);

        for (int inc = 0; inc < data.length; inc++)

        {

            System.out.print("Enter score number " + (inc + 1) + ": ");

            data[inc] = scObj.nextInt();

        }

        /* to call selectionSort method */

        this.selectionSort();

        /* to call calculateMean method */

        this.calculateMean();

    }

    /* method definition calculateMean */

    public void calculateMean()

    {

        /* variables used */

        int inc, sum = 0;

        for (inc = 0; inc < data.length; inc++)

        {

            sum = sum + data[inc];

        }

        mean = (double) sum / (data.length);

    }

    /* method definition selectionSort */

    public void selectionSort()

    {

        /* variables used */

        int maximumIndex;

        int maximumValue;

        for (int inc = 0; inc < data.length - 1; inc++)

        {

            maximumIndex = inc;

            maximumValue = data[inc];

            for (int index = inc + 1; index < data.length; index++)

            {

                if (data[index] > maximumValue)

                {

                    maximumValue = data[index];

                    maximumIndex = index;

                }

            }

            data[maximumIndex] = data[inc];

            data[inc] = maximumValue;

        }

    }

    /* method definition toString */

    public String toString()

    {

        /* variable used */

        String result;

        result = "Test scores [in descending order] :";

        for (int inc = 0; inc < data.length; inc++)

        {

            result = result + data[inc] + " ";

        }

        result = result + "Average: " + mean;

        return result;

    }

}