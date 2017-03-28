package mbcp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Receiver extends Thread{
    
    MBCP mbcp;
    
    public Receiver(MBCP mbcp){
        this.start();
        this.mbcp = mbcp;
    }
    
    public void run(){
        try {
            DatagramSocket receiverSocket = new DatagramSocket(6789);
            byte[] buffer = new byte[1000];
            while(true){
                DatagramPacket request = new DatagramPacket(buffer,buffer.length);
                receiverSocket.receive(request);
                mbcp.MessageReceived(new String(request.getData()));
            }
        } catch (SocketException ex) {
            Logger.getLogger(Receiver.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Receiver.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
