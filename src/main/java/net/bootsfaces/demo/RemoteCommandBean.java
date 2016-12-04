package net.bootsfaces.demo;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

@ManagedBean
@ViewScoped
public class RemoteCommandBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int counter=0;

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public void count(ActionEvent event) {
		counter++;
	}
}
