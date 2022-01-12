package Creation_client_class;

public class Client {

    private char Name;
    private char First_Name;
    private int client_number;

    public char getName() {
        return Name;
    }

    public char getFirst_Name() {
        return First_Name;
    }

    public int getClient_number() {
        return client_number;
    }

    public void setName(char name) {
        Name = name;
    }

    public void setFirst_Name(char first_Name) {
        First_Name = first_Name;
    }

    public void setClient_number(int client_number) {
        this.client_number = client_number;
    }






    static void constructor(String last_name, String first_Name, int client_number) {
        System.out.print(last_name + first_Name + client_number);
    }

    Client nouveau = new Client();


    public String toString() {
        return getName() +" "+ getFirst_Name() +" "+getClient_number();
    }

}