public class SocialMedia {
    public String userName;
    public String email;

    public SocialMedia(String name, String mail) {
        userName = name;
        email = mail;
    }

    @Override
    public String toString() {
        return userName + "'s profile:" + "\nUser Name: " + userName + "\nEmail:" + email;
    }
}