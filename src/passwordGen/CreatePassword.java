package passwordGen;

public class CreatePassword {
    public static void main(String[] args){
        Password password = new Password();

        password.setValue(10);
        password.setSelected(4);
        password.generatePassword();
        password.printPassword();
    }
}