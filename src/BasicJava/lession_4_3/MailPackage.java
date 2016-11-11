package BasicJava.lession_4_3;

/**
 * Посылка, содержимое которой можно
 * получить с помощью метода `getContent`
 * Created by btow on 09.11.2016.
 */
public class MailPackage extends AbstractSendable {

    private final Package content;

    public MailPackage(String from, String to, Package content) {
        super(from, to);
        this.content = content;
    }

    public Package getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MailPackage that = (MailPackage) o;

        if (!content.equals(that.content)) return false;

        return true;
    }

}