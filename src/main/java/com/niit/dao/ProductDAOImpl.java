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

import com.niit.model.Product;

@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {
		@Autowired
	private SessionFactory sessionFactory;

	public ProductDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(Product product) {
		//sessionFactory.getCurrentSession().saveOrUpdate(product);
		Session s1=sessionFactory.openSession();
		Transaction t1=s1.beginTransaction();
		s1.saveOrUpdate(product);
		t1.commit();

	}

	@Transactional
	public void delete(int Id) {
		Product ProductToDelete = new Product();
		ProductToDelete.setId(Id);
		//sessionFactory.getCurrentSession().delete(ProductToDelete);
		Session s1=sessionFactory.openSession();
		Transaction t1=s1.beginTransaction();
		s1.delete(ProductToDelete);
		t1.commit();
	}

	@Transactional
	public List<Product> list() {
		@SuppressWarnings("unchecked")
		List<Product> listProduct = sessionFactory.getCurrentSession()
				.createCriteria(Product.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listProduct;
	}

	@Transactional
	public Product get(int Id) {
		// sessionFactory.getCurrentSession().get(Product.class,Id);
		String hql = "from Product where Id=" + "'" + Id + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Product> listProduct = query.list();
		if (listProduct != null && !listProduct.isEmpty()) {
			return listProduct.get(0);
		}
		return null;
	}

	@Transactional
	public List getAllProducts() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		List list=session.createQuery("from Product").list();
		session.close();
		return list;
		}


	@Transactional
	public int deleteProduct(int Id) {
		Session session=sessionFactory.openSession();
		org.hibernate.Transaction tx=session.beginTransaction();
		Product product=(Product)session.load(Product.class, Id);
		session.delete(product);
		tx.commit();
		
		session.close();
		return Id;
			
	}
	@Transactional
	public Product getSingleProduct(int Id) {
		Session session=sessionFactory.openSession();
		Product product=(Product)session.load(Product.class, Id);
		return product;
		}
	@Transactional
	public int updateProduct(Product product) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		System.out.println("hello");
		org.hibernate.Transaction tx=session.beginTransaction();
		System.out.println("hai");
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		session.update(product);
		//seion.flush();
		System.out.println("end,,,,,,,,,,,,,,,,,,,,");
		//session.close();
		tx.commit();
		return 0;
		}

}
