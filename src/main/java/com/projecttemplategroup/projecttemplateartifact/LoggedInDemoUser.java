package com.projecttemplategroup.projecttemplateartifact;

import com.projecttemplategroup.projecttemplateartifact.security.UserRoleEnum;

// todo, demo user entity, use your own user implementation
@Deprecated
public class LoggedInDemoUser {
    public long id;
    public UserRoleEnum role;

    public LoggedInDemoUser(String username) {
        if (username.contains("admin")) {
            this.id = 2;
            this.role = UserRoleEnum.ADMIN;
        } else if (username.contains("user")) {
            this.id = 3;
            this.role = UserRoleEnum.USER;
        } else {
            this.id = -1;
            this.role = null;
        }
    }

    @Override
    public String toString() {
        return "LoggedInDemoUser{" +
                "id=" + id +
                ", role=" + role +
                '}';
    }
}
