package dinosaur;

public class test6_3 {

    public static void main(String[] args) {
        int[] dinoAges = {15, 20, 9, 11, 15, 4, 6, 7, 13, 17};

        // Call the avrDinoAges method and print the result
        double averageAge = avrDinoAges(dinoAges);
        System.out.println("평균 나이는 " + averageAge + "세 이다.");
    }

    public static double avrDinoAges(int[] ages) {

        int sum = 0;

        // Calculate the sum of ages
        for (int age : ages) {
            sum += age;
        }

        // Calculate the average
        double average = (double) sum / ages.length;
        return average;
    }
}

