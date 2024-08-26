package de.linuxfoo.keycloak.storage.user;

import org.apache.commons.codec.digest.Crypt;

public class Sha512CryptExample {

    public static void main(String[] args) {
        String password = "secret";
        String salt = "xyz";

        // Prefix for SHA-512 algorithm
        String saltWithPrefix = "$6$" + salt;

        // Generate the hashed password using SHA-512 with salt
        String hashedPassword = Crypt.crypt(password, saltWithPrefix);

        // Output the hashed password
        System.out.println("Hashed Password: " + hashedPassword);
    }
}
