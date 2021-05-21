package ru.job4j.ex;

public class UserStore {
    public static User[] findUser(User[] users, String login)
            throws UserNotFoundException {
        User result;
        result = null;
        for (int index = 0; index < users.length; index++) {
            if (user.getUsername().equals(login)) {
                users[index] = result;
                break;
            }

        }
        if (result == null) {
            throw new UserNotFoundException("пользователя не найдено");
        }
        return new User[]{result};
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || (user.getUsername().length() < 3)) {
            throw new UserInvalidException("пользователь не валидный");
        }
        return true;

    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            findUser(users, "df");
            validate(users[0]);
        } catch (UserInvalidException ea) {
            ea.printStackTrace();
        } catch (ElementNotFoundException en) {
            en.printStackTrace();
        }
    }
}
