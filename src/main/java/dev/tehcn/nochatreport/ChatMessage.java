package dev.tehcn.nochatreport;

import com.comphenix.protocol.wrappers.WrappedChatComponent;

public class ChatMessage {
  private WrappedChatComponent component;
  
  private String sender;
  
  private String message;
  
  private int hash;
  
  public ChatMessage(String sender, String message, int hash) {
    this.sender = sender;
    this.message = message;
    this.hash = hash;
  }
  
  public ChatMessage(WrappedChatComponent component, String sender, String message, int hash) {
    this.component = component;
    this.sender = sender;
    this.message = message;
    this.hash = hash;
  }
  
  public WrappedChatComponent getComponent() {
    return this.component;
  }
  
  public void setComponent(WrappedChatComponent component) {
    this.component = component;
  }
  
  public String getSender() {
    return this.sender;
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public int getHash() {
    return this.hash;
  }
  
  public void setHash(int hash) {
    this.hash = hash;
  }
}
