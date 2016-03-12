package freshstart.forms;

import javax.mail.Message;
import javax.mail.Transport;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WayneWolstenholme
 */
public class SendEmail{
    
    public SendEmail(Message message) throws Exception {
        Transport.send(message);
    }
    
}
