package Creation_client_class;

import java.util.Locale;

public class Client {

    private String Name;
    private String First_Name;
    private int client_number;

    public String getName() {
        return Name;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public int getClient_number() {
        return client_number;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public void setClient_number(int client_number) {
        this.client_number = client_number;
    }



      public Client(String first_name, String last_name , int customer_number) {


        this.Name = last_name;
        this.First_Name = first_name;
        this.client_number = customer_number;

    }

    //public Client() {
      //  client_number = client_number;
        //First_Name = First_Name;
        //Name = Name;

  //  }

    public String toString() {
        return getName() +" "+ getFirst_Name() +" "+getClient_number();
    }

}