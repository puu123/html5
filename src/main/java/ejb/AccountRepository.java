/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author motohashi
 */
public interface AccountRepository extends JpaRepository<Account, String> { 

    Account findByName(String name);

}