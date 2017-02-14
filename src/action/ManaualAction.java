package action;

import java.util.ArrayList;
import java.util.List;

import util.Page;

import com.opensymphony.xwork2.ActionSupport;

import dao.impl.OrderformDaoImpl;

import entity.Orderform;

public class ManaualAction extends ActionSupport{
	private List<Orderform> orderforms = new ArrayList<Orderform>();
	private String id;
	private OrderformDaoImpl orderformdaoimpl;
	public void setId(String id) {
		this.id = id;
	}
	public void setOrderforms(List<Orderform> orderforms) {
		this.orderforms = orderforms;
	}
	public String getId() {
		return id;
	}
	public OrderformDaoImpl getOrderformdaoimpl() {
		return orderformdaoimpl;
	}
	public String query()
	{
		System.out.println("开始action");
		String[] ids = id.split("#");
		System.out.println("size为"+ids.length);
		System.out.println(ids[0]);
		for(int i =0; i < ids.length;i++)
		{
			Orderform orderform = orderformdaoimpl.query(ids[i]);
			orderforms.add(orderform);
		}
		System.out.println("结束action");
		return SUCCESS;
	}
	public List<Orderform> getOrderforms() {
		return orderforms;
	}
	public void setOrderformdaoimpl(OrderformDaoImpl orderformdaoimpl) {
		this.orderformdaoimpl = orderformdaoimpl;
	}
	public void setImpl(OrderformDaoImpl orderformdaoimpl) {
		this.orderformdaoimpl = orderformdaoimpl;
	}
}
