package chatappication;
class ChatRoom {
    private static int MAX_CHAT_LOGS = 1000; // The size of the log list is decided to be 1000.
    private String []chatLogs = new String[MAX_CHAT_LOGS]; //a 1000-sized array of String objects "chatLogs" is created.  
    private int totalChats;
    static int chats=0;
    // Our ChatRoom has no defining attributes for now
    public void ChatRoom() {
    }

    // Store the user chat
    public void receiveUserChat(String message) {
// Fill out the method - explain your code (how do you make a ChatRoom object store the message?)        
        if(chats<MAX_CHAT_LOGS) 
        { chatLogs[chats]=message;
            chats++;
        }
        else
        {
        return;
        }
    }

    // Retreive the chat logs
    public void printLog() {
        // Fill out the method - explain your code (how do you make this object retrieve the log?)
        for(int i=0;i<chats;i++)
        {
            System.out.println(chatLogs[i]);
        }

    }
}
