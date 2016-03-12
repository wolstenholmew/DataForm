package freshstart.forms;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author WayneWolstenholme
 */
public class ComposeMail {
    
    private Message message;
    
    public ComposeMail(Session session, String subject, String from, String recipient) throws Exception {
        this.message = new MimeMessage(session);
        message.setSubject(subject);
        message.setFrom(new InternetAddress(from));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
    }
    
    public Message getMessage() {
        return this.message;
    }
    
}
