package com.creationaldesignpattern.builder;

class User{
    private final String userId;
    private final String userName;
    private final String emailId;
    private User(UserBuilder userBuilder){
        this.userId=userBuilder.userId;
        this.userName=userBuilder.userName;
        this.emailId=userBuilder.emailId;
    }
    public String getUserId() {
        return userId;
    }
    public String getUserName() {
        return userName;
    }
    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return "User{" + "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", emailId='" + emailId + '\'' + '}';
    }

    static class UserBuilder{
        private String userId;
        private String userName;
        private String emailId;
        public UserBuilder(){}
        public static UserBuilder builder(){
            return new UserBuilder();
        }
        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }
        public User build(){
            User user=new User(this);
            return user;
        }
    }
}
public class ExampleBuilder {
    public static void main(String[] args) {
        User user=new User.UserBuilder().setEmailId("himu@gmail.com").setUserId("123").setUserName("himu").build();
        System.out.println(user);
        User user1=User.UserBuilder.builder().setEmailId("somu@dev.com").setUserId("124").setUserName("somu").build();
        System.out.println(user1);

    }
}
