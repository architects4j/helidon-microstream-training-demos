
package com.otaviojava.workshop.microstream.helidon;

import java.util.Set;

/*-
 * #%L
 * microstream-examples-cdi-javase
 * %%
 * Copyright (C) 2019 - 2021 MicroStream Software
 * %%
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is
 * available at https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 * #L%
 */

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import one.microstream.integrations.cdi.types.Store;


@ApplicationScoped
public class NamesService {
    @Inject
    private Names names;

    @Store
    public void add(final String name) {
        this.names.add(name);
    }

    public Set<String> getNames() {
        return this.names.get();
    }

}