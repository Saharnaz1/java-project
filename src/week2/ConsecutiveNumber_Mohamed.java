package week2;

public class ConsecutiveNumber_Mohamed {

    public static void main(String[] args) {


        int n = 24;

        for (int i = 1; i <= n; i++) {

            String result = "";

            if (i % 2 == 0) {
                result += "Codility";
            }

            if (i % 3 == 0) {
                result += "Test";
            }

            if (i % 5 == 0) {
                result += "Coders";
            }

            if (result.isEmpty()){
                System.out.println(i);
            }else {
                System.out.println(result);
            }

            //System.out.println(result.isEmpty() ? i : result);

        }

    }
}