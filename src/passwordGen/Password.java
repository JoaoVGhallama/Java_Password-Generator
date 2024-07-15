package passwordGen;

public class Password {
    private int value;
    private int random;
    private String password = "";

    private String lower_case = "qwertyuiopasdfghjklzxcvbnm";
    private String upper_case = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private String special = "!@#$%&";


    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public String getPassword(){
        return password;
    }

    public int getRandom(){
        return random;
    }

    //

    public String getLower_case(){
        return lower_case;
    }
    public String getUpper_case(){
        return upper_case;
    }
    public String getSpecial(){
        return special;
    }

    public String generatePassword(){
        if (this.value <= 0){
            System.out.println("Please, insert an value greater than zero");
        }else {
            for (int i = 0; i < this.value; i++){
                random = (int)(3 * Math.random());
                generateRandom();
            }
        }
        return this.password;
    }

    public String generateRandom(){
        switch (random){
            case 0:
                random = (int)(lower_case.length() * Math.random());
                password += String.valueOf(lower_case.charAt(random));
                break;
            case 1:
                random = (int)(upper_case.length() * Math.random());
                password += String.valueOf(upper_case.charAt(random));
                break;
            case 2:
                random = (int)(special.length() * Math.random());
                password += String.valueOf(special.charAt(random));
                break;
        }
        return password;

    }


    public void printPassword(){
        System.out.println(this.password);
    }

}
