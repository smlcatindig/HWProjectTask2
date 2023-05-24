package HWProjectTask2;
/* Create Registration Class in which you would have variables as email,
userName and password that have an access scope only within its own class.
After creating an object of the class user should be able to call methods and in each method
separately pass values to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also, valid password cannot contain userName.

 */
public class Registration {
    private String email;
    private String userName;
    private String password;

   void setEmail(String email){
       if(email.contains("yahoo")){
           this.email=email;
           System.out.println("valid email");
       } else {
           System.out.println("invalid email");
       }
   }
    void setUserName(String userName){
       if(userName.isEmpty()){
           System.out.println("username must not be empty");
       }else if(userName.length()<=6){
           System.out.println("username must be more than 6 characters");
       }else{
           this.userName=userName;
           System.out.println("valid username");
       }
}
    void setPassword(String password){
       if(password.isEmpty()){
           System.out.println("password must not be empty");
       }else if(password.contains(userName.toLowerCase())) {
           System.out.println("password must not contain username");
       }else{
           this.password=password;
           System.out.println("valid password");

       }
    }
}




