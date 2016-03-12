package freshstart.forms;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.mail.Message;

/**
 *
 * @author WayneWolstenholme
 */
public class EmailMain {
    
    private static PrintWriter logger;
    
    private static ComposeMail composeMail;
    private static MailConfigurator mailConfigurator;
    private static SendEmail sendEmail;
    private static Message message;
    
    public static EmailMain getInstance(String from, String recipient, String subject, String msg) {
        EmailMain emailMain = new EmailMain();
        emailMain.mailConfigurator = new MailConfigurator();
        try {
            logger = new PrintWriter(new BufferedWriter(new FileWriter("logger.txt",true)));
            emailMain.composeMail =  new ComposeMail(mailConfigurator.getSession(), subject, from, recipient);
            emailMain.message = emailMain.composeMail.getMessage();
            emailMain.message.setText(msg);
            emailMain.sendEmail = new SendEmail(emailMain.message);
        } catch (Exception e) {
            logger.println("Mail failed to send to:\n");
            logger.println(msg);
            logger.println("\n*****\n");
            logger.println(e.getMessage());
            logger.println(e.getStackTrace());
            logger.println("\n*****\n");
        }
        logger.close();
        return emailMain;
    }
    
}
