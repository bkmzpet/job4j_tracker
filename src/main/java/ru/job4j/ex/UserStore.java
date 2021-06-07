package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login)
            throws UserNotFoundException {
        User result = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                result = user;
                break;
            }

        }
        if (result == null) {
            throw new UserNotFoundException("пользователя не найдено");
        }
        return result;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || (user.getUsername().length() < 3)) {
            throw new UserInvalidException("пользователь не валидный");
        }
        return true;

    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", false)
        };
        try {
            findUser(users, "Petr Arsentev");
            validate(users[0]);
        } catch (UserInvalidException ea) {
            ea.printStackTrace();

        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}

