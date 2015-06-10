
import javax.faces.bean.ManagedBean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bao
 */
@ManagedBean
public class Message {
    private String welcomeMessage;
    public Message() {
        welcomeMessage = "Movie Center, everything you want to know about movies to satisfy your cinematic thirst";
    }
    
    public String getWelcomeMessage() {
        return welcomeMessage;
    }
}
