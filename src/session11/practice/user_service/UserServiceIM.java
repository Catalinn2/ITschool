package session11.practice.user_service;

public class UserServiceIM implements UserService{
    @Override
    public User createUser(User user) {
        //validate user
        //set special properties user.setCreatedAt(LocalDateTIme.now())
        // save user to database
        // return user
        return null;
    }

    @Override
    public void deleteUser(long id) {
        // logica metodei
    }
}
