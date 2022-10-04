package com.resttemplate.client.platform161.request.usertoken;


import com.resttemplate.client.platform161.models.tokenModels.UserDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class GetUserTokenRequest {

    private UserDto user;

    public GetUserTokenRequest(String username, String password) {
        UserDto user = new UserDto();
        user.setLogin(username);
        user.setPassword(password);

        this.user = user;
    }
}
