/*
 * This file is part of LibrePlan
 *
 * Copyright (C) 2013 St. Antoniusziekenhuis
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.libreplan.business.common.entities;

import org.hibernate.validator.NotNull;
import org.libreplan.business.common.BaseEntity;

/**
 * AppProperties Entity, represents application configuration parameters.
 *
 * This property can be used by all applications who needs simple name-value
 * pair configurations. It consists the following properties:
 * <ul>
 * <li>majorId: an indication for some large piece of functionality like "jira"
 * for "jira-connector"</li>
 * <li>minorId: used for sub module within this majorId. It can be null if not
 * used</li>
 * <li>propertyName: holder for the name of a property</li>
 * <li>propertyValue: holder for the value of a property</li>
 * </ul>
 *
 * @author Miciele Ghiorghis <m.ghiorghis@antoniusziekenhuis.nl>
 */
public class AppProperties extends BaseEntity {

    public static AppProperties create() {
        return create(new AppProperties());
    }

    private String majorId;

    private String minorId;

    private String propertyName;

    private String propertyValue;

    /**
     * Constructor for Hibernate. Do not use!
     */
    protected AppProperties() {
    }

    @NotNull(message = "majorId not specified")
    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    public String getMinorId() {
        return minorId;
    }

    public void setMinorId(String minorId) {
        this.minorId = minorId;
    }

    @NotNull(message = "property name not specified")
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    @NotNull(message = "property value not specified")
    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }
}