/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

/**
 *
 * @author motohashi
 */
@Stateless
public class HelloEjb {
    
    int i = 0;
    
    public void hello() {
        i++;
        System.out.println("＊＊＊＊＊ Hello EJB!!--**"+i);
        Account a = new Account();
        a.setId("a");
        a.setName("aname");
        repository.save(a);
    }
    
   @PersistenceContext
   private EntityManager em;

   private AccountRepository repository;

   @javax.annotation.PostConstruct
   public void init() {
       RepositoryFactorySupport factory = new JpaRepositoryFactory(em);
      this.repository = factory.getRepository(AccountRepository.class);
   }
}
