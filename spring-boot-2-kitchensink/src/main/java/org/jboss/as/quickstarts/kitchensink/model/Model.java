package org.jboss.as.quickstarts.kitchensink.model;

import org.springframework.beans.BeanUtils;

public interface Model<T> {

    /**
     * When creating a bean using dependency injection and JSF,
     * It can occur that it does not contain the enriched methods and fields of @Entity
     * This can cause the following exception: Unknown entity enhancerbyspringcglib
     * To solve this, a new entity has to be constructed, by copying over the old fields.
     */
    T asEntity();

}
