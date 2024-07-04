package org.demo;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.io.FileUtils;

public class HDFCBankingApp {
	// POJO Class-Encapsulation
	Map<String, Integer> m;

	// Datamembers-Private variables
	// Database-no of column = No of Datamembers
	// Datatype of column = Datatype of variables
	// Columnname=Variableame
	private String username;

	private String password;

	private int balance;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		if (username.equals("Ravi")) {
			this.username = "Ravi Account";
		} else if (username.equals("Ramu")) {
			this.username = "Ramu Account";
		} else if (username.equals("Somu")) {
			this.username = "Somu Account";
		} else {
			this.username = "Invalid Account";
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password.equals("Ravi@101") && username.equals("Ravi Account")) {
			this.password = "Ravi Account is Validated";
		} else if (password.equals("Ramu@102") && username.equals("Ramu Account")) {
			this.password = "Ramu Account is Validated";
		} else if (password.equals("Somu@103") && username.equals("Somu Account")) {
			this.password = "Somu Account is Validated";
		} else {
			this.username = "Invalid Account";
		}
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (this.password.equals(entry.getKey())) {
				this.balance = entry.getValue();
			}
		}
	}

	public void readDataFormDb() throws IOException {
		File f = new File("C:\\Users\\jayas\\eclipse-workspace\\EncapsulationAPI\\file\\HDFCData.txt");
		List<String> readLines = FileUtils.readLines(f);
		m = new LinkedHashMap<String, Integer>();
		String string = readLines.get(0);
		String[] split = string.split(",");
		m.put("Ravi Account is Validated", Integer.parseInt(split[2]));
		String string1 = readLines.get(1);
		String[] split1 = string1.split(",");
		m.put("Ramu Account is Validated", Integer.parseInt(split1[2]));
		String string2 = readLines.get(2);
		String[] split2 = string2.split(",");
		m.put("Somu Account is Validated", Integer.parseInt(split2[2]));
	}
}
