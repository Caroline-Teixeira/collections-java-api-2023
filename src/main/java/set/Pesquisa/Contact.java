package main.java.set.Pesquisa;

public class Contact {

    //  Cada contato possui atributos como nome e número de telefone. 

    private String name;
    private int phone;

    
    // Construtor
    public Contact(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }
    


    public String getName() {
        return name;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return String.format("[Nome: %s | Tel: %d ]", name, phone);
        
    }

    

}
