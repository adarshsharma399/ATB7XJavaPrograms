package ex_18082024;

public class Lab156 {
    public static void main(String[] args) throws Exception {
        try {
            String s1 = null;
            if (s1 == null) {
                throw new Exception("Add a not null string");  //If you will not give Exception, JVM will give the exception
            }
            s1.trim(); //Unchecked
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}


//We can use throws or try/catch here