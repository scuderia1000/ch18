/**
 * Created on Dec 29, 2011
 */
package com.apress.prospring3.ch18.service;

import com.apress.prospring3.ch18.domain.Hobby;

import java.util.List;

/**
 * @author Clarence
 *
 */
public interface HobbyService {

	public List<Hobby> findAll();
	
}
