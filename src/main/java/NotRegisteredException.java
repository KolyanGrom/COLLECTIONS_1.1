public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String playerName) {
        super("Пользоваетль с именем" + playerName + "не зарегестрирован");
    }
}