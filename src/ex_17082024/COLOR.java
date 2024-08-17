package ex_17082024;

public enum COLOR {
    RED("#ff000"),
    GREEN("#f0d0d0"),
    BLUE("#f0d0ddd");

    private final String hexValue;

    COLOR(String hexValue)
            {
                this.hexValue = hexValue;
            }

    public String getValue(){
        return hexValue;
    }

}


//Enum is basically used to store constant values