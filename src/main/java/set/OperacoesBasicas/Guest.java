package main.java.set.OperacoesBasicas;

public class Guest {

    private String name;
    private int invitationCode;
    
    //Construtor
    public Guest(String name, int invitationCode) {
        this.name = name;
        this.invitationCode = invitationCode;
    }

    //Get e set
    public String getName() {
        return name;
    }

    public int getInvitationCode() {
        return invitationCode;
    }

    @Override
    public String toString() {
        return String.format("[Nome: %s | Convite nº : %d ]", name, invitationCode);
    }

    

}
