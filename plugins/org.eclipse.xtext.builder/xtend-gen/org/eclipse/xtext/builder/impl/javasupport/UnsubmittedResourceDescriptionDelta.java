/**
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.builder.impl.javasupport;

import com.google.common.base.Preconditions;
import org.eclipse.xtext.builder.impl.javasupport.CompilationUnitDelta;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.impl.ChangedResourceDescriptionDelta;

/**
 * <p>
 * Instances of this delta type are collected for the given compilation unit during reconcilation.
 * </p>
 */
@SuppressWarnings("all")
public class UnsubmittedResourceDescriptionDelta extends ChangedResourceDescriptionDelta implements CompilationUnitDelta {
  private final String compilationUnitName;
  
  public UnsubmittedResourceDescriptionDelta(final String compilationUnitName, final IResourceDescription old, final IResourceDescription _new) {
    super(old, _new);
    Preconditions.<String>checkNotNull(compilationUnitName, "compilationUnitName cannot be null");
    this.compilationUnitName = compilationUnitName;
  }
  
  public String getCompilationUnitName() {
    return this.compilationUnitName;
  }
}