package structural.facade;

import java.util.UUID;

public class AuthToken {

    public String authToken;

    public String getAuthToken() {
        return authToken;
    }

    public AuthToken() {
        authToken = UUID.randomUUID().toString();
    }
}
