package com.kyro.properties;

import java.io.IOException;



public class FileReadManager {
	private FileReadManager() {
		// TODO Auto-generated constructor stub
	}
	public static FileReadManager getinstance() {
		FileReadManager frm = new FileReadManager();
		return frm;

	}
	 public configurationReader getinstanceCR() throws IOException {
		configurationReader cr=new configurationReader();
		return cr;

	}
}
