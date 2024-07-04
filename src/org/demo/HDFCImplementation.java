package org.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HDFCImplementation {
	public static void main(String[] args) throws IOException {
		
		HDFCBankingApp h = new HDFCBankingApp();
		h.readDataFormDb();
		h.setUsername("Ravi");
		h.setPassword("Ravi@101");
		
		HDFCBankingApp h1 = new HDFCBankingApp();
		h1.readDataFormDb();
		h1.setUsername("Ramu");
		h1.setPassword("Ramu@102");
		
		HDFCBankingApp h2 = new HDFCBankingApp();
		h2.readDataFormDb();
		h2.setUsername("Somu");
		h2.setPassword("Somu@103");
		
		HDFCBankingApp h3 = new HDFCBankingApp();
		h3.readDataFormDb();
		h3.setUsername("Somu");
		h3.setPassword("Somu@105");
		
		System.out.println("====User Defined List====");
		List<HDFCBankingApp> li = new ArrayList<>();
		li.add(h);
		li.add(h1);
		li.add(h2);
		li.add(h3);
		for (int i = 0; i < li.size(); i++) {
			HDFCBankingApp hdfcBankingApp = li.get(i);
			hdfcBankingApp.setBalance(1);
			System.out.println(hdfcBankingApp.getBalance());
		}
		System.out.println();
		
		System.out.println("====User Defined Set====");
		Set<HDFCBankingApp> hdfcBankingApp = new LinkedHashSet<>();
		hdfcBankingApp.add(h);
		hdfcBankingApp.add(h1);
		hdfcBankingApp.add(h2);
		hdfcBankingApp.add(h3);
		for (HDFCBankingApp s1 : hdfcBankingApp) {
			s1.setBalance(1);
			System.out.println(s1.getBalance());
		}
		System.out.println();
		
		System.out.println("====User Defined Map====");
		Map<Integer, HDFCBankingApp> m = new LinkedHashMap<>();
		m.put(100, h);
		m.put(200, h1);
		m.put(300, h2);
		m.put(400, h3);
		Collection<HDFCBankingApp> values = m.values();
		for (HDFCBankingApp hdfcBankingApp1 : values) {
			hdfcBankingApp1.setBalance(1);
			System.out.println(hdfcBankingApp1.getBalance());
		}
	}
	private void sysout() {
		System.out.println("dev");
		System.out.println("dream");

	}
}
