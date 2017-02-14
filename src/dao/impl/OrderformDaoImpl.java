package dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.OrderformDao;
import entity.Orderform;

public class OrderformDaoImpl extends HibernateDaoSupport implements OrderformDao{

	@Override
	public List<Orderform> query(final int pageSize,final int iCurrPage) 
	{
		// TODO Auto-generated method stub
		List<Orderform> list = getHibernateTemplate().executeFind(new HibernateCallback()
		{
			public Object doInHibernate(Session session)
			{
				Query query = session.createQuery("from Orderform");
				int firstResult = (iCurrPage-1)>0 ? (iCurrPage-1) * pageSize : 0;
				query.setFirstResult(firstResult);
				query.setMaxResults(pageSize);
				List list = query.list();
				return list;
			}
		});
		return list;
	}
	public int query() 
	{
		String hql = "select count(orderid) from Orderform";
		long longvalue = ((Long)this.getHibernateTemplate().find(hql).listIterator().next());
		int count = (int) longvalue;
		return count;
	}
	public Orderform query(String id)
	{
		System.out.println("开始query");
		System.out.println("id为"+id);
		String hql = "from Orderform where orderid=" + id;
		Orderform orderform =(Orderform)this.getHibernateTemplate().find(hql).listIterator().next();
		System.out.println(orderform.getDeliveradress());
		System.out.println("结束query");
		return orderform;
	}

}
