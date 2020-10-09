/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;


import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;


public class DaoGenerico {
    protected HibernateConfiguracao hibernateConfiguracao;
    public DaoGenerico() {
      hibernateConfiguracao = new HibernateConfiguracao();
    }
public void gravar(Object obj) throws HibernateException {
        Session session = hibernateConfiguracao.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(obj);
        transaction.commit();
        session.close();
    }
public void alterar(Object obj) throws HibernateException {
        Session session = hibernateConfiguracao.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(obj);
        transaction.commit();
        session.close();
    }
public void excluir(Object obj) throws HibernateException {
        Session session = hibernateConfiguracao.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(obj);
        transaction.commit();
        session.close();
    }
public List carregarTudoOrdenado(Class clas, String ordem) throws HibernateException {
        Session session = hibernateConfiguracao.openSession();
        Criteria criteria = session.createCriteria(clas);
        criteria.addOrder(Order.asc(ordem));
        List lista = criteria.list();
        return lista;
    }
}
