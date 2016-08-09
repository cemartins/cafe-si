/*
 * Copyright 2002-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.integration.samples.cafe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Marius Bogoevici
 * @author Tom McCuch
 * @author Gunnar Hillert
 */
@XmlRootElement(name="Food")
@XmlType(propOrder={"description"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Sandwich implements OrderItem {

	private static final long serialVersionUID = 1L;

	@XmlElement
	private String description;

	@XmlTransient
	private int orderNumber;

	// Default constructor required by Jackson Java JSON-processor
	public Sandwich() {}

	public Sandwich(int orderNumber, String description) {
		this.orderNumber = orderNumber;
		this.description = description;
	}


	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Sandwich " + description;
	}

}
