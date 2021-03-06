package home_work_6;

public class Person {
    private String nick;
    private String password;

    public static final int MIN_VALUE_PASSWORD = 5;
    public static final int MAX_VALUE_PASSWORD = 10;
    public static final int MAX_VALUE_NICK = 100;
    public static final int MIN_VALUE_NICK = 1;

    public Person() {
    }

    /**
     * Конструктор для создания объекта.
     * При создании объекта проверяется длина пароля.
     * Если длина пароля меньше 5, либо больше 10, тогда создается объект с nick == null и password == null     *
     * @param nick     строковый параметр. Может быть любой длины
     * @param password строковый параметр. Длина от 5 до 10 символов
     */
    public Person(String nick, String password) {
        if (password.length() >= MIN_VALUE_PASSWORD && password.length() <= MAX_VALUE_PASSWORD) {
            this.password = password;
        } else {
            System.out.println("Пароль должен быть длиной от 5 до 10 символов!");
            return;
        }
        this.nick = nick;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }
}