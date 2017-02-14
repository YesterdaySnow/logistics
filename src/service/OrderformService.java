package service;

import util.Page;
import dao.impl.OrderformDaoImpl;

public class OrderformService {
	private OrderformDaoImpl dao;
	
	public OrderformDaoImpl getDao() {
		return dao;
	}
	public void setDao(OrderformDaoImpl dao) {
		this.dao = dao;
	}

	public Page query(int pageSize, int iCurrPageNo)
	{
		Page page = new Page();
		page.setCount(dao.query());
		page.setPageSize(pageSize);
		page.setiCurrPageNo(iCurrPageNo);
		page.setOrderforms(dao.query(pageSize,page.getiCurrPageNo()));
		return page;
	}
	
}
