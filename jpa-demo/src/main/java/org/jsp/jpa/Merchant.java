package org.jsp.jpa;
import javax.persistence.*;
@Entity
@Table(name="merchant")
@NamedQueries(value= {@NamedQuery(name="findByName",query="select m from Merchant m where m.name=?1 "),
		              @NamedQuery(name="VerifyByPhoneAndPassword",query="select m from Merchant m where m.phone=?1 and m.password=?2"),
		              @NamedQuery(name="VerifyByEmailAndPassword",query="select m from Merchant m where m.email=?1 and m.password=?2")})
public class Merchant {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false,unique=true)
	private long phone;
	@Column(nullable=false,unique=true)
	private String gst_no;
	@Column(nullable=false)
	private String email;
	@Column(nullable=false)
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getGst_no() {
		return gst_no;
	}
	public void setGst_no(String gst_no) {
		this.gst_no = gst_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Merchant [id=" + id + ", name=" + name + ", phone=" + phone + ", gst_no=" + gst_no + ", email=" + email
				+ "]";
	}
	
	
	
	

}
