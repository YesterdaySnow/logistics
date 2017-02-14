package dao;

import java.util.List;

import entity.Orderform;

public interface OrderformDao {
	List<Orderform> query(final int pageSize,final int iCurrPage);
	public int query();
	public Orderform query(String id);
}
