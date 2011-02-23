/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.as.naming;

import org.jboss.msc.value.Value;

/**
 * A JNDI injectable which simply uses an MSC {@link Value}
 * to fetch the injected value, and takes no action when the value is returned.
 *
 * @author <a href="mailto:david.lloyd@redhat.com">David M. Lloyd</a>
 */
public final class ValueJndiInjectable implements JndiInjectable {
    private final Value<?> value;

    /**
     * Construct a new instance.
     *
     * @param value the value to wrap
     */
    public ValueJndiInjectable(final Value<?> value) {
        this.value = value;
    }

    /** {@inheritDoc} */
    public Object getInjectedValue() {
        return value.getValue();
    }

    /** {@inheritDoc} */
    public void returnInjectedValue(final Object injectedValue) {
    }
}
