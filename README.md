# Client Server Bacarrat Game

## Requirements
Java SDK 8 or above
Eclipse or IntelliJ IDEA
Pom.xml file the shows the dependencies needed 

## Client Side
* Class files that focus on the client side
              * Client Object
              * GUI_Client Object
* Using the Serializable interface in order to set up a data structure of Clients in order to store all the clients and send it over to the Server side. 
* Implements the GUI side of the Client side which allows the user to interact with the cards and play the game
* Using functions such as run() and send() to run the Client side of the GUI and send the clients to the Server side.

## Server Side
* Class files that define the rules of the game and the server side:
    * Card Object
    * BaccaratDealer Object
    * BaccaratGameRules Objects
    * Server Object
    * GUI_Server Object
    * Uses the thread interface and essential functions such as add(), accept(), updateClients(), and remove(). These functions focus on essential aspects of the server that manages the clients. 
* Using try catch methods in order to catch exceptions when unable to update or add Clients. 
* Using Sockets in order to create a pipeline to accept and manage Clients.
