/*
 * Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package com.intellij.designer.inspector;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * @author spleaner
 */
public interface PropertyRenderer<P extends Property> extends PropertyValidator<P> {
  JComponent getRendererComponent(@NotNull final P property, @NotNull final RenderingContext context);
}
