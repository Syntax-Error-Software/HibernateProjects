
package org.jsp.merchantproductapp.controller;

import java.util.Scanner;

import org.jsp.merchantproductapp.dao.MerchantDao;
import org.jsp.merchantproductapp.dto.Merchant;

public class MerchantController {
	public static void main(String[] args) {
		MerchantDao dao = new MerchantDao();
		Scanner s = new Scanner(System.in);
		System.out.println("1.Save Merchant\n2.Update Merchant\n3.FindById\n4.VeriByPhoneAndPassword\n"
				+ "5.VeriByPhoneAndPassword\n6.exit");
		switch (s.nextInt()) {
		case 1: {
			System.out.println("Enter name,phone,email,gst_no and password");
			Merchant m = new Merchant();
			m.setName(s.next());
			m.setPhone(s.nextLong());
			m.setEmail(s.next());
			m.setGst_no(s.next());
			m.setPassword(s.next());
			m = dao.saveMerchant(m);
			System.out.println("Merchant detalis Are Saved Successfully with id:" + m.getId());
			break;
		}
		case 2: {
			System.out.println("Enter id,name,phone,email,gst_no and password");
			Merchant m = new Merchant();
			m.setId(s.nextInt());
			m.setName(s.next());
			m.setPhone(s.nextLong());
			m.setEmail(s.next());
			m.setGst_no(s.next());
			m.setPassword(s.next());
			m = dao.updateMerchant(m);
			if (m != null) {
				System.out.println("Merchant Details Are Updated Successfully");
			}

		}
		break;

		case 3: {
			System.out.println("Enter Merchant Id to display details:");
			int id=s.nextInt();
			Merchant m = dao.findById(id);
			if (m != null) {
				System.out.println(m);
			} else {
				System.err.println("Invalid Merchant is");
			}
			break;

		}
		case 4: {
			System.out.println("Enter phone and password:");
			long phone = s.nextLong();
			String password = s.next();
			Merchant m = dao.verify(phone, password);
			if (m != null) {
				System.out.println(m);
			} else {
				System.err.println("Invalid phone or password");
			}
			break;
		}
		case 5: {
			System.out.println("Enter email and password:");
			String email = s.next();
			String password = s.next();
			Merchant m = dao.verify(email, password);
			if (m != null) {
				System.out.println(m);
			} else {
				System.err.println("Invalid phone or password");
			}
			break;
		}
		}

	}

}
