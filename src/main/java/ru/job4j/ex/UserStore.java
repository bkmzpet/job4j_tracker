package ru.job4j.ex;

public class UserStore {
    public static User[] findUser(User[] users, String login) throws UserNotFoundException {
        if (users.equals(login)) {
            throw new UserNotFoundException("Url could not be null");

        }
        return users;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() || (user.getUsername().length() < 3)) {
            throw new UserInvalidException("UserInvalidException");
        }
        return false;

    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User[] user = findUser(users, "Petr Arsentev");
        if (validate(user)) {
            System.out.println("This user has an access");
        }
    }
}
