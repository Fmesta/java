package Creation_client_class;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        //Array

        test_set(5);
        test_set_account(7);

    }



    private static void test_set(int j) {
        for (int i = 0; i < j; ++i) {
            Client[] clients = new Client[]{new Client("name" + i, "firstname" + i, 47 + i)};
            System.out.println(Arrays.toString(clients));
        }
    }

    private static void test_set_account(int j) {
        for (int i = 0; i < j; ++i) {
            Account[] account = new Account[]{new Account("Label"+i,new Client("name","Last_name", 41+ i), 45+i)};
            System.out.println(Arrays.toString(account));
        }
    }


}


