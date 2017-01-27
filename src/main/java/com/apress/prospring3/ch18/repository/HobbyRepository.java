/**
 * Created on Dec 29, 2011
 */
package com.apress.prospring3.ch18.repository;

import com.apress.prospring3.ch18.domain.Hobby;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Clarence
 *
 */
public interface HobbyRepository extends CrudRepository<Hobby, String> {

}
