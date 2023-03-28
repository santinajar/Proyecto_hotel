package clases;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class ClientInfo {
    private HashMap<String, List<String>> clients;

    public ClientInfo() {
        this.clients = new HashMap<String, List<String>>();
    }

    public void addClient(String name, String email, String idType, String idNumber) {
        List<String> clientInfo = new ArrayList<String>();
        clientInfo.add(email);
        clientInfo.add(idType);
        clientInfo.add(idNumber);
        clients.put(name, clientInfo);
    }

    public HashMap<String, List<String>> getClients() {
        return this.clients;
    }
}