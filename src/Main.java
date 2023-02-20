public class Main {
    public static void main(String[] args) {
        Thread objNetwork = new Thread(new Network("network"));           /* Creating Network Thread */
        objNetwork.start();                                                      /* Activate Network Thread */
        Thread objServer = new Thread(new Server());                             /* Creating Server Thread */
        objServer.start();                                                       /* Start the Server Thread */
        Thread objSendClient = new Thread(new Client("sending"));       /* Creating Client (send) Thread */
        objSendClient.start();                                                    /* Start the Client (send) Thread */
        Thread objReceiveClient = new Thread(new Client("receiving"));   /* Creating Client (receive) Thread */
        objReceiveClient.start();
    }
}