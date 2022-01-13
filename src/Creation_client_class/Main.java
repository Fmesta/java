package Creation_client_class;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Array

        test_set(5);
    }

    private static void test_set(int j) {
        for (int i = 0; i < j; ++i) {
            Client[] clients = new Client[]{new Client("name" + i, "firstname" + i, 47 + i)};
            System.out.println(Arrays.toString(clients));
        }


    }

}


