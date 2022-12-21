package task2;

public class GiftMail implements MailCode{
    private static final String TEMAPLATE = "BLACK FRIDAY! %NAME receive your discount right now!";
    @Override
    public String generate(Client client) {
        return TEMAPLATE.replaceAll("%NAME", client.getName());
    }
}
