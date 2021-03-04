package isp.lab8.exercise1;


public class Main {
    public static void main(String[] args) {

        //arguments (encrypt/decrypt) from command line
        String nameOfOperation = args[0];

        if (nameOfOperation.equals("decrypt")) {
            DecryptText.decrypt();
        }else if (nameOfOperation.equals("encrypt")){
            EncryptText.encrypt();
        }

    }
}
