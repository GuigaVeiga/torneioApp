/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.torneio.web.filter;

import br.com.torneio.util.HibernateUtil;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@WebFilter(urlPatterns = { "*.jsf" })
public class ConexaoHibernateFilter implements Filter {
    private SessionFactory sf;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.sf = HibernateUtil.getSessionFactory();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        	Session currentSession = this.sf.getCurrentSession();

		Transaction transaction = null;

		try {
			transaction = currentSession.beginTransaction();
			chain.doFilter(request, response);
			transaction.commit();
			if (currentSession.isOpen()) {
				currentSession.close();
			}
		} catch (Throwable ex) {
			try {
				if (transaction.isActive()) {
					transaction.rollback();
				}
			} catch (Throwable t) {
				t.printStackTrace();
			}
			throw new ServletException(ex);
		}
    }

    @Override
    public void destroy() {
    }
    
}
