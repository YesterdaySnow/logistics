package util;

import java.util.List;

import entity.Orderform;

public class Page {
	private int iCurrPageNo;
	private int count;
    private int pageSize;
    private int pageCount;
    private List<Orderform> orderforms;
	public List<Orderform> getOrderforms() {
		return orderforms;
	}
	public void setOrderforms(List<Orderform> orderforms) {
		this.orderforms = orderforms;
	}
	public int getiCurrPageNo() {
		return iCurrPageNo;
	}
	public void setiCurrPageNo(int iCurrPageNo) {
		if(iCurrPageNo<1)
		{
			iCurrPageNo = 1;
		}
		if(iCurrPageNo>pageCount)
		{
			iCurrPageNo = pageCount;
		}
		this.iCurrPageNo = iCurrPageNo;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
		this.pageCount = count % pageSize == 0 ? count / pageSize : count / pageSize + 1;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
    
}
