package Creation_client_class;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Array

     Client fatine = new Client("fatine", "mestari", 25);


     Client[] clients = new Client[]{new Client("FNameCust1","LNameCust1",288785),new Client("FNameCust2","LNameCust2",387855)};

        System.out.println(fatine);
        System.out.println(Arrays.toString(clients));


        test_set(5);

    }


    private static void test_set(int j) {
        for(int i=0; i<j; i++){
        Client[] clients = new Client[]{new Client("name"+ i,"firstname"+ i,47+i)};
            System.out.println(Arrays.toString(clients));
         }
   }


}



