package action;

import java.util.List;

import service.OrderformService;
import util.Page;

import com.opensymphony.xwork2.ActionSupport;

import entity.Orderform;

public class OrderformAction extends ActionSupport{
	private int pageSize;
	private int iCurrPageNo;
	Page page;
	private OrderformService service;
	public void setService(OrderformService service) {
		this.service = service;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getICurrPageNo() {
		return iCurrPageNo;
	}
	public void setICurrPageNo(int iCurrPageNo) {
		this.iCurrPageNo = iCurrPageNo;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public String queryOrderform()
	{
		page = service.query(pageSize, iCurrPageNo);
		return SUCCESS;
	}
	public OrderformService getService() {
		return service;
	}
}
