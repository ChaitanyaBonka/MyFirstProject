package com.niit.dao;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Supplier;
@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {
	public List<Supplier> list1() {
		return null;
	}

	@Autowired
	private SessionFactory sessionFactory;

	public SupplierDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(Supplier supplier) {
		//sessionFactory.getCurrentSession().saveOrUpdate(supplier);
		Session s1=sessionFactory.openSession();
		Transaction t1=s1.beginTransaction();
		s1.saveOrUpdate(supplier);
		t1.commit();
	}

	@Transactional
	public void delete(int id) {
		Supplier SupplierToDelete = new Supplier();
		SupplierToDelete.setId(id);
		//sessionFactory.getCurrentSession().delete(SupplierToDelete);
		Session s1=sessionFactory.openSession();
		Transaction t1=s1.beginTransaction();
		s1.delete(SupplierToDelete);
		t1.commit();
	}

	@Transactional
	public List<Supplier> listSupplier() {
		@SuppressWarnings("unchecked")
		List<Supplier> listSupplier = sessionFactory.getCurrentSession().createCriteria(Supplier.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listSupplier;
	}

	@Transactional
	public Supplier get(int id) {
		String hql = "from Supplier where id=" + "'" + id + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Supplier> listSupplier = query.list();
		if (listSupplier != null && !listSupplier.isEmpty()) {
			return listSupplier.get(0);
		}
		return null;
	}

	@Transactional
	public List getAllSuppliers() {
		Session session = sessionFactory.openSession();
		List list = session.createQuery("from Supplier").list();
		session.close();
		return list;
	}

	@Transactional
	public Supplier getSingleSupplier(int id) {
		Session session = sessionFactory.openSession();
		Supplier supplier = (Supplier) session.load(Supplier.class, id);
		return supplier;
	}

	@Transactional
	public List<Supplier> list() {
		@SuppressWarnings("unchecked")
		List<Supplier> listsupplier = sessionFactory.getCurrentSession().createCriteria(Supplier.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listsupplier;

	}

	@Transactional
	public void update(Supplier supplier) {
		//sessionFactory.getCurrentSession().update(supplier);
		Session s1=sessionFactory.openSession();
		Transaction t1=s1.beginTransaction();
		s1.update(supplier);
		t1.commit();
		
	}

}

