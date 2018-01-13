package org.dac.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.dac.dao.BaseHibernateDao;

@Entity
@Table(name="user")
public class User {
	@Id
	String id;
	String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) {
		BaseHibernateDao dao = new BaseHibernateDao();
		User user = new User("1","valisha");
		dao.insert(new User("1","valisha"));
		List<User> users = dao.getList(User.class);
		System.out.println(users.get(0).getId());
		user = dao.findById("23",User.class);
		System.out.println(user.getName());
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
}
